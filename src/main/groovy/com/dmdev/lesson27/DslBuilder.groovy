package com.dmdev.lesson27

class DslBuilder {

    static MailSpecification mail(@DelegatesTo(MailSpecification) Closure closure) {
        def mailSpecification = new MailSpecification()
//        closure.delegate = mailSpecification
//        closure.resolveStrategy = Closure.DELEGATE_ONLY
//        closure.call()
        mailSpecification.with closure
        mailSpecification
    }
}
