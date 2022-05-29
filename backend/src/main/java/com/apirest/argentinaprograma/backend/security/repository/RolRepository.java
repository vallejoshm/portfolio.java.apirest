
package com.apirest.argentinaprograma.backend.security.repository;

import com.apirest.argentinaprograma.backend.security.entity.Rol;
import com.apirest.argentinaprograma.backend.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
