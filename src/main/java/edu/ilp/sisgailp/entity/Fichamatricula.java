package edu.ilp.sisgailp.entity;

import javax.persistence.*;

@Entity
@Table(name = "ficha_matricula")
@PrimaryKeyJoinColumn(referencedColumnName="IDPERSONA")
public class Fichamatricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idficha_matricula", length = 10)
    private Long idficha_matricula;

    private String semestre;

    private String anio_academico;

    private String fmatricula;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Asignatura asignatura;

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Persona Persona;

    public Fichamatricula() {
    }

    public Fichamatricula(Long idficha_matricula, String semestre, String anio_academico, String fmatricula, Asignatura asignatura, edu.ilp.sisgailp.entity.Persona persona) {
        this.idficha_matricula = idficha_matricula;
        this.semestre = semestre;
        this.anio_academico = anio_academico;
        this.fmatricula = fmatricula;
        this.asignatura = asignatura;
        Persona = persona;
    }

    public Long getIdficha_matricula() {
        return idficha_matricula;
    }

    public void setIdficha_matricula(Long idficha_matricula) {
        this.idficha_matricula = idficha_matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getAnio_academico() {
        return anio_academico;
    }

    public void setAnio_academico(String anio_academico) {
        this.anio_academico = anio_academico;
    }

    public String getFmatricula() {
        return fmatricula;
    }

    public void setFmatricula(String fmatricula) {
        this.fmatricula = fmatricula;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public edu.ilp.sisgailp.entity.Persona getPersona() {
        return Persona;
    }

    public void setPersona(edu.ilp.sisgailp.entity.Persona persona) {
        Persona = persona;
    }
}
