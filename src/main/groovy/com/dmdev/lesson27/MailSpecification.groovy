package com.dmdev.lesson27

class MailSpecification {
    String from
    String to
    String title
    BodySpecification body

    def from(String from) {
        this.from = from
    }

    def to(String to) {
        this.to = to
    }

    def title(String title) {
        this.title = title
    }

    def body(@DelegatesTo(BodySpecification) Closure closure) {
        this.body = new BodySpecification()
//        closure.delegate = body
//        closure.resolveStrategy = Closure.DELEGATE_ONLY
//        closure.call()
        body.with closure
        body
    }
}
