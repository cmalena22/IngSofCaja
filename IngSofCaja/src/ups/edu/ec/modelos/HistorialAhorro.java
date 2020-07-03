package ups.edu.ec.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import ec.ups.edu.ModuloTrasaccion.CuentaAhorro;

/**
 * Entity implementation class for Entity: HistorialAhorro
 *
 */
@Entity

public class HistorialAhorro implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String date;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "historialCuentaAhorro")
	private List<CuentaAhorro>listcuentaAhorro;
	@ManyToOne
	private LibroDiario historial;
	private static final long serialVersionUID = 1L;

	public HistorialAhorro() {
		super();
	}
   
}
