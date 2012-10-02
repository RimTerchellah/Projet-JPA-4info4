package tn.esprit.f1LifeTiming.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Race
 *
 */
@Entity

public class Race implements Serializable {

	
	private int idRace;
	private String location;
	private static final long serialVersionUID = 1L;

	public Race() {
		super();
	}   
	@Id    
	public int getIdRace() {
		return this.idRace;
	}

	public void setIdRace(int idRace) {
		this.idRace = idRace;
	}   
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
   
}
