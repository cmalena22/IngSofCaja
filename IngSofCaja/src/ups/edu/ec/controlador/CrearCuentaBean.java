package ups.edu.ec.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ModuloSocio.Socio;
import ec.ups.edu.ModuloTrasaccion.CuentaAhorro;
import ups.edu.ec.ejb.CuentaAhorroFacade;
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class CrearCuentaBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@EJB
	private CuentaAhorroFacade ejbCuentaAhorroFacade;
	private String numCuenta;
	private double saldoCuenta;
	private int capital;
	private String socio;
	private List<CuentaAhorro>listaCuenta;
	
	
	public CrearCuentaBean() {
		super();
	}
	
	@PostConstruct
	public void init() {		
		listaCuenta = ejbCuentaAhorroFacade.findAll();
	}
	
	
	
	public CuentaAhorroFacade getEjbCuentaAhorroFacade() {
		return ejbCuentaAhorroFacade;
	}

	public void setEjbCuentaAhorroFacade(CuentaAhorroFacade ejbCuentaAhorroFacade) {
		this.ejbCuentaAhorroFacade = ejbCuentaAhorroFacade;
	}

	public List<CuentaAhorro> getListaCuenta() {
		return listaCuenta;
	}

	public void setListaCuenta(List<CuentaAhorro> listaCuenta) {
		this.listaCuenta = listaCuenta;
	}

	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	public int getCapital() {
		return capital;
	}
	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	

	public String getSocio() {
		return socio;
	}

	public void setSocio(String socio) {
		this.socio = socio;
	}

	public String process() {
		 
		return null;
	 }	
	 public Socio recu () {
		Socio so= new Socio();
		String nombre=so.getNombre();
		so=ejbCuentaAhorroFacade.nombreSocio(nombre);
		System.out.println(so);
		return so;
	 }
	 public String add() {
		 System.out.println("Num cuenta"+this.numCuenta);
		 System.out.println("saldo"+this.saldoCuenta);
		 System.out.println("Capital"+this.capital);
		 System.out.println("socio"+this.socio);
			ejbCuentaAhorroFacade.create(new CuentaAhorro(this.numCuenta,this.saldoCuenta,this.capital,recu()));
			return null;
			
		}
	 
	 public String tabla() {
		 
		return null;
		 
	 }
}
