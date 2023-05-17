package ru.vershinin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import ru.vershinin.endpoint.OrganizationServiceImpl;

import javax.xml.ws.Endpoint;

@Configuration
@EnableWs
public class SoapWebServiceConfig extends WsConfigurerAdapter {


    @Bean
    public Endpoint organizationInfoServiceEndpoint(OrganizationServiceImpl organizationServiceImpl) {
        return Endpoint.publish("http://localhost:8081/OrganizationService", organizationServiceImpl);
    }



}


