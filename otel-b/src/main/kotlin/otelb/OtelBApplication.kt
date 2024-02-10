package otelb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OtelBApplication

fun main(args: Array<String>) {
	runApplication<OtelBApplication>(*args)
}
