package com.example.EJ31.CRUDRelacionesEntreTablas.student.infrastructure.controller;

import com.example.EJ31.CRUDRelacionesEntreTablas.student.application.service.interfaz.EstudianteCrudService;
import com.example.EJ31.CRUDRelacionesEntreTablas.student.domain.dto.input.EstudianteInputDto;
import com.example.EJ31.CRUDRelacionesEntreTablas.student.domain.dto.output.EstudianteOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteCrudController {

    @Autowired
    private EstudianteCrudService estudianteCrudService;

    @GetMapping("/getAll")
    public List<EstudianteOutputDto> getAll(){
        return estudianteCrudService.getAll();
    }

    @PostMapping("/add")
    public EstudianteOutputDto addEstudiante(@RequestBody EstudianteInputDto estudianteInputDto) throws Exception{
        return estudianteCrudService.addEstudiante(estudianteInputDto);
    }

    @DeleteMapping("/delete/{id}")
    public EstudianteOutputDto deleteId(@PathVariable int id) throws Exception{
        return estudianteCrudService.deleteEstudiante(id);
    }

    @PutMapping("/mod/{id}")
    public EstudianteOutputDto updateId(@PathVariable int id, @RequestBody EstudianteInputDto estudianteInputDto){
        return estudianteCrudService.modifyEstudiante(id, estudianteInputDto);
    }
}
