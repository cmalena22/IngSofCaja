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
	
	public AdministradorBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
