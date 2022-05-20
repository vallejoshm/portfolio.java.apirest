
package com.apirest.argentinaprograma.backend.repository;

import com.apirest.argentinaprograma.backend.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Long>{  
}
