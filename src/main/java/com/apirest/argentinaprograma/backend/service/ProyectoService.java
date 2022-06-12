
package com.apirest.argentinaprograma.backend.service;

import com.apirest.argentinaprograma.backend.model.Proyecto;
import com.apirest.argentinaprograma.backend.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    ProyectoRepository proyRepo;
    
    @Override
    public void agregarProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }

    @Override
    public List<Proyecto> verProyecto() {
        return proyRepo.findAll();
    }

    @Override
    public void eliminarProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyecto obtenerUno(Long id) {
        return proyRepo.findById(id).orElse(null);
    }
    
}
