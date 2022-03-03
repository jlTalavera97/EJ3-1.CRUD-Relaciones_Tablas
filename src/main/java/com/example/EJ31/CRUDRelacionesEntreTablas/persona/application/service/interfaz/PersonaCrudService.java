package com.example.EJ31.CRUDRelacionesEntreTablas.persona.application.service.interfaz;

import com.example.EJ31.CRUDRelacionesEntreTablas.persona.domain.dto.input.PersonaInputDto;
import com.example.EJ31.CRUDRelacionesEntreTablas.persona.domain.dto.output.PersonaOutputDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaCrudService {
    List<PersonaOutputDto> getAll();
    PersonaOutputDto addPersona(PersonaInputDto personaInputDto) throws Exception;
    PersonaOutputDto deletePersona(int id) throws Exception;
    PersonaOutputDto modifyPersona(int id, PersonaInputDto personaInputDto);
}
