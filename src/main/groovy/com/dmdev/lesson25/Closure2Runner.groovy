package com.dmdev.lesson25

import com.dmdev.lesson17.Student

class Closure2Runner {

    static void main(String[] args) {
        Closure closure = {
            firstName = "Sveta"

        }

        println closure.thisObject // class com.dmdev.lesson25.Closure2Runner
        println closure.owner // class com.dmdev.lesson25.Closure2Runner
        println closure.delegate // class com.dmdev.lesson25.Closure2Runner

        def student = new Student("Ivan", "Ivanov", 29)
        println student // com.dmdev.lesson17.Student(Ivan, Ivanov, 29, null)

//        closure.delegate = student // Теперь delegate замыкания ссылается на объект student

//        closure.resolveStrategy = Closure.DELEGATE_FIRST // Устанавливается стратегия разрешения,
        // при которой Groovy сначала ищет свойства и методы в delegate, а затем в owner и thisObject.

//        closure() // Замыкание выполняется. Поскольку delegate теперь ссылается на student,
        // Groovy пытается установить значение firstName в объекте student.

        // В Groovy значения thisObject и owner замыкания нельзя изменить.
        // Они определяются автоматически на основе контекста,
        // в котором замыкание было создано, и остаются неизменными
        // на протяжении всего времени жизни замыкания.
//        println closure.thisObject // class com.dmdev.lesson25.Closure2Runner
//        println closure.owner // class com.dmdev.lesson25.Closure2Runner
//        println closure.delegate // com.dmdev.lesson17.Student(Sveta, Ivanov, 29, null)

        student.with closure

        println student // com.dmdev.lesson17.Student(Sveta, Ivanov, 29, null)
        println "*".repeat(100)
        student.getInfo().call()
        // Console output
//        com.dmdev.lesson17.Student(Sveta, Ivanov, 29, com.dmdev.lesson17.Student$_getInfo_closure1@2f465398, null)
//        com.dmdev.lesson17.Student(Sveta, Ivanov, 29, com.dmdev.lesson17.Student$_getInfo_closure1@623a8092, null)
//        com.dmdev.lesson17.Student(Sveta, Ivanov, 29, com.dmdev.lesson17.Student$_getInfo_closure1@a1cdc6d, null)
//        com.dmdev.lesson17.Student(Sveta, Ivanov, 29, com.dmdev.lesson17.Student$_getInfo_closure1@3098cf3b, null)
//        com.dmdev.lesson17.Student$_getInfo_closure1@610f7aa
//        com.dmdev.lesson17.Student$_getInfo_closure1@610f7aa

    }
}
