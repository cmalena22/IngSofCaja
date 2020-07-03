package ups.edu.ec.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Caja
 *
 */
@Entity

public class Caja implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String date;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "caja")
	private LibroDiario caja;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "egreso")
	private List<Egreso>listEgreso;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "ingreso")
	private List<Ingreso>listIngreso;
	public Caja() {
		
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
	public LibroDiario getCaja() {
		return caja;
	}
	public void setCaja(LibroDiario caja) {
		this.caja = caja;
	}
	public List<Egreso> getListEgreso() {
		return listEgreso;
	}
	public void setListEgreso(List<Egreso> listEgreso) {
		this.listEgreso = listEgreso;
	}
	public List<Ingreso> getListIngreso() {
		return listIngreso;
	}
	public void setListIngreso(List<Ingreso> listIngreso) {
		this.listIngreso = listIngreso;
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
		Caja other = (Caja) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Caja [id=" + id + ", date=" + date + ", caja=" + caja + ", listEgreso=" + listEgreso + ", listIngreso="
				+ listIngreso + "]";
	}
   
}
