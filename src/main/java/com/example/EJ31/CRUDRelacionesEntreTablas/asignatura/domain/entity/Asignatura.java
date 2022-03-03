package com.example.EJ31.CRUDRelacionesEntreTablas.asignatura.domain.entity;

import com.example.EJ31.CRUDRelacionesEntreTablas.profesor.domain.entity.Profesor;
import com.example.EJ31.CRUDRelacionesEntreTablas.student.domain.entity.Estudiante;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_study;

    @Column(name = "asignatura")
    String asignatura;

    @Column(name = "comentarios")
    String comment;

    @Column(name = "initial_date")
    Date initial_date;

    @Column(name = "finish_date")
    Date finish_date;

    @JsonIgnore
    @ManyToMany
    List<Estudiante> estudiantes;

}
