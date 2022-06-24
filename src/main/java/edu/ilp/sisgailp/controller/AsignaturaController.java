package edu.ilp.sisgailp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ilp.sisgailp.entity.Asignatura;
import edu.ilp.sisgailp.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("asignatura")
public class AsignaturaController {

    @Autowired
    private IAsignaturaService asignaturaService;

    @Autowired
    private ObjectMapper objectMapper;

    @PostMapping("/registrar")
    public String registrarAsignatura(@RequestBody String jsonAsignatura) throws JsonProcessingException{
        Asignatura asignatura = this.objectMapper.readValue(jsonAsignatura, Asignatura.class);
        this.asignaturaService.guardarAsignatura(asignatura);
        return "asignatura registrada";
    }

    @PutMapping("/actualizar")
    public String actualizarAsignatura(@RequestBody String jsonAsignatura) throws JsonProcessingException{
        Asignatura asignatura=this.objectMapper.readValue(jsonAsignatura, Asignatura.class);
        this.asignaturaService.guardarAsignatura(asignatura);
        return "Se Actualizo asignatura";
    }

    @GetMapping("/listarAsignatura")
    public List<Asignatura> listarAsignatura(){ return this.asignaturaService.listarAsignatura();}

    @PostMapping("/eliminar/{id}")
    public String eliminarAsignatura(@PathVariable Long id){
        this.asignaturaService.eliminarAsignatura(id);
        return "Asignatura eliminada";
    }

}
