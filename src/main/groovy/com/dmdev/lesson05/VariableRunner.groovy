package com.dmdev.lesson05

import java.sql.Date as SqlDate

class VariableRunner {

    def field

    /**
     * byte, short, int, long, BigInteger
     * float, double, BigDecimal
     * char
     * boolean
     */
    static void main(String[] args) {
        int value = 5 // == Integer - происходит авто упаковка
        value.intValue()
        // в груви дефолтные импорты увеличены. Если в java по-умолчанию загружается только java.lang
        // то в груви - java.lang.*, java.util.*, java.io.*, java.net.*, groovy.lang.*, groovy.util.*,
        // java.math.BigInteger, java.math.BigDecimal
        BigInteger value2 = 36G
        BigDecimal value3 = 3.3G

        // мы импортировали java.sql.Date но использовали алиас чтобы избежать коллизий
        new SqlDate()

        // groovy - это динамический язык, мы можем не указывать явно тип данных для локальных переменных,
        // для параметров методов и полей, возвращаемый тип методов.
        // Но лучше такое использовать только с локальными переменными
        // так как динамика мешает понимать написанный код
        def defValue = 5
        def defValue2 = 36G
        def defValue3 = 3.3G
    }

    static def execute(def param1, def param2) {

    }
}
