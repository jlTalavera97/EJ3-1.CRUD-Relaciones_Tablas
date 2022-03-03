package com.example.EJ31.CRUDRelacionesEntreTablas.student.domain.entity;

import com.example.EJ31.CRUDRelacionesEntreTablas.asignatura.domain.entity.Asignatura;
import com.example.EJ31.CRUDRelacionesEntreTablas.persona.domain.entity.Persona;
import com.example.EJ31.CRUDRelacionesEntreTablas.profesor.domain.entity.Profesor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ESTUDIANTE")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_student;

    @Column(name="name")
    String name;

    @Column(name="num_hours_week")
    Integer num_hours_week;

    @Column(name="coments")
    String coments;

    @Column(name="branch")
    String branch;

    @OneToOne
    @JoinColumn(name = "id_Persona")
    Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Profesor", nullable = false, updatable = false, insertable = false)
    Profesor profesor;

    @ManyToMany
    List<Asignatura> asignaturas;

}
