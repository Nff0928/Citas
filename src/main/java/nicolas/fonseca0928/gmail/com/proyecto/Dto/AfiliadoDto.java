package nicolas.fonseca0928.gmail.com.proyecto.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class AfiliadoDto {
    


    private int identificacion;
    private String nombre;
    private int edad;
    private String correo;
    private int celular;
    private String direccion;
    private boolean estado; 
}