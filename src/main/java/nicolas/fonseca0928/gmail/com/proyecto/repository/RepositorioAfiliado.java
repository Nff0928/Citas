package nicolas.fonseca0928.gmail.com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import nicolas.fonseca0928.gmail.com.proyecto.entity.Afiliado;



public interface RepositorioAfiliado  extends CrudRepository<Afiliado, Integer>, JpaSpecificationExecutor<Afiliado> {

    Afiliado findByIdentificacionAndNombre(int identificacion, String nombre);
    Afiliado findByIdentificacion(Integer identificacion);
    boolean existsByIdentificacion(int identificacion);
    
} 
