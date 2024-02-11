package otela.config

import otela.client.OtelBApiClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestClient
import org.springframework.web.client.support.RestClientAdapter
import org.springframework.web.service.invoker.HttpServiceProxyFactory

@Configuration
class RestClientConfig {

    @Bean
    fun otelARestClient(builder: RestClient.Builder): OtelBApiClient {
        val restClient = builder
            .baseUrl("http://otel-b.default.svc.cluster.local:8080")
            .build()
        val adapter = RestClientAdapter.create(restClient)
        val factory = HttpServiceProxyFactory.builderFor(adapter).build()

        return factory.createClient(OtelBApiClient::class.java)
    }
}
