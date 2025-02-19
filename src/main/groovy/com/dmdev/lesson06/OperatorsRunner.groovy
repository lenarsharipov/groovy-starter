package com.dmdev.lesson06

assert 1 + 2 == 3
assert 4 - 3 == 1
assert 3 * 5 == 15
assert 3 / 2 == 1.5
assert 3.intdiv(2) == 1
assert 10 % 3 == 1
assert 2**3 == 8

def result1 = (int) (3 / 2)
def result2 = (3 / 2) as int
def result3 = (3 / 2) as Integer
println result1
println result2
println result3
