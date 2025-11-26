package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.controller

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.dto.MemberDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/get-api")
class GetController {

    // http://localhost:8080/api/v1/get-api/hello
    @RequestMapping(value = ["/hello"], method = [RequestMethod.GET])
    fun getHello():String {
        return "Hello World"
    }

    // http://localhost:8080/ap1/v1/get-api/name
    @GetMapping(value = ["/name"])
    fun getname(): String{
        return "Flature"
    }

    // http://localhost:8080/api/v1/get-api/variable1/{String 값}
    @GetMapping(value = ["/variable1/{variable}"])
    fun getVariable1(@PathVariable variable : String) : String{
        return variable
    }

    // http://localhost:8080/api/v1/get-api/variable2/{String 값}
    @GetMapping(value = ["/variable2/{variable}"])
    fun getVariable2(@PathVariable("variable") strVar : String) : String{
        return strVar
    }

    /*
    * http://localhost:8080/ap1/v1/get-apt/request1?
    * name=flature&
    * email=thinkground.flature@gmail.com&
    * organization=thinkground
    * */
    @GetMapping(value = ["/request1"])
    fun getRequestParam1(@RequestParam name: String, @RequestParam email: String, @RequestParam organization : String) : String{
        return name + " " + email + " " + organization
    }

    @GetMapping(value = ["/request2"])
    fun getRequestParam2(@RequestParam param : Map<String, String>) : String{
        var sb = StringBuilder()

        param.entries.forEach { it -> sb.append(it.key + ":" + it.value + "\n") }

        return sb.toString()
    }

    @GetMapping(value = ["/request3"])
    fun getRequestParam3(memberDTO : MemberDTO) : String{
        return memberDTO.toString()
    }


}