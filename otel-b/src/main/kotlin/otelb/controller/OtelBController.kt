package otelb.controller

import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

private val log = KotlinLogging.logger { }

@RestController
class OtelBController {
    @GetMapping("/world")
    fun getWorld(): String {
        val message = "this is a message from OTel B on thread: ${Thread.currentThread()}"
        log.info { message }
        return message
    }
}