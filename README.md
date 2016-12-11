# Spring Boot Tutorial
A tutorial on how to start up with Spring Boot, assembled after many hours of being burned by other poor tutorials.

### Introduction
So you want to use Spring Boot. Possibly you've heard about the Spring framework and Spring MVC, but you're a little wary of writing tons of XML. That's why I wanted to learn about it. Spring Boot seemed like a cleaner, simpler, easier to implement version of Spring MVC. And that's true, if you have a good guide on how to use it. But I was pretty disappointed with what I saw out there on the internets. Even the Getting Started guides on the [Spring website](http://spring.io) were missing a few key points to explain how to take Spring Boot beyond Hello World. This guide is assembled based on my experience, and hopefuly will make the process of implementing Spring fun and exciting, rather than frustrating as it was for me.

### Tools and Technologies
A couple of quick notes before we get started. I build my Spring Boot application using [Intellij IDE](http://www.jetbrains.com/idea/), and the dependencies play very nicely with that environment. I've seen other tutorials use Eclipse, so I'm sure it works well in most Java IDEs, but I will be using Intellij in all my examples.

Second, Spring is written so you can use Java or Groovy, and you can build with Maven or Gradle. I will be using strictly Java with Maven. Spring can use a number of different view technologies, and they warn against using JSPs for some compatibility issues, but I haven't run into any problems using JSPs and the weakest documentation is on how to use Spring with JSPs, so that's what I'm using here.

Finally, I don't believe you need [Tomcat](http://tomcat.apache.org) downloaded in order to run Spring, but I've always had it so it can't hurt to have it on your machine.

### Contents
