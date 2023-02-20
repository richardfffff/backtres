/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backtres.InterFace;

import com.portfolio.backtres.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto (buscado por usuario)
    public void deletePersona(Long id);
    
    //buscar persona por id
    public Persona findPersona(Long id);
}

