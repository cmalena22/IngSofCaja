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
import ec.ups.edu.ModuloTrasaccion.TablaAmortizacion;
import ups.edu.ec.ejb.CreditoFacade;
import ups.edu.ec.ejb.TablaAmortizacionFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class crearCreditoBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@EJB
	private CreditoFacade ejbCreditoFacade;
	@EJB
	private TablaAmortizacionFacade ejbTablaFacade;
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
	private List<TablaAmortizacion>listaTabla;
	private TablaAmortizacion tabla;
	private Credito credito;
	public crearCreditoBean() {
	
	}
	
	@PostConstruct
	public void init() {		
		listaCredito = ejbCreditoFacade.findAll();
		listaTabla= new ArrayList<TablaAmortizacion>();
		this.tabla=new TablaAmortizacion();
		this.credito= new Credito();
	}
		
	public int getMontoInicial() {
		return montoInicial;
	}

	public Credito getCredito() {
		return credito;
	}

	public void setCredito(Credito credito) {
		this.credito = credito;
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
	
	public List<TablaAmortizacion> getListaTabla() {
		return listaTabla;
	}

	public void setListaTabla(List<TablaAmortizacion> listaTabla) {
		this.listaTabla = listaTabla;
	}

	public TablaAmortizacion getTabla() {
		return tabla;
	}

	public void setTabla(TablaAmortizacion tabla) {
		this.tabla = tabla;
	}

		public String add() {
		 credito.setBancoRecomendado(this.bancoRecomendado);
		 credito.setCedulaRecomienda(this.cedulaRecomienda);
		 credito.setMotivo(this.motivo);
		 credito.setNombreRecomienda(this.nombreRecomienda);
		 credito.setCredito(cuent());
		 System.out.println("Credito");
		 System.out.println(credito.toString());
		 ejbCreditoFacade.create(credito);
		
		 float totalinteres=(float) ((this.tasaInteres*this.montoInicial)/100);
			System.out.println("interes"+totalinteres);		
			float totalcuota=(this.montoInicial/this.meses);
			System.out.println("Cuota divido por mes"+totalcuota);
			pagoMensual=totalinteres+totalcuota;
			Cuota cuo= new Cuota();
			System.out.println("PAgo mensaul"+pagoMensual);
			for (int i = 0; i < this.meses; i++) {
				tabla.setId(i);
				tabla.setPagoMensual(pagoMensual);		
				tabla.setMontoInicial(this.montoInicial);
				tabla.setTasaInteres(this.tasaInteres);
				tabla.setTabla(credito);
				ejbTablaFacade.create(tabla);
				System.out.println("lista de coutas");
				System.out.println(tabla+"\n");
			}
			listaCredito = ejbCreditoFacade.findAll();
		 return null;		
	}
	
	public CuentaAhorro  cuent() {
		CuentaAhorro cu= new CuentaAhorro();
		 cu=ejbCreditoFacade.nombreCuenta(cuentaAhorro);
		 System.out.println("Recupere");
		 System.out.println(cu.toString());
		 return cu;		
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
			tabla.setPagoMensual(pagoMensual);		
			tabla.setMontoInicial(this.montoInicial);
			tabla.setTasaInteres(this.tasaInteres);
			System.out.println("lista de\n coutas");
			System.out.println(tabla+"\n");
		}
		return pagoMensual;		
	}
}
