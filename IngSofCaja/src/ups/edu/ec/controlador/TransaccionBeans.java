package ups.edu.ec.controlador;

import java.io.Serializable;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ModuloTrasaccion.Transaccion;
import ups.edu.ec.ejb.TransaccionFacade;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class TransaccionBeans implements Serializable {
	private static final long serialVersionUID = 1L;
	@EJB
	private TransaccionFacade ejbTransaccionFacade;
	private String fecha;
	private double monto;
	private String direccion;
	private String tipoTransaccion;
	private List<Transaccion> listaTransaccion;
	public TransaccionBeans() {
		
	}
	@PostConstruct
	public void init() {
		listaTransaccion = ejbTransaccionFacade.findAll();	

	}
	
	public TransaccionFacade getEjbTransaccionFacade() {
		return ejbTransaccionFacade;
	}
	public void setEjbTransaccionFacade(TransaccionFacade ejbTransaccionFacade) {
		this.ejbTransaccionFacade = ejbTransaccionFacade;
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
	public List<Transaccion> getListaTransaccion() {
		return listaTransaccion;
	}
	public void setListaTransaccion(List<Transaccion> listaTransaccion) {
		this.listaTransaccion = listaTransaccion;
	}
	
	
	
	}
