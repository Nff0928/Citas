package nicolas.fonseca0928.gmail.com.proyecto.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="Medicos")
@ToString
@Entity

public class medico {
    
    @Id
    @Column(name = "medId", nullable = false)
    private int identificacion;

    @Column(name = "afiNombre", nullable = false)
    private String nombre;

    @Column(name = "afiCorreo", nullable = false)
    private String correo;

    @Column(name = "afiEspeciaidad", nullable = false)
    private String especialidad;
    

}
