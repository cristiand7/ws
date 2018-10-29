package co.edu.javeriana.ws.rest;

import co.edu.javeriana.ws.entidades.Piloto;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    
    List<Piloto> lista=new ArrayList<>();

    public MyResource() {
        Piloto p=new Piloto();
        Piloto p2=new Piloto();
        p.setId(1);
        p2.setId(2);
        p.setNombre("Montoya");
        p2.setNombre("Alonso");
        p2.setPodios(2);
        p.setPodios(2);
        p.setCampeonatos(1);
        p2.setCampeonatos(1);
        p.setFechanacimiento("01/01/1988");
        p2.setFechanacimiento("01/01/1988");
        lista.add(p);
        lista.add(p2);
    }
    
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @GET
    @Path("piloto")
    @Produces("application/json")
    public List<Piloto> getPiloto() {
        return lista;
    }
 
    @GET
    @Path("pilotox")
    @Produces("application/xml")
    public List<Piloto> getPilotox() {
        return lista;
    }
 
    @GET
    @Path("piloto/{id}")
    @Produces("application/json")
    public Piloto getPiloto(@PathParam("id") int id) {
        return lista.get(id);
    }
    
    @GET
    @Path("pilotox/{id}")
    @Produces("application/xml")
    public Piloto getPilotoX(@PathParam("id") int id) {
        return lista.get(id);
    }
    
    @POST
    @Path("piloto/create")
    @Produces(MediaType.TEXT_PLAIN)
    public String createPiloto( Piloto piloto) {
        lista.add(piloto);
        return "recibido "+piloto.getNombre();
    }
   
     @DELETE
    @Path("piloto/delete/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deletePiloto( @PathParam("id") int id) {
        lista.remove(id);
      
        return "eliminado id, lista n "+lista.size();
    }
   
     @POST
    @Path("piloto/edit/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String editPiloto( @PathParam("id") int id,Piloto piloto) {
        lista.set(id, piloto);
        return "modificado ";
    }
   
}
