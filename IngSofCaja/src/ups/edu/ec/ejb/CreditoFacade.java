package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelos.Credito;

public class CreditoFacade extends AbstractFacade<Credito>{

	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public CreditoFacade() {
		super(Credito.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
