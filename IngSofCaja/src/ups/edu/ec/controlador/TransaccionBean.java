package ups.edu.ec.controlador;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ModuloTrasaccion.CuentaAhorro;
import ec.ups.edu.ModuloSocio.Socio;
import ec.ups.edu.ModuloTrasaccion.Transaccion;
import ups.edu.ec.ejb.CuentaAhorroFacade;
import ups.edu.ec.ejb.HistorialAhorroFacade;
import ups.edu.ec.ejb.TransaccionFacade;
import ups.edu.ec.modelos.HistorialAhorro;
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class TransaccionBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@EJB
	private TransaccionFacade ejbTransaccionFacade;
	private HistorialAhorroFacade ejbHistorialFacade;
	@EJB
	private CuentaAhorroFacade ejbCuentaFacade;
	private String fecha;
	private double monto;
	private String direccion;
	private String tipoTransaccion;
	private String CuentaAhorro;
	private List<Transaccion>listaTransaccion;
	private String socio;
	private Date fechaHistoria;
	public TransaccionBean() {
		
	}
	
	@PostConstruct
	public void init() {
		listaTransaccion = ejbTransaccionFacade.findAll();
	}

	public CuentaAhorroFacade getEjbCuentaFacade() {
		return ejbCuentaFacade;
	}

	public void setEjbCuentaFacade(CuentaAhorroFacade ejbCuentaFacade) {
		this.ejbCuentaFacade = ejbCuentaFacade;
	}

	public HistorialAhorroFacade getEjbHistorialFacade() {
		return ejbHistorialFacade;
	}

	public void setEjbHistorialFacade(HistorialAhorroFacade ejbHistorialFacade) {
		this.ejbHistorialFacade = ejbHistorialFacade;
	}

	public Date getFechaHistoria() {
		return fechaHistoria;
	}

	public void setFechaHistoria(Date fechaHistoria) {
		this.fechaHistoria = fechaHistoria;
	}

	public String getSocio() {
		return socio;
	}

	public void setSocio(String socio) {
		this.socio = socio;
	}

	public TransaccionFacade getEjbTransaccionFacade() {
		return ejbTransaccionFacade;
	}
	public void setEjbTransaccionFacade(TransaccionFacade ejbTransaccionFacade) {
		this.ejbTransaccionFacade = ejbTransaccionFacade;
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
	public List<Transaccion> getListaTransaccion() {
		return listaTransaccion;
	}
	public void setListaTransaccion(List<Transaccion> listaTransaccion) {
		this.listaTransaccion = listaTransaccion;
	}
	
	public  String add() {
		System.out.println("fecha"+this.fecha);
		System.out.println("monto"+this.monto);
		System.out.println("direccion"+this.direccion);
		System.out.println("tipo Transaccion"+this.tipoTransaccion);
		System.out.println("xuebta"+this.CuentaAhorro);
		System.out.println("Cuentaaaaaaaaaaaa");
		if (tipoTransaccion.equalsIgnoreCase("deposito")) {
			System.out.println("deposiiiitoooooooooo");
			System.out.println(cuentaAhorro().getSaldoCuenta()+this.monto);
			CuentaAhorro cc=ejbCuentaFacade.find(cuentaAhorro().getId());
			cc.setSaldoCuenta(cuentaAhorro().getSaldoCuenta()+this.monto);
			ejbCuentaFacade.edit(cc);		
			System.out.println("Saldo");
			System.out.println(cc.getSaldoCuenta());
			ejbTransaccionFacade.create(new Transaccion(this.fecha,this.monto,this.direccion,this.tipoTransaccion,cuentaAhorro()));
			
		}else
		{
			System.out.println("Retirrrrrrrrooooooooooooo");
			if (this.monto<=cuentaAhorro().getSaldoCuenta()) {
				System.out.println(cuentaAhorro().getSaldoCuenta()-this.monto);
				CuentaAhorro cc=ejbCuentaFacade.find(cuentaAhorro().getId());
				cc.setSaldoCuenta(cuentaAhorro().getSaldoCuenta()-this.monto);
				ejbCuentaFacade.edit(cc);		
				System.out.println("Saldo");
				System.out.println(cc.getSaldoCuenta());
				System.out.println("retiro");
				ejbTransaccionFacade.create(new Transaccion(this.fecha,this.monto,this.direccion,this.tipoTransaccion,cuentaAhorro()));
				
			}else
				{
				System.out.println("No tiene saldo");
				}
			
		}
		
		listaTransaccion = ejbTransaccionFacade.findAll();
		return null;
		
	}
	public String ahorro() {
		System.out.println("Hola");
System.out.println(CuentaAhorro);
return CuentaAhorro;		
	}
	public CuentaAhorro cuentaAhorro() {
		CuentaAhorro cuen= new CuentaAhorro();
		cuen=ejbTransaccionFacade.nombreCuenta(CuentaAhorro);
		System.out.println(cuen);
		return cuen;
		
	}
	
}