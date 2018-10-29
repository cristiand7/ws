package co.edu.javeriana.ws.rest;

import co.edu.javeriana.ws.entidades.Fibonnacci;
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

    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @GET
    @Path("/fibonacci/{num}")
    @Produces("application/json")
    public List<Fibonnacci> getFibonacci(@PathParam("num") int num) {
    	List<Fibonnacci> list=new ArrayList<>();
    	for (int i = 0; i < num; i++) {
           Fibonnacci fb=new Fibonnacci();
        	fb.setNum(fibonacci(i));
        	list.add(fb);
        }
     
        return list;
    }
    @GET
    @Path("/fibonacci/xml/{num}")
    @Produces("application/xml")
    public List<Fibonnacci> getFibonaccixml(@PathParam("num") int num) {
    	List<Fibonnacci> list=new ArrayList<>();
    	for (int i = 0; i < num; i++) {
           Fibonnacci fb=new Fibonnacci();
        	fb.setNum(fibonacci(i));
        	list.add(fb);
        }
     
        return list;
    }
    
    int fibonacci(int n)
    {
        if (n>1){
           return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
        }
        else if (n==1) {  // caso base
            return 1;
        }
        else if (n==0){  // caso base
            return 0;
        }
        else{ //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1; 
        }
    }
    
}
