package edu.ilp.sisgailp.dao;


import edu.ilp.sisgailp.entity.Escuela;
import edu.ilp.sisgailp.entity.Estudiante;
import edu.ilp.sisgailp.entity.Fichamatricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFichaMatriculaDao extends JpaRepository<Fichamatricula,Long> {




}
