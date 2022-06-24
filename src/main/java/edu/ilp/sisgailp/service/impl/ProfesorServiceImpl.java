package edu.ilp.sisgailp.service.impl;

import edu.ilp.sisgailp.dao.IProfesorDao;
import edu.ilp.sisgailp.entity.Profesor;
import edu.ilp.sisgailp.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements IProfesorService {

    @Autowired
    private IProfesorDao profesorDao;

    @Override
    public Profesor guardarProfesor(Profesor profesor) {
        return this.profesorDao.save(profesor);
    }

    @Override
    public List<Profesor> listarProfesor() {
        return this.profesorDao.findAll();
    }

    @Override
    public void elimnarProfesor(Long idprofesor) {
        this.profesorDao.deleteById(idprofesor);
    }

}
