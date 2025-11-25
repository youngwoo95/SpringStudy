package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello():String{
        return "Hello Kotlin World"
    }

}