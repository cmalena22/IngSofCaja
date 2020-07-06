package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.ModuloTrasaccion.Credito;


@Stateless
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
