package Productos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author enigma
 */
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @Column
    @GeneratedValue(generator = "productos_clave_seq",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "productos_clave_seq",
            sequenceName = "productos_clave_seq", initialValue = 1,
            allocationSize = 1)
    private Long clave;

    @Column
    private String nombre;

    @Column
    private double precio;

    public Long getClave() {
        return clave;
    }

    public void setClave(Long clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

