package ups.edu.ec.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import ec.ups.edu.ModuloTrasaccion.Transaccion;

/**
 * Entity implementation class for Entity: Ingreso
 *
 */
@Entity

public class Ingreso implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double montoInicial;
	private String fechas;
	private String interesMora;
	private String multas;
	@ManyToOne
	private Caja ingreso;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "listTransaccion")
	private List<Transaccion>listTransaccion;
	public Ingreso() {
		super();
	}
   
}
