package otela.client

import org.springframework.web.service.annotation.GetExchange

interface OtelBApiClient {
    @GetExchange("/world")
    fun getWorld(): String
}