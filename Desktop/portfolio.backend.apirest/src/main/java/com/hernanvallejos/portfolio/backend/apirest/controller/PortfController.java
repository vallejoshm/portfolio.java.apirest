
package com.hernanvallejos.portfolio.backend.apirest.controller;

import com.hernanvallejos.portfolio.backend.apirest.model.Carrera;
import com.hernanvallejos.portfolio.backend.apirest.model.Educacion;
import com.hernanvallejos.portfolio.backend.apirest.model.service.CarreraService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfController {
    
    @Autowired
    private CarreraService carrServ;
    

    @GetMapping("/traerListaCarreras")
    @ResponseBody
    public List<Carrera> traerListaEducacion(){
       return carrServ.verCarreras();
}

    @PostMapping("/nuevaCarrera")
    public void nuevaCarrera(@RequestBody Carrera car){
        carrServ.agregarCarrera(car);        
}
    
    @DeleteMapping("/eliminarCarrera/{id}")
    public void eliminarCarrera(@PathVariable Long id){
        carrServ.eliminarCarrera(id);
    }

    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta(){
        return (new ResponseEntity<>("Este es un mensaje ResponseEntity", HttpStatus.OK));
}

}
