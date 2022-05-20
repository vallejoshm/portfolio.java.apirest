
package com.apirest.argentinaprograma.backend.service;

import com.apirest.argentinaprograma.backend.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
     
    public void agregarExperiencia(Experiencia exp);

    public List<Experiencia> verExperiencia();

    public void eliminarExperiencia(Long id);

    public Experiencia obtenerUna(Long id);   
}
