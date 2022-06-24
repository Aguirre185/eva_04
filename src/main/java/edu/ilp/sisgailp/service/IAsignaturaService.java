package edu.ilp.sisgailp.service;

import edu.ilp.sisgailp.entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    //Primero declaras variable aqui (sera plomo) Luego vas al controller hay lo llamas (Aqui se pone amarillo)
    //La variable cuando declaras deben ponerse amarillas sino no hace run :´v
    //Ejecuta pero se pone stop xq aqui estara en plomo imbecil :v xd

    //Reggistrar - Actualizar
    Asignatura guardarAsignatura(Asignatura asignatura);

    //Listar
    List<Asignatura> listarAsignatura();

    //Eliminar
    void eliminarAsignatura(Long idasignatura);

}
