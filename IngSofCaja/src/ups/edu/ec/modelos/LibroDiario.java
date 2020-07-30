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
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "carteraCredito")
	private CarteraCredito listCarteraCredito;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "historialAhorro")
	private HistorialAhorro listHistorialAhorro;
	
	@OneToOne
	@JoinColumn
	private Caja caja;
	private String monto;
	
	@Transient
	private boolean editable;
	
	public LibroDiario() {
	
	}
	
	



	public LibroDiario(int id, String fecha, Caja caja, String monto) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.caja = caja;
		this.monto = monto;
	}





	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public CarteraCredito getListCarteraCredito() {
		return listCarteraCredito;
	}
	public void setListCarteraCredito(CarteraCredito listCarteraCredito) {
		this.listCarteraCredito = listCarteraCredito;
	}
	public HistorialAhorro getListHistorialAhorro() {
		return listHistorialAhorro;
	}
	public void setListHistorialAhorro(HistorialAhorro listHistorialAhorro) {
		this.listHistorialAhorro = listHistorialAhorro;
	}
	public Caja getCaja() {
		return caja;
	}
	public void setCaja(Caja caja) {
		this.caja = caja;
	}
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibroDiario other = (LibroDiario) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LibroDiario [id=" + id + ", fecha=" + fecha + ", listCarteraCredito=" + listCarteraCredito
				+ ", listHistorialAhorro=" + listHistorialAhorro + ", caja=" + caja + ", monto=" + monto + "]";
	}

}
