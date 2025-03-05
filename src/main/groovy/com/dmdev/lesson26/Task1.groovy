package com.dmdev.lesson26

import com.dmdev.lesson17.Student

/**
 * Добавить метод инициализации make для создания объектов любых классов.
 * Метод должен проксировать вызов на соответствующий конструктор
 */
class Task1 {

    static void main(String[] args) {
        // new HashSet<>([1, 2, 3, 4, 4])
        // надо сделать так def hashSet = HashSet.make([1, 2, 3, 4, 4])
        // def student = Student.make("Ivan", "Ivanov", 20)
        // def student2 = Student.make()

        // Чтобы создать такой метод, нам надо подготовить класс Class.metaClass
        // здесь мы добавляем не метод, а property
        Class.metaClass.make = { Object[] values ->
            println owner
            println thisObject
            println delegate

            delegate.metaClass.invokeConstructor(values) // здесь мы используем именно делегат, а
            // не owner, thisObject. делегаты относятся к тем объектам которые мы будем создавать
        }

        def hashSet = HashSet.make([1, 2, 3, 4, 4])
        def student = Student.make("Ivan", "Ivanov", 20)
        def student2 = Student.make()

        println hashSet
        // console
        // class com.dmdev.lesson26.Task1
        // class com.dmdev.lesson26.Task1
        // class java.util.HashSet

        println student
        // class com.dmdev.lesson26.Task1
        //class com.dmdev.lesson26.Task1
        //class com.dmdev.lesson17.Student

        println student2
        // class com.dmdev.lesson26.Task1
        //class com.dmdev.lesson26.Task1
        //class com.dmdev.lesson17.Student

        // [1, 2, 3, 4]
        //com.dmdev.lesson17.Student(Ivan, Ivanov, 20, com.dmdev.lesson17.Student$_getInfo_closure1@3a6bb9bf, null)
        //com.dmdev.lesson17.Student(null, null, null, com.dmdev.lesson17.Student$_getInfo_closure1@74455848, null)
    }
}
