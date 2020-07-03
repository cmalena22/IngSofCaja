package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.ModuloTrasaccion.Credito;
import ups.edu.ec.modelos.LibroDiario;

public class LibroDiarioFacade extends AbstractFacade<LibroDiario>{
	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public LibroDiarioFacade() {
		super(LibroDiario.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
