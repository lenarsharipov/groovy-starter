package com.dmdev

import groovy.transform.PackageScope

import java.sql.DriverManager

class HelloWorld {

    Integer value

//    @PackageScope
    static void main(String[] args) {
        String value = "Hello World"
        Class<String> clazz = value.getClass()
        assert clazz == String.class
        println "Hello World!"
        println clazz.getClassLoader() // null
        println DriverManager.class.getClassLoader() // jdk.internal.loader.ClassLoaders$PlatformClassLoader@3a93b025
        println HelloWorld.class.getClassLoader() // jdk.internal.loader.ClassLoaders$AppClassLoader@639fee48
    }
}
