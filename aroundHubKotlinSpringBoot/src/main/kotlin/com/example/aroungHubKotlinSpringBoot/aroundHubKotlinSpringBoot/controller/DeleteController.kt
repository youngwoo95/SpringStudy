package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/get-api")
class DeleteController {

    // http://localhost:8080/api/v1/get-api/delete/{string 값}
    @DeleteMapping("/delete/{variable}")
    fun DeleteVariable(@PathVariable variable: String) : String
    {
        return variable
    }
}