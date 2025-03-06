package com.dmdev.lesson27

// Это технический способ
//def email = new Email()
//email.setFrom("from@mail.ru")
//email.setTo("to@mail.ru")
//email.setSubject("subject")
//
//def body = new EmailBody()
//body.setText("text")
//body.setHtml("html")
//
//email.setBody(body)

import static com.dmdev.lesson27.DslBuilder.mail

// Это через DSL
mail {
    from "from@mail.ru"
    to "to@mail.ru"
    title "title"
    body {
        text "text"
        images (['image1.jpg', 'image2.png'])
        image 'image3.jpg'
    }
}
