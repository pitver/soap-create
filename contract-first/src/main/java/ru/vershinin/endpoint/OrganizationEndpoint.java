package ru.vershinin.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.vershinin.gen.GetOrganizationByInnRequest;
import ru.vershinin.gen.GetOrganizationByInnResponse;


@Endpoint
public class OrganizationEndpoint {

    private static final String NAMESPACE_URI = "http://com.example/organization";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetOrganizationByInnRequest")
    @ResponsePayload
    public GetOrganizationByInnResponse getOrganizationByInn(@RequestPayload GetOrganizationByInnRequest request) {

        System.out.println(request);


        GetOrganizationByInnResponse responseOrg = new GetOrganizationByInnResponse();
        responseOrg.setName("iii");
        responseOrg.setType("ooo");
        responseOrg.setNumberOfEmployees(15);


        return responseOrg;
    }

}

