package DawKine;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cinema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private CopyOnWriteArrayList<Movie> movies;
	private CopyOnWriteArrayList<Room> rooms;
	
	public CopyOnWriteArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(CopyOnWriteArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	private String name;
	private String province;
	private int num_room;
	

	public Cinema() {
		setMovies(new CopyOnWriteArrayList<Movie>());
	}

	public Cinema(String name, String province, int num_rooms) {
		this.name = name;
		this.province = province;
		this.num_room = num_rooms;
		this.setMovies(new CopyOnWriteArrayList<Movie>());  //Para evitar errores de concurrencia
	}
	

	public int getNum_rooms() {
		return num_room;
	}

	public void setNum_rooms(int num_rooms) {
		this.num_room = num_rooms;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getProvince(){
		return this.province;
	}
	
	public void setProvince(String province){
		this.province = province;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(CopyOnWriteArrayList<Movie> movies) {
		this.movies = movies;
	}
}
