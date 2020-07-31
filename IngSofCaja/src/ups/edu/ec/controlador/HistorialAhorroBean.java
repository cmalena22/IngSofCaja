package ups.edu.ec.controlador;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ups.edu.ec.ejb.HistorialAhorroFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class HistorialAhorroBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@EJB
	private HistorialAhorroFacade ejbhistorialAhorro;
	
}  
