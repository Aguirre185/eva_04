package edu.ilp.sisgailp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ilp.sisgailp.entity.Asignatura;
import edu.ilp.sisgailp.joj.RestResponse;
import edu.ilp.sisgailp.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("asignatura")
@CrossOrigin(origins = "http://localhost:4200")
public class AsignaturaController {

    @Autowired
    private IAsignaturaService asignaturaService;

    @Autowired
    private ObjectMapper objectMapper;

    @PostMapping("/registra")
    public String registrarasignatura(@RequestBody String jsonAsignatura)throws JsonProcessingException{
        Asignatura asignatura=this.objectMapper.readValue (jsonAsignatura,Asignatura.class);
        this.asignaturaService.guardarAsignatura (asignatura);
        return "Asignatura registrado";
    }

    @PutMapping("/actualizar")
    public String actualizarAsignatura(@RequestBody String jsonAsignatura) throws JsonProcessingException{
        Asignatura asignatura=this.objectMapper.readValue(jsonAsignatura, Asignatura.class);
        this.asignaturaService.guardarAsignatura(asignatura);
        return "Se Actualizo asignatura";
    }


    @PostMapping("/eliminar/{id}")
    public String eliminarAsignatura(@PathVariable Long id){
        this.asignaturaService.eliminarAsignatura(id);
        return "Asignatura eliminada";
    }

    @GetMapping("/listardeAsignatura")
    public RestResponse listarAsignatura(){
        List<Asignatura> listarasinatura = this.asignaturaService.listarAsignatura ();
        return  new RestResponse(HttpStatus.OK.value (),"LISTA DE ASIGNATURA",listarasinatura);
    }



}
