package ups.edu.ec.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Caja
 *
 */
@Entity

public class Caja implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String date;
	@OneToOne
	private LibroDiario caja;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "egreso")
	private List<Egreso>listEgreso;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "ingreso")
	private List<Ingreso>listIngreso;
	public Caja() {
		super();
	}
   
}
