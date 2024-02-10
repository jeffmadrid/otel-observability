package otela.controller

import otela.client.OtelBApiClient
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

private val log = KotlinLogging.logger { }

@RestController
class OtelAController(
    private val otelBApiClient: OtelBApiClient
) {

    @GetMapping("/")
    fun get(): String {
        log.info { "Hi there!" }
        return "Hi from OTel A"
    }

    @GetMapping("/hello")
    fun getHello(): String {
        val res = otelBApiClient.getWorld()
        val msg = "OTel B returned with $res"
        log.info { msg }
        return msg
    }
}