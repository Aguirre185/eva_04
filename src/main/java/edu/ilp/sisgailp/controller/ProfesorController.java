package edu.ilp.sisgailp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ilp.sisgailp.entity.Profesor;
import edu.ilp.sisgailp.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("profesor")
public class ProfesorController {

    @Autowired
    private IProfesorService profesorService;

    @Autowired
    private ObjectMapper objectMapper;
    //Registra
    @PostMapping("/registrar")
    public String registrarProfesor(@RequestBody String jsonProfesor) throws JsonProcessingException {
        Profesor profesor=this.objectMapper.readValue(jsonProfesor, Profesor.class);
        this.profesorService.guardarProfesor(profesor);
        return "Profesor registrado";
    }

    //Actualizar
    @PutMapping("/actualizar")
    public String actualizarProfesor(@RequestBody String jsonProfesor) throws JsonProcessingException{
        Profesor profesor = this.objectMapper.readValue(jsonProfesor, Profesor.class);
        this.profesorService.guardarProfesor(profesor);
        return "Se actualizo datos del profesor";
    }

    //Lista
    @GetMapping("/listarProfesor")
    public List<Profesor> listarProfesor(){return this.profesorService.listarProfesor();}

    //Eliminar
    @PostMapping("/eliminar/{id}")
    public String elimnarProfesor(@PathVariable Long id){
        this.profesorService.elimnarProfesor(id);
        return "Asignatura Eliminada";
    }

    //Buscar


}
