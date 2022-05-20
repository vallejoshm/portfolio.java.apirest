
package com.apirest.argentinaprograma.backend.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


public class EducacionDto {
    @Min(0)
    private int avance;
    
    @NotBlank
    private String descripCarrera;
    
    @NotBlank
    private String status;
    
    @NotBlank
    private String titulo;
    
    @NotBlank
    private String direccion;
    
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String paginaWeb;
    
    @NotBlank
    private String telefono;
    
    private String fechaInicio;
    
    private String fechaFin;

    public EducacionDto() {
    }

    public EducacionDto(int avance,String descripCarrera, String status,
           String titulo, String direccion, String nombre,String paginaWeb,
           String telefono, String fechaInicio, String fechaFin) {
        this.status = status;
        this.titulo = titulo;
        this.avance = avance;
        this.descripCarrera = descripCarrera;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    public String getDescripCarrera() {
        return descripCarrera;
    }

    public void setDescripCarrera(String descripCarrera) {
        this.descripCarrera = descripCarrera;
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

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
}
