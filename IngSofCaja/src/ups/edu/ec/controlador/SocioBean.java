package ups.edu.ec.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ModuloSocio.Socio;
import ups.edu.ec.ejb.SocioFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class SocioBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@EJB
	private SocioFacade ejbSocioFacade;
	private String nombre;
	private String apellido;
	private String telefono;
	private String cedula;
	private double salario;
	private String perfil;
	private String trabajo;
	private List<Socio>listaSocio;
	public SocioBean() {

	}

	@PostConstruct
	public void init() {
		listaSocio = ejbSocioFacade.findAll();
	}

	public SocioFacade getEjbSocioFacade() {
		return ejbSocioFacade;
	}
	public void setEjbSocioFacade(SocioFacade ejbSocioFacade) {
		this.ejbSocioFacade = ejbSocioFacade;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}
	public List<Socio> getListaSocio() {
		return listaSocio;
	}
	public void setListaSocio(List<Socio> listaSocio) {
		this.listaSocio = listaSocio;
	}
	
	public String add() {
		System.out.println("cedula"+this.cedula);
		System.out.println("nombre"+this.nombre);
	System.out.println("apellido"+this.apellido);
	System.out.println("telefono"+this.telefono);
	System.out.println("salario"+this.salario);
	System.out.println("perfil"+this.perfil);
	System.out.println("trabajo"+this.trabajo);
		ejbSocioFacade.create(new Socio(this.nombre,this.apellido,this.telefono,this.cedula,this.salario,this.perfil,this.trabajo));
		return null;
		
	}
	
	
	
}
