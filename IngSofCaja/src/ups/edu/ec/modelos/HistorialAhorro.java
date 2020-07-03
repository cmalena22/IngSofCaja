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
	
	@OneToOne
	@JoinColumn
	private LibroDiario historialAhorro;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "cuentaAhorro")
	private List<CuentaAhorro> cuentaAhorro;
	
	
	private static final long serialVersionUID = 1L;

	public HistorialAhorro() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}



	public LibroDiario getHistorialAhorro() {
		return historialAhorro;
	}

	public void setHistorialAhorro(LibroDiario historialAhorro) {
		this.historialAhorro = historialAhorro;
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
		HistorialAhorro other = (HistorialAhorro) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HistorialAhorro [id=" + id + ", date=" + date + ", historialAhorro=" + historialAhorro + "]";
	}

	

   
}
