package ec.ups.edu.ModuloTrasaccion;

import java.io.Serializable;
import javax.persistence.*;

import org.jboss.logging.annotations.Once;

/**
 * Entity implementation class for Entity: TablaAmortizacion
 *
 */
@Entity

public class TablaAmortizacion implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int montoInicial;
	private double tasaInteres;
	private float pagoMensual;
	@OneToOne
	@JoinColumn
	private Credito tabla;

	@Transient
	private boolean editable;
	public TablaAmortizacion() {
	
	}
	
	
	
	public TablaAmortizacion(int montoInicial,double tasaInteres, float pagoMensual, Credito tabla) {
		super();
		this.montoInicial = montoInicial;
		this.tasaInteres = tasaInteres;
		this.pagoMensual = pagoMensual;
		this.tabla = tabla;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMontoInicial() {
		return montoInicial;
	}
	public void setMontoInicial(int montoInicial) {
		this.montoInicial = montoInicial;
	}
	public double getTasaInteres() {
		return tasaInteres;
	}
	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	public double getPagoMensual() {
		return pagoMensual;
	}
	public void setPagoMensual(float pagoMensual) {
		this.pagoMensual = pagoMensual;
	}
	public Credito getTabla() {
		return tabla;
	}
	public void setTabla(Credito tabla) {
		this.tabla = tabla;
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
		TablaAmortizacion other = (TablaAmortizacion) obj;
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
		return "TablaAmortizacion [id=" + id + ", montoInicial=" + montoInicial + ", tasaInteres=" + tasaInteres
				+ ", pagoMensual=" + pagoMensual + ", tabla=" + tabla + "]";
	}
   
}
