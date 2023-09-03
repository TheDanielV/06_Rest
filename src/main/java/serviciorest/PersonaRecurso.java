package serviciorest;

import modelo.Persona;
import modelo.dao.PersonaDAO;
import modelo.daoImp.ImpPersonaDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.lang.reflect.Type;
import java.util.List;

@Path("/persona")
public class PersonaRecurso {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persona> getPersona(){
        PersonaDAO personaDAO = new ImpPersonaDAO();
        return personaDAO.getPersonas();
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public  Persona getPersonaByPathParam( @PathParam("id") int id){
        PersonaDAO personaDAO = new ImpPersonaDAO();
        return personaDAO.getById(id);
    }
    @GET
    @Path("/query")
    @Produces(MediaType.APPLICATION_JSON)
    public Persona getPersonaByQueryParam(@QueryParam("id") int id){
        PersonaDAO personaDAO = new ImpPersonaDAO();
        return personaDAO.getById(id);
    }
    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public void guardarPersona(Persona p){
        PersonaDAO personaDAO = new ImpPersonaDAO();
        personaDAO.addPersona(p);
    }
    @PUT
    @Path("update")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public void actualizarPersona(Persona p){
        PersonaDAO personaDAO = new ImpPersonaDAO();
        personaDAO.actualizar(p);
    }
    @DELETE
    @Path("delete/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public void eliminarPersona(@PathParam("id") int id){
        PersonaDAO personaDAO = new ImpPersonaDAO();
        personaDAO.eliminar(id);
    }
}
