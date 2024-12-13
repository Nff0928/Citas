package nicolas.fonseca0928.gmail.com.proyecto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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


public class Administrador {
    
    
    @Id
    @Column(name = "adminId", nullable = false)
    private int identificacion;

    @Column(name = "adminNombre", nullable = false)
    private String nombre;

    @Column(name = "adminCorreo", nullable = false)
    private String correo;
    
    @Column(name = "adminEstado", nullable = false)
    private Boolean estado;

    @OneToOne(targetEntity = Registro.class)
    @JoinColumn(name = "reg_id")
    private Registro registro;

    @ManyToOne(targetEntity = Afiliacion.class)
    @JoinColumn(name = "afili_id")
    private Afiliacion afiliacion;

    public Administrador(int identificacion, String nombre, Boolean estado) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.estado = estado;
    }

}
