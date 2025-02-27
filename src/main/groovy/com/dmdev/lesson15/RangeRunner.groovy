package com.dmdev.lesson15

class RangeRunner {

    static void main(String[] args) {
        def range = 0..10
        range = 0..<10
        println range
        assert range.getClass() == IntRange

        assert range.get(3) == 3
        assert !range.contains(10)

        range.each { println it} // 0 1 2 3 4 5 6 7 8 9

        ('a'..'d').each { println it} // a b c d

        (WeekDay.MO..WeekDay.FR).each { println it} // MO TU WE TH FR
        (WeekDay.WE..WeekDay.MO).each { println it} // WE TU MO

    }
}
