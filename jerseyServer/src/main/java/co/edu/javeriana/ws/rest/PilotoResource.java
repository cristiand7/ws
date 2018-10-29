package co.edu.javeriana.ws.rest;

import co.edu.javeriana.ws.entidades.Campeonato;
import co.edu.javeriana.ws.entidades.JaxbWriterReader;
import co.edu.javeriana.ws.entidades.Piloto;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("piloto")
public class PilotoResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    
    List<Piloto> lista=new ArrayList<>();
    

    private JaxbWriterReader jaxb;
    private Campeonato campeonato;

    public PilotoResource() {

        this.jaxb = new JaxbWriterReader();
	this.campeonato = (Campeonato) this.jaxb.jaxbReader(Campeonato.class, "C:\\Users\\sala a\\Documents\\Nueva carpeta\\ws\\jerseyServer\\campeonato.xml");
   
 
    }
    
    
  
    @GET
    @Path("/")
    @Produces("application/json")
    public List<Piloto> getPiloto() {
    	return campeonato.getPiloto();
    }
 
    @GET
    @Path("/xml/")
    @Produces("application/xml")
    public List<Piloto> getPilotox() {
        return lista;
    }
 
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Piloto getPiloto(@PathParam("id") int id) {
         return campeonato.getPiloto().get(id-1);
    }
    
    @GET
    @Path("/xml/{id}")
    @Produces("application/xml")
    public Piloto getPilotoX(@PathParam("id") int id) {
    	return campeonato.getPiloto().get(id-1);
    }
    
    @POST
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes("application/json")
    public String createPiloto( Piloto piloto) {
    	campeonato.getPiloto().add(piloto);
    	this.jaxb.jaxbWriter(this.campeonato, "C:\\Users\\sala a\\Documents\\Nueva carpeta\\ws\\jerseyServer\\campeonato.xml");
        return "recibido ";
    }
   
     @DELETE
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deletePiloto( @PathParam("id") int id) {
    	 campeonato.getPiloto().remove(id-1);
     	this.jaxb.jaxbWriter(this.campeonato, "C:\\Users\\sala a\\Documents\\Nueva carpeta\\ws\\jerseyServer\\campeonato.xml");
        
        return "eliminado id, lista n "+lista.size();
    }
   
     @PUT
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
     @Consumes("application/json")
public String editPiloto( @PathParam("id") int id,Piloto piloto) {
    	 campeonato.getPiloto().set(id-1, piloto);
      	this.jaxb.jaxbWriter(this.campeonato, "C:\\Users\\sala a\\Documents\\Nueva carpeta\\ws\\jerseyServer\\campeonato.xml");
         

    	 
        return "modificado ";
    }
   
}
