package ec.ups.edu.ModuloTrasaccion;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import ups.edu.ec.modelos.Ingreso;

/**
 * Entity implementation class for Entity: Transaccion
 *
 */
@Entity

public class Transaccion implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fecha;
	private double monto;
	private String direccion;
	private String tipoTransaccion;
	
	@ManyToOne
	@JoinColumn
	private CuentaAhorro transaccion;
	
	@ManyToOne
	@JoinColumn
	private Ingreso listTransaccion;
	
	public Transaccion() {
	
	}
	
	
	
	public Transaccion(String fecha, double monto, String direccion, String tipoTransaccion, CuentaAhorro transaccion) {
		super();
		this.fecha = fecha;
		this.monto = monto;
		this.direccion = direccion;
		this.tipoTransaccion = tipoTransaccion;
		this.transaccion = transaccion;
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
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTipoTransaccion() {
		return tipoTransaccion;
	}
	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}
	
	public CuentaAhorro getTransaccion() {
		return transaccion;
	}
	public void setTransaccion(CuentaAhorro transaccion) {
		this.transaccion = transaccion;
	}
	public Ingreso getListTransaccion() {
		return listTransaccion;
	}
	public void setListTransaccion(Ingreso listTransaccion) {
		this.listTransaccion = listTransaccion;
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
		Transaccion other = (Transaccion) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Transaccion [id=" + id + ", fecha=" + fecha + ", monto=" + monto + ", direccion=" + direccion
				+ ", tipoTransaccion=" + tipoTransaccion + ", transaccion=" + transaccion + ", listTransaccion="
				+ listTransaccion + "]";
	}
	
   
}
