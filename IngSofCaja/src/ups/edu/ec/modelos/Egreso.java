package ups.edu.ec.modelos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Egreso
 *
 */
@Entity

public class Egreso implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int montoIniciail;
	private String fecha;
	private double interesAhorros;
	private double InteresOtraInstitucio;
	@ManyToOne
	private Caja egreso;
	public Egreso() {
		super();
	}
   
}
