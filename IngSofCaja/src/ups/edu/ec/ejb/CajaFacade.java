package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.ModuloTrasaccion.Credito;
import ups.edu.ec.modelos.Caja;

public class CajaFacade extends AbstractFacade<Caja>{
	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public CajaFacade() {
		super(Caja.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
