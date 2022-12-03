
package com.hernanvallejos.portfolio.backend.apirest.model;

public class Educacion {
    String status;
    String titulo;
    int avance;
    String descripCarrera;
    String datosInstitucion;

    public Educacion(String status, String titulo, int avance, String descripCarrera, String datosInstitucion) {
        this.status = status;
        this.titulo = titulo;
        this.avance = avance;
        this.descripCarrera = descripCarrera;
        this.datosInstitucion = datosInstitucion;
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

    public String getDatosInstitucion() {
        return datosInstitucion;
    }

    public void setDatosInstitucion(String datosInstitucion) {
        this.datosInstitucion = datosInstitucion;
    }


}
