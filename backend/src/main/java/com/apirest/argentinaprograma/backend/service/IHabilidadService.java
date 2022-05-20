
package com.apirest.argentinaprograma.backend.service;

import com.apirest.argentinaprograma.backend.model.Habilidad;
import java.util.List;


public interface IHabilidadService {
    
    public void agregarHabilidad(Habilidad hab);

    public List<Habilidad> obtenerListaHabilidad();

    public void eliminarHabilidad(Long id);

    public Habilidad obtenerUna(Long id);
}
