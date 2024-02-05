package com.github.jeffmadrid.otelobservability.controller

import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

private val log = KotlinLogging.logger {}

@RestController
class AppController {

    @GetMapping("/")
    fun get() : String {
        log.info { "Hi there!" }
        return "hello world"
    }
}