package com.dmdev.lesson07

def name = "name \"Ivan\""
println name
def name2 = 'Hello "$name"'
println name2

def stringValue = "Hello $name"
println stringValue

println "Ivan ${13 + 5} years old"

def str = """
$name went
home
"""
println str

def str2 = '''
$name went
home again
'''
println str2

def charVal = 'C'
char charVal2 = 'C'

def val = /Hello world $name/
println val
def val2 = $/Hello world $name/$
println val2

// обращаемся к последнему символу
println name[-1] // "
// первый символ
println name[0] // n
// символы с 1-3
println name[1..3] //ame

println name - 'Iv' // name "an"
println name * 3 // name "Ivan"name "Ivan"name "Ivan"