
package com.apirest.argentinaprograma.backend.service;

import com.apirest.argentinaprograma.backend.model.Educacion;
import com.apirest.argentinaprograma.backend.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository eduRepo;
     
    @Override
    public void agregarEducacion(Educacion edu) {
        this.eduRepo.save(edu);
    }

    @Override
    public List<Educacion> verEducacion() {
        return this.eduRepo.findAll();
    }

    @Override
    public void eliminarEducacion(Long id) {
        this.eduRepo.deleteById(id);
    }

    @Override
    public Educacion obtenerUna(Long id) {
        return this.eduRepo.findById(id).orElse(null);
    }
    
}
