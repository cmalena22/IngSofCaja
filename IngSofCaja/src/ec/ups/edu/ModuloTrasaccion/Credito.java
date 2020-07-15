package ec.ups.edu.ModuloTrasaccion;

import java.io.Serializable;
import java.util.ArrayList;
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
	private String motivo;
	
	@OneToOne
	@JoinColumn
	private CuentaAhorro credito;	
	
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "tabla")
	private TablaAmortizacion tablaAmortizacion;
	
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cuota")
	private List<Cuota>listaCuota;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "creditoCartera")
	private List<CarteraCredito>listCreditoenCartera;
	private boolean aceptado=true;
	

	@Transient
	private boolean editable;
	public Credito() {
		
	}
	
	
	
	public Credito(String nombreRecomienda, String cedulaRecomienda, String bancoRecomendado, String motivo,
			CuentaAhorro credito, TablaAmortizacion tablaAmortizacion, CarteraCredito creditoCartera,
			boolean aceptado) {
		super();
		this.nombreRecomienda = nombreRecomienda;
		this.cedulaRecomienda = cedulaRecomienda;
		this.bancoRecomendado = bancoRecomendado;
		this.motivo = motivo;
		this.credito = credito;
		this.tablaAmortizacion = tablaAmortizacion;
		this.aceptado = aceptado;
		this.listaCuota=new ArrayList<Cuota>();
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
	public CuentaAhorro getCredito() {
		return credito;
	}
	public void setCredito(CuentaAhorro credito) {
		this.credito = credito;
	}
	public TablaAmortizacion getTablaAmortizacion() {
		return tablaAmortizacion;
	}
	public void setTablaAmortizacion(TablaAmortizacion tablaAmortizacion) {
		this.tablaAmortizacion = tablaAmortizacion;
	}

	
	public List<CarteraCredito> getListCreditoenCartera() {
		return listCreditoenCartera;
	}
	public void setListCreditoenCartera(List<CarteraCredito> listCreditoenCartera) {
		this.listCreditoenCartera = listCreditoenCartera;
	}
	
	  public void addCuota(Cuota cuota) {
			this.listaCuota.add(cuota);
		    }
	
	  
	  
	public boolean isEditable() {
		return editable;
	}



	public void setEditable(boolean editable) {
		this.editable = editable;
	}



	@Override
	public String toString() {
		return "Credito [id=" + id + ", nombreRecomienda=" + nombreRecomienda + ", cedulaRecomienda=" + cedulaRecomienda
				+ ", bancoRecomendado=" + bancoRecomendado + ", motivo=" + motivo + ", credito=" + credito;
	}



	

}
