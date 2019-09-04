
package com.walmart.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="productos")
@Data
public class Producto implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
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
