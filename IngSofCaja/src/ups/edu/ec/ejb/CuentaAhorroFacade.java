package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelos.Administrador;
import ups.edu.ec.modelos.CuentaAhorro;

public class CuentaAhorroFacade extends AbstractFacade<CuentaAhorro> {

	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public CuentaAhorroFacade() {
		super(CuentaAhorro.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
