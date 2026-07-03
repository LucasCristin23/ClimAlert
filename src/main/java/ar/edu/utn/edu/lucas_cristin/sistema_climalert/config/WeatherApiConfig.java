package ar.edu.utn.edu.lucas_cristin.sistema_climalert.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
@EnableConfigurationProperties(WeatherApiProperties.class)
public class WeatherApiConfig {

    @Bean
    public RestClient weatherApiRestClient(WeatherApiProperties properties) {
        return RestClient.builder()
                .baseUrl(properties.getBaseUrl())
                .build();
    }
}
