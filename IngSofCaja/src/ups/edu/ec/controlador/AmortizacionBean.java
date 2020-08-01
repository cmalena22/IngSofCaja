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


import ec.ups.edu.ModuloTrasaccion.TablaAmortizacion;
import ups.edu.ec.ejb.TablaAmortizacionFacade;
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class AmortizacionBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@EJB
	private TablaAmortizacionFacade ejbAmortizacionFacade;
	private int montoInicial;
	private double tasaInteres;
	private double pagoMensual;
	
	private List<TablaAmortizacion>listatabla;
	
	//
	
	public AmortizacionBean() {
		super();
	}

	@PostConstruct
	public void init() {		
		listatabla = ejbAmortizacionFacade.findAll();
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
	public void setPagoMensual(double pagoMensual) {
		this.pagoMensual = pagoMensual;
	}
	public List<TablaAmortizacion> getListatabla() {
		return listatabla;
	}
	public void setListatabla(List<TablaAmortizacion> listatabla) {
		this.listatabla = listatabla;
	}
	
	public TablaAmortizacionFacade getEjbAmortizacionFacade() {
		return ejbAmortizacionFacade;
	}
	public void setEjbAmortizacionFacade(TablaAmortizacionFacade ejbAmortizacionFacade) {
		this.ejbAmortizacionFacade = ejbAmortizacionFacade;
	}
	
	public String process() {
		System.out.println("monto "+this.montoInicial);
		
		System.out.println("PAgo interes"+this.tasaInteres);
		System.out.println("PAgo mensual"+this.pagoMensual);
		return null;
	}

}
