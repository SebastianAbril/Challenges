package com.example.PruebaCRUD.Service;

import com.example.PruebaCRUD.Entity.Persona;

import java.util.List;

public interface PersonaService {

     List<Persona> ConsultarPersona();

     Persona CrearPersona(Persona persona);
     Persona modificarPersona(Persona persona);
     Persona BuscarPersona(int id);
     void EliminarPersona(int id);

}
