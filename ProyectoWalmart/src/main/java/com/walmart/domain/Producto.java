
package com.walmart.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto implements Serializable{
    @Id
    @Column
    private int codigo;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private String categoria;
    @Column
    private int cantidad;
    @Column
    private float precioUnitario;
    @Column
    private float precioDocena;
    
}
