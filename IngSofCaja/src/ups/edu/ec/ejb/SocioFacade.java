package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelos.Administrador;
import ups.edu.ec.modelos.Socio;

public class SocioFacade extends AbstractFacade<Socio>{

	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public SocioFacade() {
		super(Socio.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	

}
