package ec.edu.espe.arquitectura.client.resource;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.client.dto.TransferenciaDTO;
import ec.edu.espe.arquitectura.client.service.NarcotraficanteService;

@RestController
@RequestMapping(path = "/Validacion")
public class NarcotraficanteResource {
    
    private final NarcotraficanteService service;

    public NarcotraficanteResource(NarcotraficanteService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TransferenciaDTO>> obtainNarcotraficante() {
        return ResponseEntity.ok(this.service.obtainAll());
    }

}
