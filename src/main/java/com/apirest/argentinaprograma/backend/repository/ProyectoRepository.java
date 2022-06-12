
package com.apirest.argentinaprograma.backend.repository;

import com.apirest.argentinaprograma.backend.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto,Long>{  
}
