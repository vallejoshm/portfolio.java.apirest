
package com.apirest.argentinaprograma.backend.service;

import com.apirest.argentinaprograma.backend.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    public void agregarProyecto(Proyecto proy);

    public List<Proyecto> verProyecto();

    public void eliminarProyecto(Long id);

    public Proyecto obtenerUno(Long id); 
}
