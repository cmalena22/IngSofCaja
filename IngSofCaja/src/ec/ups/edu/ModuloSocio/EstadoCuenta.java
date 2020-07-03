package ups.edu.ec.modelos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: EstadoCuenta
 *
 */
@Entity

public class EstadoCuenta implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double saldo;
	private String fecha;
	@OneToOne 
	private Socio socio;
	public EstadoCuenta() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
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
		EstadoCuenta other = (EstadoCuenta) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EstadoCuenta [id=" + id + ", saldo=" + saldo + ", fecha=" + fecha + ", socio=" + socio + "]";
	}
   
}
