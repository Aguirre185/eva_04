package edu.ilp.sisgailp.entity;

import javax.persistence.*;

@Entity
@Table(name = "asignatura")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idasignatura;

    private String creditos;

    private String denominacion;

    private String sigla;

    public Asignatura() {
    }

    public Asignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public Asignatura(String creditos, String denominacion, String sigla) {
        this.creditos = creditos;
        this.denominacion = denominacion;
        this.sigla = sigla;
    }

    public Long getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
