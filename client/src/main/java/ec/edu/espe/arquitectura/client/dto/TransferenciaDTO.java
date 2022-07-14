package ec.edu.espe.arquitectura.client.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransferenciaDTO {

    private String cuentaOrigen;

    private String cuentaDestino;

    private BigDecimal valor;
}
