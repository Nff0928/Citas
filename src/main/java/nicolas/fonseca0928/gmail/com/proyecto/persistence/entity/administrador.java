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

@Table(name ="Administrador")
@ToString
@Entity


public class administrador {
    
    
    @Id
    @Column(name = "adminId", nullable = false)
    private int identificacion;

    @Column(name = "adminNombre", nullable = false)
    private String nombre;

    @Column(name = "adminCorreo", nullable = false)
    private String correo;
    


}
