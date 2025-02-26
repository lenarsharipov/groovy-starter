package com.dmdev.lesson11

class SwitchRunner {
    static void main(String[] args) {
        int x = 12

        switch (x) {
            case String:    // isInstanceOf
                println 0
                break
            case 5:         // equals == ===
                println 1
                break
            case ~/\d+/:    // pattern.matcher(x.toString()).matches()
                println 2
                break
            case 0..10:     // x >= 0 && x <= 10
                println 3
                break
            case { it % 5 == 0 }:
                println 4
                break
            case [1, 3, 5, 9]:  // list.isCase()
                println 5
                break
            default:
                println "None"
                break
        }

//        Здесь также вызывается у списка метод isCase()
        if (x in [1, 3, 5, 9, 12]) {
            println x
        }

    }
}
