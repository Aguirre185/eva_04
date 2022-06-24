package edu.ilp.sisgailp.dao;

import edu.ilp.sisgailp.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {


}
