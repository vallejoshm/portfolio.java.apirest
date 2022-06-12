
package com.apirest.argentinaprograma.backend.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Proyecto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    String nombre;
    String subtitulo;
    String descripcion;
    String[] imagenes;
    String[] stack;
    String link;
    String creacion;
    String creacionFin;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String subtitulo, String descripcion, String[] imagenes, String[] stack, String link, String creacion, String creacionFin) {
        this.id = id;
        this.nombre = nombre;
        this.subtitulo = subtitulo;
        this.descripcion = descripcion;
        this.imagenes = imagenes;
        this.stack = stack;
        this.link = link;
        this.creacion = creacion;
        this.creacionFin = creacionFin;
    }
    
    
}
