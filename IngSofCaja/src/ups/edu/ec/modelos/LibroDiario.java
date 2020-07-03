package ups.edu.ec.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: LibroDiario
 *
 */
@Entity

public class LibroDiario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fecha;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "carteraCredito")
	private List<CarteraCredito> listCarteraCredito;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "historial")
	private List<HistorialAhorro> listHistorialCredito;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "caja")
	private Caja caja;
	private String monto;
	public LibroDiario() {
		super();
	}
   
}
