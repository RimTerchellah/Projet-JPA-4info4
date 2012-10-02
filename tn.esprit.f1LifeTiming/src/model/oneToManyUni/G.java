package model.oneToManyUni;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: G
 * 
 */
@Entity
public class G implements Serializable {

	private int idG;

	private List<H> hs;

	private static final long serialVersionUID = 1L;

	public G() {
		super();
	}

	@Id
	public int getIdG() {
		return this.idG;
	}

	public void setIdG(int idG) {
		this.idG = idG;
	}

	@OneToMany
	public List<H> getHs() {
		return hs;
	}

	public void setHs(List<H> hs) {
		this.hs = hs;
	}

}
