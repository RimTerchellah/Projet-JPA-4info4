package model.oneToManyBi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: F
 * 
 */
@Entity
public class F implements Serializable {

	private int idF;

	private E e;

	private static final long serialVersionUID = 1L;

	public F() {
		super();
	}

	@Id
	public int getIdF() {
		return this.idF;
	}

	public void setIdF(int idF) {
		this.idF = idF;
	}

	@ManyToOne
	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

}
