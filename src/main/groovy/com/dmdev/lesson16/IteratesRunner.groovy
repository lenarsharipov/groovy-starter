package com.dmdev.lesson16

import com.dmdev.lesson10.Person

class IteratesRunner {
    static void main(String[] args) {
        assert [1, 4, 7, 8, 9].any { it % 2 == 0 }
        assert [1, 4, 7, 8, 9].find({ it % 2 == 0 }) == 4
        assert [1, 4, 7, 8, 9].findAll({ it % 2 == 0 }) == [4, 8]
        assert (2..4).collect() == [2, 3, 4]

        def person = new Person(25)
        person.each { println it }

        // isCase, switch, in, grep
        assert ['asd', 'dsf', '123', '546', '234df'].grep(~/\d+/) == ['123', '546']

    }
}