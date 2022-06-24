package edu.ilp.sisgailp.controller;



import edu.ilp.sisgailp.entity.Fichamatricula;
import edu.ilp.sisgailp.service.IFichaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("ficha")
public class FichaController {
    @Autowired
    private IFichaService fichaService;

    @GetMapping("/listarFichas")
    public List<Fichamatricula> listaEscuelas(){
        return this.fichaService.listarficha();
    }

}
