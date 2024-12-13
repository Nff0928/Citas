package nicolas.fonseca0928.gmail.com.proyecto.operaciones;

import java.util.List;

import nicolas.fonseca0928.gmail.com.proyecto.Dto.AfiliadoDto;
import nicolas.fonseca0928.gmail.com.proyecto.entity.Afiliado;

public interface OperacionesAfiliado {

 

    public AfiliadoDto crear(AfiliadoDto afiliadoDto);
    public AfiliadoDto modificar(AfiliadoDto afiliadoDto);
    public void borrar(AfiliadoDto afiliadoDto);
    public void borrar(Integer pkEntidad);
    public List<AfiliadoDto> buscarTodos();
    public Afiliado buscarID(Integer pkEntidad);


} 
