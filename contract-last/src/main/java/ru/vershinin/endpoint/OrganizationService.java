package ru.vershinin.endpoint;

import ru.vershinin.dto.OrganizationRequest;
import ru.vershinin.dto.OrganizationResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName = "OrganizationService")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface OrganizationService {

    @WebMethod
    public OrganizationResponse getOrganizationByInn(OrganizationRequest request);
}
