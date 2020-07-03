package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelos.Administrador;
import ups.edu.ec.modelos.EstadoCuenta;

public class EstadoCuentaFacade extends AbstractFacade<EstadoCuenta>{

	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public EstadoCuentaFacade() {
		super(EstadoCuenta.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
