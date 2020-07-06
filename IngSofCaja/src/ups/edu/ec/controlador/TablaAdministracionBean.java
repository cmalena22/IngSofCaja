package ups.edu.ec.controlador;

import java.io.Serializable;
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
public class TablaAdministracionBean implements Serializable{
	
	@EJB
	private int montoInicial;
	private double tasaInteres;
	private double pagoMensual;
	private List<TablaAmortizacion>lista;
	private TablaAmortizacionFacade ejbTabla;
	
	public TablaAdministracionBean() {
		super();
	}
	
	@PostConstruct
	public void init() {		
	lista =ejbTabla.findAll();
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
	public List<TablaAmortizacion> getLista() {
		return lista;
	}
	public void setLista(List<TablaAmortizacion> lista) {
		this.lista = lista;
	}
	public TablaAmortizacionFacade getEjbTabla() {
		return ejbTabla;
	}
	public void setEjbTabla(TablaAmortizacionFacade ejbTabla) {
		this.ejbTabla = ejbTabla;
	}
	
	public String process() {
		System.out.println("monto"+this.montoInicial);
		System.out.println("Tasa interes"+this.tasaInteres);
		System.out.println("pago"+this.pagoMensual);
		return null;
		
	}
	
}
