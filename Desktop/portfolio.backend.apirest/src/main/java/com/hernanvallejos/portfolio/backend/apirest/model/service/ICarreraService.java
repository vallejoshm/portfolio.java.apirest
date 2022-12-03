
package com.hernanvallejos.portfolio.backend.apirest.model.service;

import com.hernanvallejos.portfolio.backend.apirest.model.Carrera;

import java.util.List;


public interface ICarreraService {

    public void agregarCarrera(Carrera car);

    public List<Carrera> verCarreras();

    public void eliminarCarrera(Long id);
}
