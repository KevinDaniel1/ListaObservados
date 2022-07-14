package ec.edu.espe.arquitectura.client.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ec.edu.espe.arquitectura.client.dto.PersonaDTO;
import ec.edu.espe.arquitectura.client.dto.TransferenciaDTO;
import ec.edu.espe.arquitectura.client.model.Narcotraficante;

@Service
public class NarcotraficanteService {
    
    private static final String BASE_URL = "http://localhost:8080/Transaccion";

    private final RestTemplate restTemplate;

    public NarcotraficanteService() {
        this.restTemplate = new RestTemplate(getClientHttpRequestFactory());
    }

    public List<TransferenciaDTO> obtainAll() {
        ResponseEntity<TransferenciaDTO[]> response = this.restTemplate.getForEntity(BASE_URL, TransferenciaDTO[].class);
        TransferenciaDTO[] objectArray = response.getBody();
        List<TransferenciaDTO> transaferencia = Arrays.asList(objectArray);
     
        return transaferencia;
    }

    private ClientHttpRequestFactory getClientHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        int connectTimeout = 5000;
        int readTimeout = 5000;
        clientHttpRequestFactory.setConnectTimeout(connectTimeout);
        clientHttpRequestFactory.setReadTimeout(readTimeout);
        return clientHttpRequestFactory;
    }

}
