
package com.hernanvallejos.portfolio.backend.apirest.repository;

import com.hernanvallejos.portfolio.backend.apirest.model.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository <Carrera,Long>{
    
}
