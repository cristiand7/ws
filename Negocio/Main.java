package Negocio;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.*;

public class Main {

	public static void main(String[] args) {
		JaxbWriterReader jaxb = new JaxbWriterReader();
		Videotienda vt = (Videotienda) jaxb.jaxbReader(Videotienda.class, ".\\Data\\peliculas.xml");
		
		//List<Serie> series = vt.getSerie().remove(0);
		
		//Serie s = series.remove(0);
		Serie s = vt.getSerie().remove(0);
		
		//vt.setSerie(series);
		
		jaxb.jaxbWriter(vt, "peliculasSinSerie.xml");
	
		System.out.println("Se elimin� la serie "+s.getNombre()+" con director "+s.director.get(0).nombre+" en el documento peliculasSinSerie.txt");
		
		Serie serie = new Serie();
		
		serie.setNombre("Yugiho");
		
		Temporada t = new Temporada();
		t.setNumero(4);
		
		List<Capitulo> cps = new ArrayList<Capitulo>();
		
		Capitulo c = new Capitulo();
		c.setTitulo("La leyenda de los Dragones");
		c.setDuracion("20 min");
		cps.add(c);
		
		c = new Capitulo();
		c.setTitulo("Un enemigo inesperado");
		c.setDuracion("20 min");
		cps.add(c);
		
		t.setCapitulo(cps);
		
		List<Actor> actores = new ArrayList<Actor> ();
		
		Actor a = new Actor();
		a.setNombre("Yami");
		a.setApellido("Yugi");
		actores.add(a);
		
		a = new Actor();
		a.setNombre("Katsuya");
		a.setApellido("Jonouchi");
		actores.add(a);
		
		serie.setActor(actores);
		 
		
		List<Director> directores = new ArrayList<Director>();
		
		Director d = new Director();
		d.setNombre("Misuta");
		d.setApellido("Makkenji");
		directores.add(d);
		
		serie.setDirector(directores);
		
		serie.setTemporada(t);;
		
		vt.getSerie().add(serie);
		
		jaxb.jaxbWriter(vt, "peliculasConSerie.xml");
		
		System.out.println("Se agreg� la serie "+serie.getNombre()+" con director "+serie.director.get(0).nombre+" en el documento peliculasConSerie.txt");
		
	}
}
