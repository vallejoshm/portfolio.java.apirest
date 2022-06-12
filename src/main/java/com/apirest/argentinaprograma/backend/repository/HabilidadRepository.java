
package com.apirest.argentinaprograma.backend.repository;

import com.apirest.argentinaprograma.backend.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad,Long>{    
}
