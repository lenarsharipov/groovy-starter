package com.dmdev.lesson17

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder
import groovy.util.logging.Slf4j

@ToString
@TupleConstructor
// создает конструкторы со всеми комбинациями
@EqualsAndHashCode
//@Canonical
//@Immutable
@Builder
//@Slf4j
class Student implements WithId {
    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }

    def getInfo() {
        Closure closure = {
            println thisObject // == this
            println owner
            println delegate

            Closure secondClosure = {
                println thisObject // == this
                println owner
                println delegate
            }
            secondClosure()
        }
        closure
    }

    static void main(String[] args) {
        def student = builder()
                .lastName("Ivanov")
                .firstName("Ivan")
                .build()
    }
}
