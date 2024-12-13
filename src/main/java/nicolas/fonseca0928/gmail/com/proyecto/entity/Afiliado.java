package nicolas.fonseca0928.gmail.com.proyecto.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

public class Afiliado {
    

    @Id
    @Column(name = "afiId", nullable = false)
    private int identificacion;

    @Column(name = "afiNombre", nullable = false)
    private String nombre;

    @Column(name = "afiEdad", nullable = false)
    private int edad;

    @Column(name = "afiCorreo", nullable = false)
    private String correo;

    @Column(name = "afiCel", nullable = false)
    private int celular;

    @Column(name = "afiDireccion", nullable = false)
    private String direccion;

    @Column(name = "afiEstado", nullable = false)
    private boolean estado; 

    @OneToOne(targetEntity = Registro.class)
    @JoinColumn(name = "reg_id")
    private Registro registro;

    @ToString.Exclude
    @OneToMany(mappedBy = "afiliado", fetch = FetchType.LAZY)
    private List<Cita> cita;

    @OneToOne(targetEntity = Afiliacion.class)
    @JoinColumn(name = "afili_id")
    private Afiliacion afiliacion;

    @Column(name = "afi_motivo", nullable = false)
    private String motivo;

    public Afiliado(int identificacion, String nombre, boolean estado, String motivo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.estado = estado;
        this.motivo = motivo;

        
    }
   



}
