package ec.ups.edu.ModuloSocio;
import java.io.Serializable;
import javax.persistence.*;

import ec.ups.edu.ModuloTrasaccion.CuentaAhorro;


/**
 * Entity implementation class for Entity: Socio
 *
 */
@Entity

public class Socio implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private String apellido;
	private String telefono;
	private String cedula;
	private double salario;
	private String perfil;
	private String trabajo;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "socio")
<<<<<<< HEAD
	private EstadoCuenta estadoCuenta;
	
	
	@OneToOne
	@JoinColumn
	private CuentaAhorro cuentaAhorro;
	
=======
	private EstadoCuenta estadoCuenta;	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "cuentaAhorroSocio")
	private CuentaAhorro socio;

	@Transient
	private boolean editable;
>>>>>>> branch 'master' of https://github.com/cmalena22/IngSofCaja.git
	public Socio() {
		
	}	
	

	public Socio(String nombre, String apellido, String telefono, String cedula, double salario, String perfil,
			String trabajo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.cedula = cedula;
		this.salario = salario;
		this.perfil = perfil;
		this.trabajo = trabajo;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public EstadoCuenta getEstadoCuenta() {
		return estadoCuenta;
	}

	public void setEstadoCuenta(EstadoCuenta estadoCuenta) {
		this.estadoCuenta = estadoCuenta;
	}

	
	

	public CuentaAhorro getSocio() {
		return socio;
	}


	public void setSocio(CuentaAhorro socio) {
		this.socio = socio;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		if (id != other.id)
			return false;
		return true;
	}


	public boolean isEditable() {
		return editable;
	}


	public void setEditable(boolean editable) {
		this.editable = editable;
	}


	@Override
	public String toString() {
		return nombre;}



   
}
