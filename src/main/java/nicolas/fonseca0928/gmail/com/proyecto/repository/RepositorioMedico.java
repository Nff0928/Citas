package nicolas.fonseca0928.gmail.com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import nicolas.fonseca0928.gmail.com.proyecto.entity.Medico;

public interface RepositorioMedico extends CrudRepository<Medico, Integer>, JpaSpecificationExecutor<Medico> {

    Medico findByIdentificacionAndNombre(int identificacion, String nombre);
    Medico findByIdentificacion(Integer identificacion);
    boolean existsByIdentificacion(Integer identificacion);
    
}
