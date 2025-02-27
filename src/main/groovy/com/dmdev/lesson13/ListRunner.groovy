package com.dmdev.lesson13

class ListRunner {

    static void main(String[] args) {
        def list = [1, 3, 5, 7]
        assert list.getClass() == ArrayList

        // read
        assert list[2] == 5
        assert list.get(2) == 5
        assert list[-1] == 7
        assert list[1..3] == [3, 5, 7]
        assert list[100] == null

        // write
        list += 9
        assert list == [1, 3, 5, 7, 9]

        // можно добавлять сразу несколько элементов через <<
        list << 11 << 23 << 23
        assert list == [1, 3, 5, 7, 9, 11, 23, 23]

        // удаляем все элементы со значением 23
        list -= 23
        assert list == [1, 3, 5, 7, 9, 11]

        // удаляем элементы 1, 3
        list -= [1, 3]
        assert list == [5, 7, 9, 11]

        // продублируем значения списка 3 раза
        list *= 3
        assert list == [5, 7, 9, 11, 5, 7, 9, 11, 5, 7, 9, 11]

        // method from queue
        list.push(999)
        assert list == [999, 5, 7, 9, 11, 5, 7, 9, 11, 5, 7, 9, 11]
        assert list.pop() == 999
        assert list == [5, 7, 9, 11, 5, 7, 9, 11, 5, 7, 9, 11]
        assert list.head() == 5
        assert list.tail() == [7, 9, 11, 5, 7, 9, 11, 5, 7, 9, 11]
        assert list.last() == 11

        // flatten, reverse, intersect, disjoint
        assert [1, 2, [4, 6, 7], 9].flatten() == [1, 2, 4, 6, 7, 9]
        assert [1, 2, 3].reverse() == [3, 2, 1]
        assert [1, 2, 3].intersect([2, 3, 4]) == [2, 3]
        assert [1, 2, 3].disjoint([4, 5, 6]) // true так как нет пресечений с другой коллекцией

        // новые операторы
        def (a, b, c) = [1, 2, 3, 4, 5]
        assert a == 1 && b == 2 && c == 3

        func(*[1, 2])

    }

    static def func(def a, def b) {
        println a
        println b
    }
}
