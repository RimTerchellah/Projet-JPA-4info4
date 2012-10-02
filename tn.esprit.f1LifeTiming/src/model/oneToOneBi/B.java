package model.oneToOneBi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: B
 * 
 */
@Entity
public class B implements Serializable {

	private int idB;

	private A a;

	private static final long serialVersionUID = 1L;

	public B() {
		super();
	}

	@Id
	public int getIdB() {
		return this.idB;
	}

	public void setIdB(int idB) {
		this.idB = idB;
	}

	@OneToOne
	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

}
