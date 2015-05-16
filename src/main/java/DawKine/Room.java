package DawKine;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int numRoom;
	private CopyOnWriteArrayList<Seat> seats =  new CopyOnWriteArrayList<Seat>(); //Lista de asientos
	private long hour1; //Va el id de la pelicula que se reproduce en esa sala.
	private long hour2; //Va el id de la pelicula que se reproduce en esa sala.
	private long hour3; //Va el id de la pelicula que se reproduce en esa sala.
	private long hour4; //Va el id de la pelicula que se reproduce en esa sala.
	
	public long getHour1() {
		return hour1;
	}
	public void setHour1(long hour1) {
		this.hour1 = hour1;
	}
	public long getHour2() {
		return hour2;
	}
	public void setHour2(long hour2) {
		this.hour2 = hour2;
	}
	public long getHour3() {
		return hour3;
	}
	public void setHour3(long hour3) {
		this.hour3 = hour3;
	}
	public long getHour4() {
		return hour4;
	}
	public void setHour4(long hour4) {
		this.hour4 = hour4;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getRoom() {
		return numRoom;
	}
	public void setRoom(int room) {
		this.numRoom = room;
	}
	public List<Seat> getSchedules() {
		return seats;
	}
	public void setSchedules(CopyOnWriteArrayList<Seat> schedules) {
		this.seats = schedules;
	}
	
	
}