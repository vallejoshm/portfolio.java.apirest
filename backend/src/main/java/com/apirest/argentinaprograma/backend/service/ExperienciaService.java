
package com.apirest.argentinaprograma.backend.service;

import com.apirest.argentinaprograma.backend.model.Experiencia;
import com.apirest.argentinaprograma.backend.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    ExperienciaRepository expRepo;
    
    @Override
    public void agregarExperiencia(Experiencia exp) {
        this.expRepo.save(exp);
    }

    @Override
    public List<Experiencia> verExperiencia() {
        return this.expRepo.findAll();
    }

    @Override
    public void eliminarExperiencia(Long id) {
        this.expRepo.deleteById(id);
    }

    @Override
    public Experiencia obtenerUna(Long id) {
        return this.expRepo.findById(id).orElse(null);
    }
    
}
