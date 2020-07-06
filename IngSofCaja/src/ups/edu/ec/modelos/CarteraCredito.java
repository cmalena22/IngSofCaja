package ups.edu.ec.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import ec.ups.edu.ModuloTrasaccion.Credito;

/**
 * Entity implementation class for Entity: CarteraCredito
 *
 */
@Entity

public class CarteraCredito implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String date;
	
	@OneToOne
	@JoinColumn
	private LibroDiario carteraCredito;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "creditoCartera")
	private List<Credito>listCredito;
	
	public CarteraCredito() {
		
	}

	
	
	public CarteraCredito(String date, LibroDiario carteraCredito) {
		super();
		this.date = date;
		this.carteraCredito = carteraCredito;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public LibroDiario getCarteraCredito() {
		return carteraCredito;
	}

	public void setCarteraCredito(LibroDiario carteraCredito) {
		this.carteraCredito = carteraCredito;
	}

	public List<Credito> getListCredito() {
		return listCredito;
	}

	public void setListCredito(List<Credito> listCredito) {
		this.listCredito = listCredito;
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
		CarteraCredito other = (CarteraCredito) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CarteraCredito [id=" + id + ", date=" + date + ", carteraCredito=" + carteraCredito + ", listCredito="
				+ listCredito + "]";
	}
   
}
