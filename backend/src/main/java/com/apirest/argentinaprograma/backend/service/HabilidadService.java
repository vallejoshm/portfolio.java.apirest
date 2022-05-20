
package com.apirest.argentinaprograma.backend.service;

import com.apirest.argentinaprograma.backend.model.Habilidad;
import com.apirest.argentinaprograma.backend.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {
    
    @Autowired
    HabilidadRepository habRepo;
    
    @Override
    public void agregarHabilidad(Habilidad hab) {
        this.habRepo.save(hab);
    }

    @Override
    public List<Habilidad> obtenerListaHabilidad() {
        return this.habRepo.findAll();
    }

    @Override
    public void eliminarHabilidad(Long id) {
        this.habRepo.deleteById(id);
    }

    @Override
    public Habilidad obtenerUna(Long id) {
        return this.habRepo.findById(id).orElse(null);
    }
    
}
