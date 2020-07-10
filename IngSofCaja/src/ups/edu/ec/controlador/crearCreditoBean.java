package ups.edu.ec.controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.ups.edu.ModuloTrasaccion.Credito;
import ec.ups.edu.ModuloTrasaccion.CuentaAhorro;
import ec.ups.edu.ModuloTrasaccion.Cuota;
import ups.edu.ec.ejb.CreditoFacade;
import ups.edu.ec.ejb.CuentaAhorroFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class crearCreditoBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@EJB
	private CreditoFacade ejbCreditoFacade;
	private String nombreRecomienda;
	private String cedulaRecomienda;
	private String bancoRecomendado;
	private String motivo;
	private List<Credito>listaCredito;
	private String cuentaAhorro;
	private int montoInicial;
	private double tasaInteres;
	private float pagoMensual;
	private int meses;
	private List<Float>listaCuota;
	public crearCreditoBean() {
	
	}
	
	@PostConstruct
	public void init() {		
		listaCredito = ejbCreditoFacade.findAll();
		listaCuota= new ArrayList<Float>();
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



	public void setPagoMensual(float pagoMensual) {
		this.pagoMensual = pagoMensual;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public CreditoFacade getEjbCreditoFacade() {
		return ejbCreditoFacade;
	}
	public void setEjbCreditoFacade(CreditoFacade ejbCreditoFacade) {
		this.ejbCreditoFacade = ejbCreditoFacade;
	}
	public String getNombreRecomienda() {
		return nombreRecomienda;
	}
	public void setNombreRecomienda(String nombreRecomienda) {
		this.nombreRecomienda = nombreRecomienda;
	}
	public String getCedulaRecomienda() {
		return cedulaRecomienda;
	}
	public void setCedulaRecomienda(String cedulaRecomienda) {
		this.cedulaRecomienda = cedulaRecomienda;
	}
	public String getBancoRecomendado() {
		return bancoRecomendado;
	}
	public void setBancoRecomendado(String bancoRecomendado) {
		this.bancoRecomendado = bancoRecomendado;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public List<Credito> getListaCredito() {
		return listaCredito;
	}
	public void setListaCredito(List<Credito> listaCredito) {
		this.listaCredito = listaCredito;
	}
	public String getCuentaAhorro() {
		return cuentaAhorro;
	}
	public void setCuentaAhorro(String cuentaAhorro) {
		this.cuentaAhorro = cuentaAhorro;
	}
	
	 public String add() {
		 System.out.println("nombre recomienta"+this.nombreRecomienda);
		 System.out.println("cedula Recomienda"+this.cedulaRecomienda);
		 System.out.println("banco recomienda"+this.bancoRecomendado);
		 System.out.println("motivo"+this.motivo);
		 System.out.println("cuenta ahorro"+this.cuentaAhorro);
		//	ejbCuentaAhorroFacade.create(new CuentaAhorro(this.numCuenta,this.saldoCuenta,this.capital,recu()));
			return null;
			
	}
	
	public String tabla() {
		System.out.println("Monto Inicial"+this.montoInicial);
		System.out.println("Tasa Interes"+this.tasaInteres);
		System.out.println("pago mensual"+this.pagoMensual);
		System.out.println("meses"+this.meses);
		return null;
		
	}
	public float interes() {
		float totalinteres=(float) ((this.tasaInteres*this.montoInicial)/100);
		System.out.println("interes"+totalinteres);
		
		float totalcuota=(this.montoInicial/this.meses);
		System.out.println("Cuota divido por mes"+totalcuota);
		pagoMensual=totalinteres+totalcuota;
		Cuota cuo= new Cuota();
		System.out.println("PAgo mensaul"+pagoMensual);
		for (int i = 0; i < this.meses; i++) {
			listaCuota.add(pagoMensual);
			System.out.println("lista de coutas");
			System.out.println(listaCuota);
		}
		return pagoMensual;		
	}
}
