package ups.edu.ec.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ups.edu.ec.ejb.HistorialAhorroFacade;
import ups.edu.ec.ejb.LibroDiarioFacade;
import ups.edu.ec.modelos.Caja;
import ups.edu.ec.modelos.HistorialAhorro;
import ups.edu.ec.modelos.LibroDiario;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class LibroDiarioBean implements Serializable{

	@EJB
	private LibroDiarioFacade ejbLibroDiario;
	private List<LibroDiario>list;
	private String fecha;
	private String monto;
	private int id;
	
	public LibroDiarioBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@PostConstruct
	public void init() {
		 list= ejbLibroDiario.findAll();
	 }
	
	public String add() {
		Caja ca=new Caja();
		ca.setId(1);
		 ejbLibroDiario.create(new LibroDiario(this.id,"2020/07/31",ca,"1000"));
		 list = ejbLibroDiario.findAll();
		 return null;
		    }
	
	 public String delete(LibroDiario c) {	
		 ejbLibroDiario.remove(c);
		list = ejbLibroDiario.findAll();
		return null;
	    }

	    
	    //para que se muestren los editables del proyecto (input) para editar
	    public String edit(LibroDiario c) {
		c.setEditable(true);
		return null;
	    }

	    public String save(LibroDiario c) {
	    	ejbLibroDiario.edit(c);
		c.setEditable(false);
		return null;
	    }


		public List<LibroDiario> getList() {
			return list;
		}


		public void setList(List<LibroDiario> list) {
			this.list = list;
		}


		public String getFecha() {
			return fecha;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public void setFecha(String fecha) {
			this.fecha = fecha;
		}


		public String getMonto() {
			return monto;
		}


		public void setMonto(String monto) {
			this.monto = monto;
		}
	
	    
}
