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
	@JoinColumn
	private Caja egreso;
	public Egreso() {
	
	}
	
	
	
	public Egreso(int montoIniciail, String fecha, double interesAhorros, double interesOtraInstitucio, Caja egreso) {
		super();
		this.montoIniciail = montoIniciail;
		this.fecha = fecha;
		this.interesAhorros = interesAhorros;
		InteresOtraInstitucio = interesOtraInstitucio;
		this.egreso = egreso;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMontoIniciail() {
		return montoIniciail;
	}
	public void setMontoIniciail(int montoIniciail) {
		this.montoIniciail = montoIniciail;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getInteresAhorros() {
		return interesAhorros;
	}
	public void setInteresAhorros(double interesAhorros) {
		this.interesAhorros = interesAhorros;
	}
	public double getInteresOtraInstitucio() {
		return InteresOtraInstitucio;
	}
	public void setInteresOtraInstitucio(double interesOtraInstitucio) {
		InteresOtraInstitucio = interesOtraInstitucio;
	}
	public Caja getEgreso() {
		return egreso;
	}
	public void setEgreso(Caja egreso) {
		this.egreso = egreso;
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
		Egreso other = (Egreso) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Egreso [id=" + id + ", montoIniciail=" + montoIniciail + ", fecha=" + fecha + ", interesAhorros="
				+ interesAhorros + ", InteresOtraInstitucio=" + InteresOtraInstitucio + ", egreso=" + egreso + "]";
	}
   
}
