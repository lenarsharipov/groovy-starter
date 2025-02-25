package com.dmdev.lesson09

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {

    static void main(String[] args) {
        Function<Integer, Integer> func = value -> value + value
        println func.apply(5)           // 10
        println "-----------------"

        Closure closure = { value = 77 ->
            println value
            value + value
        }
//        println closure.call(6) // 12
        def result =  closure() // 12
        println result
        println "-----------------"

        Stream.of(1, 2, 3, 4)
                .map(closure)
//                .map(String::valueOf)
                .map(String.&valueOf)
                .forEach(System.out::println)

        println "*".repeat(100)

        int x = -1
        def object = check(x > 0, { println(++x) })
        println object
    }

    static def check(boolean condition, Closure closure) {
        if (condition) {
            closure()
        }
    }
}
