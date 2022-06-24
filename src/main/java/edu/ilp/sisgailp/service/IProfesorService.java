package edu.ilp.sisgailp.service;

import edu.ilp.sisgailp.entity.Profesor;

import java.util.List;

public interface IProfesorService {
    //Agregar - Actualizar
    Profesor guardarProfesor(Profesor profesor);
    //Listar
    List<Profesor> listarProfesor();
    //Eliminar
    void elimnarProfesor(Long idprofesor);

}
