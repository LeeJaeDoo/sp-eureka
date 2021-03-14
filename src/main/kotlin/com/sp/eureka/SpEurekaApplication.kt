package com.sp.eureka

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.cloud.netflix.eureka.server.*

@SpringBootApplication
@EnableEurekaServer
class SpEurekaApplication

fun main(args: Array<String>) {
    runApplication<SpEurekaApplication>(*args)
}
