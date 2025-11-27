package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
    var LOGGER : Logger = LoggerFactory.getLogger(HelloController::class.java)
)
    {
    @GetMapping("/hello")
    fun hello():String{
        return "Hello Kotlin World"
    }

        @PostMapping("log-test")
        fun logTest(){
            LOGGER.trace("Trace Log")
            LOGGER.debug("Debug Log")
            LOGGER.info("Info Log")
            LOGGER.warn("Warn Log")
            LOGGER.error("ERROR Log")
        }

}