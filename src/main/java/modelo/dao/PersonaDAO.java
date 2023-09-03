package modelo.dao;

import modelo.Persona;

import java.util.List;

public interface PersonaDAO {
    public Persona getById(int id);
    public List<Persona> getPersonas();
    public void addPersona(Persona p);
    public void actualizar(Persona p);
    public void eliminar(int id);
}
