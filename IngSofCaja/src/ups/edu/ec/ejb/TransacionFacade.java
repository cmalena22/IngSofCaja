package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelos.Administrador;
import ups.edu.ec.modelos.Transaccion;

public class TransacionFacade extends AbstractFacade<Transaccion>  {

	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public TransacionFacade() {
		super(Transaccion.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
