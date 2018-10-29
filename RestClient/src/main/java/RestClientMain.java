import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 */

/**
 * @author sala a
 *
 */
public class RestClientMain {

	public static final String MY_SERVER_URL="http://localhost:8080/formula/";
	//public static final String RESTCOUNTRIES_SERVER_URL="http://restcountries.eu";
	public static void main(String args[]){
		Piloto p= new Piloto();
		p.setNombre("michael");
		p.setLugarNacimiento("Bogota");
		p.setBiografia("...");
		p.setIdPiloto(5);
		p.setFoto("...");
		p.setCampeonatos(2);
		p.setMultiplicador(0.0);
		p.setPodios(1);
		p.setNumero(2);
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target(MY_SERVER_URL);
		WebTarget helloWebTarget = webTarget.path("piloto/");
		Invocation.Builder invocationBuilder = helloWebTarget.request(MediaType.TEXT_PLAIN);
		Response response = invocationBuilder.post(Entity.entity(p,	MediaType.APPLICATION_JSON));
		
		//Response response = invocationBuilder.get();
		System.out.println("RESPONSE FROM SERVER code: "+response.getStatus());
		System.out.println("Media type: "+response.getMediaType().toString());
		String respuestaTexto = response.readEntity(String.class);
		System.out.println("Content: "+respuestaTexto);
		
		
	}

	
}
