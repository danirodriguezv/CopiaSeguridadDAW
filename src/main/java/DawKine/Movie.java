package DawKine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String title;
	private String director;
	private String leading_actor;
	private String production;
	private long duration;
	private String short_description;
	private String long_description;
	private boolean threeD;
	private boolean twoD;
	private String movie_trailer;
	
	
	public String getGeneral_photo() {
		return general_photo;
	}
	public void setGeneral_photo(String general_photo) {
		this.general_photo = general_photo;
	}
	private String poster_photo;
	private String general_photo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLeading_actor() {
		return leading_actor;
	}
	public void setLeading_actor(String leading_actor) {
		this.leading_actor = leading_actor;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public String getShort_description() {
		return short_description;
	}
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	public String getLong_description() {
		return long_description;
	}
	public void setLong_description(String long_description) {
		this.long_description = long_description;
	}
	public boolean isThreeD() {
		return threeD;
	}
	public void setThreeD(boolean threeD) {
		this.threeD = threeD;
	}
	public boolean isTwoD() {
		return twoD;
	}
	public void setTwoD(boolean twoD) {
		this.twoD = twoD;
	}
	public String getMovie_trailer() {
		return movie_trailer;
	}
	public void setMovie_trailer(String movie_trailer) {
		this.movie_trailer = movie_trailer;
	}
	public String getPoster_photo() {
		return poster_photo;
	}
	public void setPoster_photo(String poster_photo) {
		this.poster_photo = poster_photo;
	}
	
	
	


}