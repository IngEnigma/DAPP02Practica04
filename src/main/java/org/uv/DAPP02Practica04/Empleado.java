package org.uv.DAPP02Practica04;

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
@Table(name = "empleados")
public class Empleado {
    @Id
    @Column(name = "clave")
    @GeneratedValue(generator = "empleados_clave_seq",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="empleados_clave_seq",
            sequenceName = "empleados_clave_seq", initialValue = 1,
            allocationSize = 1)
    private Long clave;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "direccion", nullable = false)
    private String direccion;
    
    @Column(name = "telefono", nullable = false)
    private String telefono;

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
