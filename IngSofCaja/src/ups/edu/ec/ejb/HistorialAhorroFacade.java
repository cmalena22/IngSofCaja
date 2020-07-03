package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.ModuloTrasaccion.Credito;
import ups.edu.ec.modelos.HistorialAhorro;

public class HistorialAhorroFacade extends AbstractFacade<HistorialAhorro> {
	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public HistorialAhorroFacade() {
		super(HistorialAhorro.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
