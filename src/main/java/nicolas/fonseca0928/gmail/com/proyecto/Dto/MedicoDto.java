package nicolas.fonseca0928.gmail.com.proyecto.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class MedicoDto {
    

    private int identificacion;
    private String nombre;
    private String correo;
    private String especialidad;
    private int consultorio;
    
    
}
