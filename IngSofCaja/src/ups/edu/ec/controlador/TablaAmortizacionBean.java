package ups.edu.ec.controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ModuloTrasaccion.Credito;
import ec.ups.edu.ModuloTrasaccion.TablaAmortizacion;
import ups.edu.ec.ejb.CreditoFacade;
import ups.edu.ec.ejb.TablaAmortizacionFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class TablaAmortizacionBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@EJB
	private TablaAmortizacionFacade ejbTablaFacade;
	@EJB
	private CreditoFacade ejbCreditoFacade;
	private String credito;
	
	private List<TablaAmortizacion>listaTabla;
	
	public TablaAmortizacionBean() {
		
	}
	
	@PostConstruct
	public void init() {		
		listaTabla = ejbTablaFacade.findAll();
		
	}
	
	
	
	
	public CreditoFacade getEjbCreditoFacade() {
		return ejbCreditoFacade;
	}

	public void setEjbCreditoFacade(CreditoFacade ejbCreditoFacade) {
		this.ejbCreditoFacade = ejbCreditoFacade;
	}

	public List<TablaAmortizacion> getListaTabla() {
		return listaTabla;
	}

	public void setListaTabla(List<TablaAmortizacion> listaTabla) {
		this.listaTabla = listaTabla;
	}

	public TablaAmortizacionFacade getEjbTablaFacade() {
		return ejbTablaFacade;
	}
	public void setEjbTablaFacade(TablaAmortizacionFacade ejbTablaFacade) {
		this.ejbTablaFacade = ejbTablaFacade;
	}
	public String getCredito() {
		return credito;
	}
	public void setCredito(String credito) {
		this.credito = credito;
	}
	
	public String add() {
	Credito c= ejbCreditoFacade.find(credito);
	System.out.println("fgdfgsdfgsdgdg");
	System.out.println(c.toString());
		return null;
	}
	
}
