package otelb.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class OtelBController {
    @GetMapping("/world")
    fun getWorld() = "this is a message from OTel B"
}