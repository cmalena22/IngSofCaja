package ups.edu.ec.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;


import ec.ups.edu.ModuloSocio.EstadoCuenta;
import ups.edu.ec.ejb.EstadoCuentaFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class EstadoCuentaBean implements Serializable {
	@EJB
	private EstadoCuentaFacade ejbEstadoCuenta;
	private List<EstadoCuenta>list;
	private double saldo;
	private String fecha;
	
	public EstadoCuentaBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@PostConstruct
	public void init() {
		 
		ejbEstadoCuenta.create(new EstadoCuenta(300,"2020-07-06"));
		 list= ejbEstadoCuenta.findAll();
	 }

	public EstadoCuenta[] getList() {
		return list.toArray(new EstadoCuenta[0]);
	}

	public void setList(List<EstadoCuenta> list) {
		this.list = list;
	}
	 
	 public String add() {
		 ejbEstadoCuenta.create(new EstadoCuenta(this.saldo,this.fecha));
			list =ejbEstadoCuenta.findAll();
			return null;
		    }

		    public String delete(EstadoCuenta c) {	
		    	ejbEstadoCuenta.remove(c);
			list = ejbEstadoCuenta.findAll();
			return null;
		    }

		    
		    //para que se muestren los editables del proyecto (input) para editar
		    public String edit(EstadoCuenta c) {
			c.setEditable(true);
			return null;
		    }

		    public String save(EstadoCuenta c) {
		    	ejbEstadoCuenta.edit(c);
			c.setEditable(false);
			return null;
		    }

		
		
	
	
	
}
