package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.controller

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.dto.MemberDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Objects

@RestController
@RequestMapping("/api/v1/put-api")
class PutController {

    // http://localhost:8080/api/v1/put-api/default
    @PutMapping("/default")
    fun putMethod() : String{
        return "Hello World"
    }
    // http://localhost:8080/api/v1/put-api/member
    @PutMapping("/member")
    fun postMember(@RequestBody postData : Map<String, Objects>) : String{
        var sb = StringBuilder()

        postData.entries.forEach { it -> sb.append(it.key + " : " + it.value + "\n") }
        return sb.toString()
    }

    // http://localhost:8080/api/v1/put-api/member1
    @PutMapping("/member1")
    fun postMemberDto1(@RequestBody memberDTO: MemberDTO) : String{
      return memberDTO.toString()
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping("/member2")
    fun postMemberDto2(@RequestBody memberDTO: MemberDTO) : MemberDTO{
        return memberDTO
    }

    // http://localhost:8080/api/v1/put-api/member3
    @PutMapping("/member3")
    fun postMemberDto3(@RequestBody memberDTO: MemberDTO) : ResponseEntity<MemberDTO>{
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO)
    }


}