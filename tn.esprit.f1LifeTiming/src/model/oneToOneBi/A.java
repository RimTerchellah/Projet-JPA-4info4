package model.oneToOneBi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: A
 * 
 */
@Entity
public class A implements Serializable {

	private int idA;

	private B b;

	@OneToOne(mappedBy = "a")
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	private static final long serialVersionUID = 1L;

	public A() {
		super();
	}

	@Id
	public int getIdA() {
		return this.idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}

}
