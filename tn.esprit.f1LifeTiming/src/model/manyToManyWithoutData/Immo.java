package model.manyToManyWithoutData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: I
 * 
 */
@Entity
public class Immo implements Serializable {

	private int idImmo;

	private List<Jardin> jardins;

	private static final long serialVersionUID = 1L;

	public Immo() {
		// TODO Auto-generated constructor stub
	}

	@Id
	public int getIdImmo() {
		return idImmo;
	}

	public void setIdImmo(int idImmo) {
		this.idImmo = idImmo;
	}

	@ManyToMany
	public List<Jardin> getJardins() {
		return jardins;
	}

	public void setJardins(List<Jardin> jardins) {
		this.jardins = jardins;
	}

}
