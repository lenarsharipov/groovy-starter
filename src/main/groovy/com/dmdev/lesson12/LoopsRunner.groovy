package com.dmdev.lesson12

class LoopsRunner {

    static void main(String[] args) {
        def list = [1, 2, 3, 4]
//        for (int i = 0; i < list.size(); i++) {
//
//        }
        // стандартный вариант заменили на новый:
        for (i in 0..<list.size()) { // под капотом создается Range
            println i
        }

        // этот вариант нежелателен в груви
        for (Integer value : list) {
            println value
        }
        // предпочтительный в груви for each
        for (value in list) {
            println value
        }

        println "*".repeat(100)

        0.upto(list.size()) {
            println it
        }

        println "*".repeat(100)

        list.size().downto(0) {
            println it
        }

        list.size().times {
            println it
        }

        0.step(5, 2) {
            println it
        }
     }
}
