package com.dmdev.lesson10

class ConditionRunner {
    static void main(String[] args) {
        int x = 10
        if (x) {
            println x
        }

        def person = new Person(19)
        if (person) {
            println "Person has id > 10"
        } else {
            println "Person has id <= 10"
        }

        if (person != null) {
            person.getId()
        }

        person = null
        println person?.getId()

        if (person) {
            println "Person has id > 10"
        } else {
            println "Person has id <= 10"
        }

        println "-----------------"

        def result = x ? x : -1
        result = x ?: -1
        println result
    }
}
