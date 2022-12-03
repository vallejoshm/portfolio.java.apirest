
package com.hernanvallejos.portfolio.backend.apirest.model.service;

import com.hernanvallejos.portfolio.backend.apirest.model.Carrera;
import com.hernanvallejos.portfolio.backend.apirest.repository.CarreraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraService implements ICarreraService{

    @Autowired
    public CarreraRepository carrRepo;
    
    @Override
    public void agregarCarrera(Carrera car) {
        carrRepo.save(car);
    }

    @Override
    public List<Carrera> verCarreras() {
        return carrRepo.findAll();
    }

    @Override
    public void eliminarCarrera(Long id) {
        carrRepo.deleteById(id);
    }
    
}
