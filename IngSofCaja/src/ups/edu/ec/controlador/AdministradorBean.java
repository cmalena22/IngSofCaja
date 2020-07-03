package ups.edu.ec.controlador;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;


import ups.edu.ec.ejb.AdministradorFacade;
import ups.edu.ec.modelos.Administrador;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class AdministradorBean implements Serializable{
	@EJB
	private AdministradorFacade ejbAdministradorFacade;
	private List<Administrador> list;
	private String correo;
	private String contrasena;
	
	public AdministradorBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public String inicio() {
		try {
		Administrador us = new Administrador();
		us = ejbAdministradorFacade.inicio(correo, contrasena);
			if (us != null ) {
				return "exito";
			} else {
				return "fallo";
			}
		} catch (Exception e) {
			return "fallo";
		}
         
	}
	
	
}
