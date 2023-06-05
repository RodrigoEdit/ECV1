package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetDiasRequest;
import io.spring.guides.gs_producing_web_service.GetDiasResponse;

@Endpoint
public class DiasEndPoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private DiasRepository diaRepository;

	@Autowired
	public DiasEndPoint(DiasRepository diaRepository) {
		this.diaRepository = diaRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDiasRequest")
	@ResponsePayload
	public GetDiasResponse getDias(@RequestPayload GetDiasRequest request) {
		GetDiasResponse response = new GetDiasResponse();
		response.setDias(diaRepository.findDias(request.getName()));

		return response;
	}
}
