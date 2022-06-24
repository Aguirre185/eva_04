package edu.ilp.sisgailp.service.impl;

import edu.ilp.sisgailp.dao.IAsignaturaDao;
import edu.ilp.sisgailp.entity.Asignatura;
import edu.ilp.sisgailp.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaServiceImpl implements IAsignaturaService {

    @Autowired
    private IAsignaturaDao asignaturaDao;

    @Override
    public Asignatura guardarAsignatura(Asignatura asignatura) {
        return this.asignaturaDao.save(asignatura);
    }

    @Override
    public List<Asignatura> listarAsignatura() {
        return this.asignaturaDao.findAll();
    }

    @Override
    public void eliminarAsignatura(Long idasignatura) {
        this.asignaturaDao.deleteById(idasignatura);
    }

}
