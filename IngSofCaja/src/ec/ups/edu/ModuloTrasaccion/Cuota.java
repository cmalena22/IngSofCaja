package ec.ups.edu.ModuloTrasaccion;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cuota
 *
 */
@Entity

public class Cuota implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String date;
	private String monto;
	private int numcuota;
	@ManyToOne
	@JoinColumn
	private Credito cuota;

	@Transient
	private boolean editable;
	public Cuota() {
	
	}
	
	
	
	public Cuota(String date, String monto, int numcuota, Credito cuota) {
		super();
		this.date = date;
		this.monto = monto;
		this.numcuota = numcuota;
		this.cuota = cuota;
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
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}
	public int getNumcuota() {
		return numcuota;
	}
	public void setNumcuota(int numcuota) {
		this.numcuota = numcuota;
	}
	public Credito getCuota() {
		return cuota;
	}
	public void setCuota(Credito cuota) {
		this.cuota = cuota;
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
		Cuota other = (Cuota) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	public boolean isEditable() {
		return editable;
	}



	public void setEditable(boolean editable) {
		this.editable = editable;
	}



	@Override
	public String toString() {
		return "Cuota [id=" + id + ", date=" + date + ", monto=" + monto + ", numcuota=" + numcuota + ", cuota=" + cuota
				+ "]";
	}
   
}
