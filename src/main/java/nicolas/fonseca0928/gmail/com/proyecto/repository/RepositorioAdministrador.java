package nicolas.fonseca0928.gmail.com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import nicolas.fonseca0928.gmail.com.proyecto.entity.Administrador;

public interface RepositorioAdministrador extends CrudRepository<Administrador, Integer>, JpaSpecificationExecutor<Administrador> {
    
    Administrador findByIdentificacionAndNombre(int identificacion, String nombre);
    Administrador findByIdentificacion(Integer identificacion);
    boolean existsByIdentificacion(int identificacion);


}
