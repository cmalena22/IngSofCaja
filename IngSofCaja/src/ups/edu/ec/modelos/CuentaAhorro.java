package ups.edu.ec.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CuentaAhorro
 *
 */
@Entity

public class CuentaAhorro implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String numCuenta;
	private double saldoCuenta;
	private int capital;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "socio")
	private Socio socio;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "cuenta")
	private List<Transaccion>transaccion;
	@OneToOne
	private Credito cuenta;
	public CuentaAhorro() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	public int getCapital() {
		return capital;
	}
	public void setCapital(int capital) {
		this.capital = capital;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public List<Transaccion> getTransaccion() {
		return transaccion;
	}
	public void setTransaccion(List<Transaccion> transaccion) {
		this.transaccion = transaccion;
	}
	public Credito getCuenta() {
		return cuenta;
	}
	public void setCuenta(Credito cuenta) {
		this.cuenta = cuenta;
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
		CuentaAhorro other = (CuentaAhorro) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CuentaAhorro [id=" + id + ", numCuenta=" + numCuenta + ", saldoCuenta=" + saldoCuenta + ", capital="
				+ capital + ", socio=" + socio + ", transaccion=" + transaccion + ", cuenta=" + cuenta + "]";
	}
   
}
