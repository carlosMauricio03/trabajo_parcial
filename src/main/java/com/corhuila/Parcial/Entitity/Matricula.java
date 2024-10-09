package com.corhuila.Parcial.Entitity;

import jakarta.persistence.*;

@Entity
@Table(name = "matricula")
public class Matricula extends ABaseEntity{

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "estudiante_id", nullable = false, unique = true)//Estudiante se relaciona a una unica matricula
    private Estudiante estudianteId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "materia_id", nullable = false)// Una misma materia puede ser cursada por multiples alumnos
    private Materia materiaId;

    public Estudiante getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Estudiante estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Materia getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Materia materiaId) {
        this.materiaId = materiaId;
    }
}
