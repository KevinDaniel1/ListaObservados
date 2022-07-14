package ec.edu.espe.arquitectura.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ec.edu.espe.arquitectura.client.model.Narcotraficante;

public interface NarcotraficanteRepository extends MongoRepository<Narcotraficante,String>{
    
    List<Narcotraficante> findByNombreCompleto(String nombreCompleto);

}
