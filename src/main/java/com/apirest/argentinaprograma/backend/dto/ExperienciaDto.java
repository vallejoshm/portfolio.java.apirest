
package com.apirest.argentinaprograma.backend.dto;

import javax.validation.constraints.NotBlank;

public class ExperienciaDto {
    
    @NotBlank
    boolean trabajoActual;
    @NotBlank
    String nombreEmpresa;
    @NotBlank
    String cargo;
    @NotBlank
    String descripTareas;
    @NotBlank
    String direccion;
    @NotBlank
    String telefono;
    
    String paginaWeb;
    @NotBlank
    String fechaInicio;
    
    String fechaFin;

    public ExperienciaDto() {
    }

    public ExperienciaDto(boolean trabajoActual, String nombreEmpresa, String cargo, String descripTareas, String direccion, String telefono, String paginaWeb, String fechaInicio, String fechaFin) {
        this.trabajoActual = trabajoActual;
        this.nombreEmpresa = nombreEmpresa;
        this.cargo = cargo;
        this.descripTareas = descripTareas;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public boolean isTrabajoActual() {
        return trabajoActual;
    }

    public void setTrabajoActual(boolean trabajoActual) {
        this.trabajoActual = trabajoActual;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescripTareas() {
        return descripTareas;
    }

    public void setDescripTareas(String descripTareas) {
        this.descripTareas = descripTareas;
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
}
