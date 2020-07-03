package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelos.Administrador;
import ups.edu.ec.modelos.Cuota;

public class CuotaFacade extends AbstractFacade<Cuota> {

	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public CuotaFacade() {
		super(Cuota.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
