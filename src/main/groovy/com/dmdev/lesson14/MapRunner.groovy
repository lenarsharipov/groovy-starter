package com.dmdev.lesson14

class MapRunner {

    static void main(String[] args) {
        // создаем пустой ассоциативный массив
        def emptyMap = [:]
        assert emptyMap.isEmpty()

        def map = ["one": 1, "two": 2, "three": 3]
        assert map.getClass() == LinkedHashMap

        // read
        assert map.get("one") == 1
        assert map["one"] == 1
        assert map."one" == 1
        assert map.one == 1
        assert map.get("qwe", 10) == 10 // здесь get работает как getOrDefault
        assert map == ["one": 1, "two": 2, "three": 3, "qwe": 10]

        // write
        map.one = 111
        map.four = 4
        assert map == ["one": 111, "two": 2, "three": 3, "qwe": 10, "four": 4]

        // новый метод. получаем подмножество, передав множество ключей
        assert map.subMap("one", "two") == ["one": 111, "two": 2]

        // новый оператор, типа спред оператора в списках
        def newMap = ["q": 22, rt: 99, *:map]
        assert newMap == ["q": 22, "rt": 99, "one": 111, "two": 2, "three": 3, "qwe": 10, "four": 4]

    }
}
