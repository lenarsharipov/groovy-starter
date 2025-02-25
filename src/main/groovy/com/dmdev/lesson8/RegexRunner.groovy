package com.dmdev.lesson8

import java.util.regex.Pattern

class RegexRunner {
    static void main(String[] args) {
        String value = "one 1 two 22 three 333"
//        String regex = "\\w+ \\d+"
        String regex = /(\w+) (\d+)/ // \w+ \d+/

//        Pattern pattern = Pattern.compile(regex)
        Pattern pattern = ~regex // можно и так, чтобы упростить работу

//        def matcher = pattern.matcher(value)
        def matcher = value =~ regex // можно и так. не используем pattern

        while (matcher.find()) {
            println matcher.group()             // one 1       one     1
            println matcher.group(1)    // two 22      two     22
            println matcher.group(2)    // three 333   three   333
            println "--------------"
        }
    }
}
