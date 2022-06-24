package edu.ilp.sisgailp.service.impl;

import edu.ilp.sisgailp.entity.Fichamatricula;
import edu.ilp.sisgailp.dao.IFichaMatriculaDao;
import edu.ilp.sisgailp.service.IFichaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FichaServiceImpl implements IFichaService {

    @Autowired
    private IFichaMatriculaDao fichaMatriculaDao;

    @Override
    public List<Fichamatricula> listarficha() {
        return this.fichaMatriculaDao.findAll();
    }
}
