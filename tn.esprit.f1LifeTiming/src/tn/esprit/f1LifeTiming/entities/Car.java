package tn.esprit.f1LifeTiming.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Car
 *
 */
@Entity

public class Car implements Serializable {

	
	private int idCar;
	private String teamCar;
	private String driverCar;
	private static final long serialVersionUID = 1L;

	public Car() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdCar() {
		return this.idCar;
	}

	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}   
	public String getTeamCar() {
		return this.teamCar;
	}

	public void setTeamCar(String teamCar) {
		this.teamCar = teamCar;
	}   
	public String getDriverCar() {
		return this.driverCar;
	}

	public void setDriverCar(String driverCar) {
		this.driverCar = driverCar;
	}
   
}
