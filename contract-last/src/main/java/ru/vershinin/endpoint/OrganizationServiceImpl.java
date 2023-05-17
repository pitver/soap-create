package ru.vershinin.endpoint;

import org.springframework.stereotype.Service;
import ru.vershinin.dto.OrganizationRequest;
import ru.vershinin.dto.OrganizationResponse;

import javax.jws.WebService;

@Service
@WebService(endpointInterface = "ru.vershinin.endpoint.OrganizationService")
public class OrganizationServiceImpl implements OrganizationService {
    @Override
    public OrganizationResponse getOrganizationByInn(OrganizationRequest request) {
        // здесь вы можете использовать ИНН из request для получения информации об организации из базы данных или другого источника
        OrganizationResponse response = new OrganizationResponse();
        response.setName("Название организации");
        response.setAddress("Адрес организации");
        response.setInn(request.getInn());
        return response;
    }
}

