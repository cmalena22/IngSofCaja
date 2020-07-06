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
public class TranBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@EJB
	private TransaccionFacade ejbTranFacade;
	private List<Transaccion> listatran;
	private double monto;
	public TranBean() {
		super();
	}
	@PostConstruct
	public void init() {		
		listatran = ejbTranFacade.findAll();
	}
	public TransaccionFacade getEjbTranFacade() {
		return ejbTranFacade;
	}
	public void setEjbTranFacade(TransaccionFacade ejbTranFacade) {
		this.ejbTranFacade = ejbTranFacade;
	}
	public List<Transaccion> getListatran() {
		return listatran;
	}
	public void setListatran(List<Transaccion> listatran) {
		this.listatran = listatran;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public String process() {
		System.out.println("monto"+this.monto);
		return null;
		
	}
}
