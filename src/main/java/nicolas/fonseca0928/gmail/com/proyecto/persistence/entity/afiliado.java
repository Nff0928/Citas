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

@Table(name ="Afiliados")
@ToString
@Entity

public class afiliado {
    

    @Id
    @Column(name = "afiId", nullable = false)
    private int identificacion;

    @Column(name = "afiNombre", nullable = false)
    private String nombre;

    @Column(name = "afiEstado", nullable = false)
    private boolean estado; 

   



}
