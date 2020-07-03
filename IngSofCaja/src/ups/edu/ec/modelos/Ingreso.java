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
	@JoinColumn
	private Caja ingreso;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "listTransaccion")
	private List<Transaccion>listTransaccion;
	public Ingreso() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMontoInicial() {
		return montoInicial;
	}
	public void setMontoInicial(double montoInicial) {
		this.montoInicial = montoInicial;
	}
	public String getFechas() {
		return fechas;
	}
	public void setFechas(String fechas) {
		this.fechas = fechas;
	}
	public String getInteresMora() {
		return interesMora;
	}
	public void setInteresMora(String interesMora) {
		this.interesMora = interesMora;
	}
	public String getMultas() {
		return multas;
	}
	public void setMultas(String multas) {
		this.multas = multas;
	}
	public Caja getIngreso() {
		return ingreso;
	}
	public void setIngreso(Caja ingreso) {
		this.ingreso = ingreso;
	}
	public List<Transaccion> getListTransaccion() {
		return listTransaccion;
	}
	public void setListTransaccion(List<Transaccion> listTransaccion) {
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
		Ingreso other = (Ingreso) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Ingreso [id=" + id + ", montoInicial=" + montoInicial + ", fechas=" + fechas + ", interesMora="
				+ interesMora + ", multas=" + multas + ", ingreso=" + ingreso + ", listTransaccion=" + listTransaccion
				+ "]";
	}
   
}
