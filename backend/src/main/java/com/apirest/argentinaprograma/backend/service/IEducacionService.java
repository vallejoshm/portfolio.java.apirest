
package com.apirest.argentinaprograma.backend.service;

import com.apirest.argentinaprograma.backend.model.Educacion;
import java.util.List;

public interface IEducacionService {
  
    public void agregarEducacion(Educacion car);

    public List<Educacion> verEducacion();

    public void eliminarEducacion(Long id);

    public Educacion obtenerUna(Long id);
}
