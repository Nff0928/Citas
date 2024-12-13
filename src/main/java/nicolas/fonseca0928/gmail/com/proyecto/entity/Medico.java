package nicolas.fonseca0928.gmail.com.proyecto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name ="Medicos")
@ToString
@Entity

public class Medico {
    
    @Id
    @Column(name = "medId", nullable = false)
    private int identificacion;

    @Column(name = "medNombre", nullable = false)
    private String nombre;

    @Column(name = "medCorreo", nullable = false)
    private String correo;

    @Column(name = "medEstado", nullable = false)
    private Boolean estado;
    
    @OneToOne(targetEntity = Registro.class)
    @JoinColumn(name = "reg_id")
    @ToString.Exclude
    private Registro registro;

    @ManyToOne(targetEntity = Especialidad.class)
    @JoinColumn(name = "es_id")
    @ToString.Exclude
    private Especialidad especialidad;


    @OneToOne(targetEntity = Consultorio.class)
    @JoinColumn(name = "con_id")
    @ToString.Exclude
    private Consultorio consultorio;

    @ManyToOne(targetEntity = Sede.class)
    @JoinColumn(name = "sed_id")
    @ToString.Exclude
    private Sede sede;



    public Medico(int identificacion, String nombre, boolean estado) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.estado = estado;
    }
    public Medico(Integer identificacion, String nombre, Boolean estado, Especialidad especialidad, Consultorio consultorio, Sede sede) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.estado = estado;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.sede = sede;

     
    }


}
