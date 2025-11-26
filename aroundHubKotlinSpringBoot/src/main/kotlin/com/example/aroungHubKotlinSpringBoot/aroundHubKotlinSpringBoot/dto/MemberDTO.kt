package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.dto

class MemberDTO(
    val name: String,
    val email: String,
    val organization : String
){
    @Override
    override fun toString() : String{
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", organization='" + organization + '\'' +
                ')'
    }
}