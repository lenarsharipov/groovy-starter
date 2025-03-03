package com.dmdev.lesson17

class OopRunner {

    static void main(String[] args) {
        def student = new Student()
        student.firstName = "Ivan" // setFirstName
        println student.firstName // getFirstName
        println student['firstName']
        println student.'firstName'
        println student.@firstName  // обращение к полу напрямую. Стоит избегать такое

        // не создавая кастомных конструкторов, мы можем инициализировать все поля
        def student1 = new Student(firstName: "Petr", lastName: "Petrov", age: 18, id: 222)
        println student1 // com.dmdev.lesson17.Student(Petr, Petrov, 18)

        student1.properties.each { println it }

        // принуждение - , через массив аргументов
        Student student2 = ['Sveta', 'Svetikova', 30]
        println student2 // com.dmdev.lesson17.Student(Sveta, Svetikova, 30)

        def (firstName, lastName) = student2 // тут используется метод getAt(index) in Student class
        println firstName // Sveta
        println lastName // Svetikova

        assert [student1, student2].collect { it.firstName } == ['Petr', 'Sveta']

    }
}
