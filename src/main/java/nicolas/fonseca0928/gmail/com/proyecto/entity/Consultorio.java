package nicolas.fonseca0928.gmail.com.proyecto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Consultorios")
@Entity

public class Consultorio {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "con_serial", nullable = false)
    private Integer serial;

    @Column(name = "con_id", nullable = false)
    private Integer idConsultorio;

    @Column(name = "con_nombre")
    private String nombre;


    @ManyToOne(targetEntity = Sede.class)
    @JoinColumn(name = "sed_id")
    private Sede sede;

    public Consultorio(int idConsultorio, String nombre, Sede sede) {
        this.idConsultorio = idConsultorio;
        this.nombre = nombre;
        this.sede = sede;
    }
}
