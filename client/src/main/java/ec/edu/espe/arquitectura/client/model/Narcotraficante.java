package ec.edu.espe.arquitectura.client.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "narcotraficante")
@TypeAlias("narcotraficante")
public class Narcotraficante {
    
    @Id
    private String id;

    @Indexed(name = "idxu_narcotraficante_nombreCompleto", unique = true)
    private String nombreCompleto;

    private String sancionado;
}
