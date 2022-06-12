
package com.apirest.argentinaprograma.backend.dto;

import javax.validation.constraints.NotBlank;

public class HabilidadDto {
    @NotBlank
    String nombre;
    @NotBlank
    String tipo;
    @NotBlank
    String descripcion;
    @NotBlank
    int progreso;

    public HabilidadDto() {
    }

    public HabilidadDto(String nombre, String tipo, String descripcion,
            int progreso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.progreso = progreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        this.progreso = progreso;
    }
}
