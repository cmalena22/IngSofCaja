package ec.ups.edu.ModuloTrasaccion;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import ups.edu.ec.modelos.CarteraCredito;

/**
 * Entity implementation class for Entity: Credito
 *
 */
@Entity

public class Credito implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombreRecomienda;
	private String cedulaRecomienda;
	private String bancoRecomendado;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cuenta")
	private CuentaAhorro cuentaahorro;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "tabla")
	private TablaAmortizacion tablaamort;
	private String motivo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cuota")
	private List<Cuota>listaCuota;
	@ManyToOne
	private CarteraCredito credito;
	private boolean aceptado=true;
	public Credito() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreRecomienda() {
		return nombreRecomienda;
	}
	public void setNombreRecomienda(String nombreRecomienda) {
		this.nombreRecomienda = nombreRecomienda;
	}
	public String getCedulaRecomienda() {
		return cedulaRecomienda;
	}
	public void setCedulaRecomienda(String cedulaRecomienda) {
		this.cedulaRecomienda = cedulaRecomienda;
	}
	public String getBancoRecomendado() {
		return bancoRecomendado;
	}
	public void setBancoRecomendado(String bancoRecomendado) {
		this.bancoRecomendado = bancoRecomendado;
	}
	public CuentaAhorro getCuentaahorro() {
		return cuentaahorro;
	}
	public void setCuentaahorro(CuentaAhorro cuentaahorro) {
		this.cuentaahorro = cuentaahorro;
	}
	public TablaAmortizacion getTablaamort() {
		return tablaamort;
	}
	public void setTablaamort(TablaAmortizacion tablaamort) {
		this.tablaamort = tablaamort;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public List<Cuota> getListaCuota() {
		return listaCuota;
	}
	public void setListaCuota(List<Cuota> listaCuota) {
		this.listaCuota = listaCuota;
	}
	public boolean isAceptado() {
		return aceptado;
	}
	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
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
		Credito other = (Credito) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Credito [id=" + id + ", nombreRecomienda=" + nombreRecomienda + ", cedulaRecomienda=" + cedulaRecomienda
				+ ", bancoRecomendado=" + bancoRecomendado + ", cuentaahorro=" + cuentaahorro + ", tablaamort="
				+ tablaamort + ", motivo=" + motivo + ", listaCuota=" + listaCuota + ", aceptado=" + aceptado + "]";
	}
   
}
