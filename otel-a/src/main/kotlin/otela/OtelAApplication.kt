package otela

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OtelAApplication

fun main(args: Array<String>) {
	runApplication<OtelAApplication>(*args)
}
