package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.ups.edu.ModuloTrasaccion.Transaccion;

public class TransaccionFacade extends AbstractFacade<Transaccion>{
	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public TransaccionFacade() {
		super(Transaccion.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
