package ec.ups.edu.ModuloTrasaccion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import ec.ups.edu.ModuloSocio.Socio;
import ups.edu.ec.modelos.HistorialAhorro;

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
	
	@OneToOne
	@JoinColumn
	private Socio cuentaAhorroSocio;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "transaccion")	
	private List<Transaccion>transaccion;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "credito")
	//Mal ojooooooooo revisar
	private Credito credito;
	
	
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "cuentaAhorro")
	private List<HistorialAhorro> cuentaAhorro;
	public CuentaAhorro() {
		
	}
	
	
	




	public CuentaAhorro(String numCuenta, double saldoCuenta, int capital, Socio cuentaAhorroSocio) {
		super();
		this.numCuenta = numCuenta;
		this.saldoCuenta = saldoCuenta;
		this.capital = capital;
		this.cuentaAhorroSocio = cuentaAhorroSocio;
		transaccion = new ArrayList<Transaccion>();
		cuentaAhorro =new ArrayList<HistorialAhorro>();
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
	
	public Socio getCuentaAhorroSocio() {
		return cuentaAhorroSocio;
	}



	public void setCuentaAhorroSocio(Socio cuentaAhorroSocio) {
		this.cuentaAhorroSocio = cuentaAhorroSocio;
	}



	public List<Transaccion> getTransaccion() {
		return transaccion;
	}
	public void setTransaccion(List<Transaccion> transaccion) {
		this.transaccion = transaccion;
	}
	
	public Credito getCredito() {
		return credito;
	}
	public void setCredito(Credito credito) {
		this.credito = credito;
	}
	
	
	public List<HistorialAhorro> getCuentaAhorro() {
		return cuentaAhorro;
	}



	public void setCuentaAhorro(List<HistorialAhorro> cuentaAhorro) {
		this.cuentaAhorro = cuentaAhorro;
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
		return  numCuenta ;
	}
	

}
