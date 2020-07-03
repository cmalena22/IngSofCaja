package ups.edu.ec.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import ec.ups.edu.ModuloTrasaccion.Credito;

/**
 * Entity implementation class for Entity: CarteraCredito
 *
 */
@Entity

public class CarteraCredito implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String date;
	@ManyToOne
	private LibroDiario carteraCredito;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "credito")
	private List<Credito>listCredito;
	
	public CarteraCredito() {
		super();
	}
   
}
