package model.manyToManyWithoutData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: J
 * 
 */
@Entity
public class Jardin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idJardin;

	public Jardin() {
		// TODO Auto-generated constructor stub
	}

	private List<Immo> immos;

	@Id
	public int getIdJardin() {
		return idJardin;
	}

	public void setIdJardin(int idJardin) {
		this.idJardin = idJardin;
	}

	@ManyToMany(mappedBy = "jardins")
	public List<Immo> getImmos() {
		return immos;
	}

	public void setImmos(List<Immo> immos) {
		this.immos = immos;
	}

}
