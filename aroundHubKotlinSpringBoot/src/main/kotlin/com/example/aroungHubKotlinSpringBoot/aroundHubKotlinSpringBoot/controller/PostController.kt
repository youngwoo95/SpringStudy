package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.controller

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.dto.MemberDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/post-api")
class PostController {

    @PostMapping(value = ["/default"])
    fun postMethod() : String {
        return "Hello World"
    }

    // http://localhost:8080/api/v1/post-api/member
    @PostMapping(value = ["/member"])
    fun postMember(@RequestBody postData : Map<String, Object>): String{
        var sb = StringBuilder()

        postData.entries.forEach { it -> sb.append(it.key + ":" + it.value + "\n")}

        return sb.toString()
    }

    // http://localhost:8080/api/v1/post-api/member2
    @PostMapping(value=["/member2"])
    fun postMemberDto(@RequestBody memberDTO : MemberDTO) : String {
        return memberDTO.toString()
    }
}