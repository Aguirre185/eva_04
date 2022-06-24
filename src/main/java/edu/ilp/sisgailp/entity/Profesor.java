package edu.ilp.sisgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName="IDPERSONA")
public class Profesor extends Persona{

    @Column(name = "salario", length = 10)
    private String salario;

    public Profesor() {
    }

    public Profesor(String salario) {
        this.salario = salario;
    }

    public Profesor(Long idpersona, String salario) {
        super(idpersona);
        this.salario = salario;
    }

    public Profesor(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String salario) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
