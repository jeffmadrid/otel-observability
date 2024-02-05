package com.github.jeffmadrid.otelobservability

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OtelObservabilityApplication

fun main(args: Array<String>) {
	runApplication<OtelObservabilityApplication>(*args)
}
