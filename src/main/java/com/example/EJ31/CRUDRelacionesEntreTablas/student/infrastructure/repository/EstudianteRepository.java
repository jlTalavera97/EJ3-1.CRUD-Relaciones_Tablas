package com.example.EJ31.CRUDRelacionesEntreTablas.student.infrastructure.repository;

import com.example.EJ31.CRUDRelacionesEntreTablas.student.domain.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

    Estudiante findById(int id_estudiante);

    @Query("select e from Estudiante e where e.name = ?1")
    List<Estudiante> findByName(String name);

}
