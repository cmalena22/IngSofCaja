package ups.edu.ec.controlador;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ModuloTrasaccion.Transaccion;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class TransaccionBeans implements Serializable {
	private static final long serialVersionUID = 1L;
	@EJB
	private String fecha;
	private double monto;
	private String direccion;
	private String tipoTransaccion;
	private String CuentaAhorro;
	//variable creada para ir a la transaccion
	private String ingreso;
	private List<Transaccion> listaTransaccion;
	public TransaccionBeans() {
	
	}

	public List<Transaccion> getListaTransaccion() {
		return listaTransaccion;
	}

	public void setListaTransaccion(List<Transaccion> listaTransaccion) {
		this.listaTransaccion = listaTransaccion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoTransaccion() {
		return tipoTransaccion;
	}

	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}

	public String getCuentaAhorro() {
		return CuentaAhorro;
	}

	public void setCuentaAhorro(String cuentaAhorro) {
		CuentaAhorro = cuentaAhorro;
	}

	public String getIngreso() {
		return ingreso;
	}

	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}
	
	public String process() {
		System.out.println("Transaccion");
		System.out.println("fecha"+this.fecha);
		System.out.println("monto"+this.monto);
		System.out.println("Cuenta"+this.CuentaAhorro);
		System.out.println("Tipo transaccion"+this.tipoTransaccion);
		return null;
		
	}
	
	
}
