package DawKine;

import java.util.List;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements CommandLineRunner {

	
	@Autowired
	private ServiceDawKine serviceDawKine;



	@Override
	public void run(String... args) throws Exception {
		
		/* QUITAR PARA AÑADIR PRODUCTOS POR DEFECTO EN LA BD
		
		*/
		Movie peli = new Movie();
		peli.setDirector("David Retamal");
		peli.setDuration(120);
		peli.setTitle("La Casta Susana y su putisima hermana");
		serviceDawKine.setMovie(peli);
		
		Movie peli2 = new Movie();
		peli2.setDirector("David");
		peli2.setDuration(12);
		peli2.setTitle("su putisima hermana");
		serviceDawKine.setMovie(peli2);
		
		Cinema cine1 = new Cinema();
		cine1.setName("Yelmocines");
		serviceDawKine.setCinema(cine1);
	
	}
	
	//Metodos del controlador de peliculas
	
	@RequestMapping(value = "/movies", method = RequestMethod.POST)
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
		serviceDawKine.setMovie(movie);
		return new ResponseEntity<>(movie, HttpStatus.CREATED);
	}
	

	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public List<Movie> getMovies(){
		return serviceDawKine.getMovies();
	}
	
	@RequestMapping(value = "/movie/{idMovie}", method = RequestMethod.GET)
	public Movie getMovie(@PathVariable long idMovie){
		return serviceDawKine.getMovie(idMovie);
	}
	
	//Metodos del controlador de cines

	
	@RequestMapping(value = "/cinemas", method = RequestMethod.POST)
	public ResponseEntity<Cinema> addCinema(@RequestBody Cinema cinema){
		serviceDawKine.setCinema(cinema);
		return new ResponseEntity<>(cinema, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/cinemas", method = RequestMethod.GET)
	public List<Cinema> getCinemas(){
		return serviceDawKine.getCinemas();
	}
	
	@RequestMapping(value = "/cinema/{idCinema}", method = RequestMethod.GET)
	public Cinema getCinema(@PathVariable long idCinema){
		return serviceDawKine.getCinema(idCinema);
	}
	
	//Metodos del controlador de usuarios

	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getUsers(){
		return serviceDawKine.getUsers();
	}
	
	@RequestMapping(value = "/user/{idUser}", method = RequestMethod.GET)
	public User getUser(@PathVariable long idUser){
		return serviceDawKine.getUser(idUser);
	}
}
