
package com.apirest.argentinaprograma.backend.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ProyectoDto {
    @NotBlank
    String nombre;
    @NotBlank
    String subtitulo;
    @NotBlank
    String descripcion;
    @NotBlank
    String[] imagenes;
    @NotBlank
    String[] stack;
    @NotBlank
    String link;
    @NotBlank
    String creacion;
    
    String creacionFin;

    public ProyectoDto() {
    }

    public ProyectoDto(String nombre, String subtitulo, String descripcion, String[] imagenes, String[] stack, String link, String creacion, String creacionFin) {
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
