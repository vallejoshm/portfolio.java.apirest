package com.apirest.argentinaprograma.backend.controller;

import com.apirest.argentinaprograma.backend.dto.EducacionDto;
import com.apirest.argentinaprograma.backend.dto.ExperienciaDto;
import com.apirest.argentinaprograma.backend.dto.HabilidadDto;
import com.apirest.argentinaprograma.backend.dto.Mensaje;
import com.apirest.argentinaprograma.backend.dto.ProyectoDto;
import com.apirest.argentinaprograma.backend.model.Educacion;
import com.apirest.argentinaprograma.backend.model.Experiencia;
import com.apirest.argentinaprograma.backend.model.Habilidad;
import com.apirest.argentinaprograma.backend.model.Proyecto;
import com.apirest.argentinaprograma.backend.service.EducacionService;
import com.apirest.argentinaprograma.backend.service.ExperienciaService;
import com.apirest.argentinaprograma.backend.service.HabilidadService;
import com.apirest.argentinaprograma.backend.service.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "https://portfolio-web-hv.firebaseapp.com/")
@Transactional
@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private EducacionService eduServ;
    @Autowired
    private ExperienciaService expServ;
    @Autowired
    private HabilidadService habServ;
    @Autowired
    private ProyectoService proyServ;

    @GetMapping("/traerlistahabilidades")
    @ResponseBody
    public List<Habilidad> traerListaHabilidad() {
        return habServ.obtenerListaHabilidad();
    }

    @GetMapping("/traerunahabilidad/{id}")
    @ResponseBody
    public ResponseEntity<Habilidad> unaHabilidad(@PathVariable("id") Long id) {
        Habilidad hab = habServ.obtenerUna(id);
        return new ResponseEntity(hab, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/nuevahabilidad")
    public ResponseEntity<?> nuevaHabilidad(@RequestBody HabilidadDto habDto) {
        if (StringUtils.isBlank(habDto.getTipo())) {
            return new ResponseEntity(new Mensaje("El tipo es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Habilidad hab = new Habilidad();
        hab.setNombre(habDto.getNombre());
        hab.setTipo(habDto.getTipo());
        hab.setDescripcion(habDto.getDescripcion());
        hab.setProgreso(habDto.getProgreso());

        habServ.agregarHabilidad(hab);
        return new ResponseEntity(new Mensaje("Elemento Habilidad Creado"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminarhabilidad/{id}")
    public void eliminarHabilidad(@PathVariable Long id) {
        habServ.eliminarHabilidad(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editarhabilidad/{id}")
    public void editarHabilidad(@RequestBody HabilidadDto habDto, @PathVariable("id") Long id) {
        Habilidad hab = habServ.obtenerUna(id);
        hab.setNombre(habDto.getNombre());
        hab.setTipo(habDto.getTipo());
        hab.setDescripcion(habDto.getDescripcion());
        hab.setProgreso(habDto.getProgreso());

        habServ.agregarHabilidad(hab);
    }

    @GetMapping("/traerlistaexperiencia")
    @ResponseBody
    public List<Experiencia> traerListaExperiencia() {
        return expServ.verExperiencia();
    }

    @GetMapping("/traerunaexperiencia/{id}")
    @ResponseBody
    public ResponseEntity<Experiencia> unaExperiencia(@PathVariable("id") Long id) {
        Experiencia exp = expServ.obtenerUna(id);
        return new ResponseEntity(exp, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/nuevaexperiencia")
    public ResponseEntity<?> nuevaExperiencia(@RequestBody ExperienciaDto expDto) {
        if (StringUtils.isBlank(expDto.getCargo())) {
            return new ResponseEntity(new Mensaje("El nombre del cargo es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Experiencia exp = new Experiencia();
        exp.setTrabajoActual(expDto.isTrabajoActual());
        exp.setNombreEmpresa(expDto.getNombreEmpresa());
        exp.setCargo(expDto.getCargo());
        exp.setDescripTareas(expDto.getDescripTareas());
        exp.setDireccion(expDto.getDireccion());
        exp.setTelefono(expDto.getTelefono());
        exp.setPaginaWeb(expDto.getPaginaWeb());
        exp.setFechaInicio(expDto.getFechaInicio());
        exp.setFechaFin(expDto.getFechaFin());

        expServ.agregarExperiencia(exp);
        return new ResponseEntity(new Mensaje("Elemento Experiencia Creado"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminarexperiencia/{id}")
    public void eliminarExperiencia(@PathVariable Long id) {
        expServ.eliminarExperiencia(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editarexperiencia/{id}")
    public void editarExperiencia(@RequestBody ExperienciaDto expDto, @PathVariable("id") Long id) {
        Experiencia exp = expServ.obtenerUna(id);
        exp.setTrabajoActual(expDto.isTrabajoActual());
        exp.setNombreEmpresa(expDto.getNombreEmpresa());
        exp.setCargo(expDto.getCargo());
        exp.setDescripTareas(expDto.getDescripTareas());
        exp.setDireccion(expDto.getDireccion());
        exp.setTelefono(expDto.getTelefono());
        exp.setPaginaWeb(expDto.getPaginaWeb());
        exp.setFechaInicio(expDto.getFechaInicio());
        exp.setFechaFin(expDto.getFechaFin());

        expServ.agregarExperiencia(exp);
    }

    @GetMapping("/traerlistaeducacion")
    @ResponseBody
    public List<Educacion> traerListaEducacion() {
        return eduServ.verEducacion();
    }

    @GetMapping("/traerunaeducacion/{id}")
    @ResponseBody
    public ResponseEntity<Educacion> unaEducacion(@PathVariable("id") Long id) {
        System.out.println(id);
        Educacion edu = eduServ.obtenerUna(id);
        System.out.println(edu.getNombre());
        System.out.println(new ResponseEntity(edu, HttpStatus.OK));
        return new ResponseEntity(edu, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/nuevaeducacion")
    public ResponseEntity<?> nuevaEducacion(@RequestBody EducacionDto eduDto) {

        System.out.println(eduDto.getTitulo());
        if (StringUtils.isBlank(eduDto.getTitulo())) {
            return new ResponseEntity(new Mensaje("El nombre de la carrera es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (eduDto.getAvance() < 0) {
            return new ResponseEntity(new Mensaje("El avance en la carrera no puede ser menor a 0"), HttpStatus.BAD_REQUEST);
        }
        Educacion edu = new Educacion();
        edu.setAvance(eduDto.getAvance());
        edu.setStatus(eduDto.getStatus());
        edu.setTitulo(eduDto.getTitulo());
        edu.setDescripCarrera(eduDto.getDescripCarrera());
        edu.setNombre(eduDto.getNombre());
        edu.setDireccion(eduDto.getDireccion());
        edu.setTelefono(eduDto.getTelefono());
        edu.setPaginaWeb(eduDto.getPaginaWeb());
        edu.setFechaInicio(eduDto.getFechaInicio());
        edu.setFechaFin(eduDto.getFechaFin());

        eduServ.agregarEducacion(edu);
        return new ResponseEntity(new Mensaje("Elemento Educacion Creado"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminareducacion/{id}")
    public void eliminarEducacion(@PathVariable Long id) {
        eduServ.eliminarEducacion(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editareducacion/{id}")
    public void editarEducacion(@RequestBody EducacionDto eduDto, @PathVariable("id") Long id) {
        Educacion edu = eduServ.obtenerUna(id);
        edu.setTitulo(eduDto.getTitulo());
        edu.setDescripCarrera(eduDto.getDescripCarrera());
        edu.setAvance(eduDto.getAvance());
        edu.setStatus(eduDto.getStatus());
        edu.setNombre(eduDto.getNombre());
        edu.setDireccion(eduDto.getDireccion());
        edu.setTelefono(eduDto.getTelefono());
        edu.setPaginaWeb(eduDto.getPaginaWeb());
        edu.setFechaInicio(eduDto.getFechaInicio());
        edu.setFechaFin(eduDto.getFechaFin());

        eduServ.agregarEducacion(edu);
    }
    
    @GetMapping("/traerlistaproyecto")
    @ResponseBody
    public List<Proyecto> traerListaProyecto() {
        return proyServ.verProyecto();
    }

    @GetMapping("/traerunproyecto/{id}")
    @ResponseBody
    public ResponseEntity<Proyecto> unaProyecto(@PathVariable("id") Long id) {
        Proyecto proy = proyServ.obtenerUno(id);
        return new ResponseEntity(proy, HttpStatus.OK);
    }

    @PostMapping("/nuevoproyecto")
    public ResponseEntity<?> nuevoProyecto(@RequestBody ProyectoDto proyDto) {
        if (StringUtils.isBlank(proyDto.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre delproyecto es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        //hacer todas las validaciones
        Proyecto proy = new Proyecto();
        proy.setNombre(proyDto.getNombre());
        proy.setSubtitulo(proyDto.getSubtitulo());
        proy.setDescripcion(proyDto.getDescripcion());
        proy.setImagenes(proyDto.getImagenes());
        proy.setStack(proyDto.getStack());
        proy.setCreacion(proyDto.getCreacion());
        proy.setCreacionFin(proyDto.getCreacionFin());
        proy.setLink(proyDto.getLink());

        proyServ.agregarProyecto(proy);
        return new ResponseEntity(new Mensaje("Elemento Proyecto Creado"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminarproyecto/{id}")
    public void eliminarProyecto(@PathVariable Long id) {
        proyServ.eliminarProyecto(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editarproyecto/{id}")
    public void editarProyecto(@RequestBody ProyectoDto proyDto, @PathVariable("id") Long id) {
        Proyecto proy = proyServ.obtenerUno(id);
        proy.setNombre(proyDto.getNombre());
        proy.setSubtitulo(proyDto.getSubtitulo());
        proy.setDescripcion(proyDto.getDescripcion());
        proy.setImagenes(proyDto.getImagenes());
        proy.setStack(proyDto.getStack());
        proy.setCreacion(proyDto.getCreacion());
        proy.setCreacionFin(proyDto.getCreacionFin());
        proy.setLink(proyDto.getLink());

        proyServ.agregarProyecto(proy);
    }
}
