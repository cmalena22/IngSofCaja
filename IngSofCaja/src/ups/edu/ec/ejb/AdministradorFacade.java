package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelos.Administrador;






@Stateless
public class AdministradorFacade extends AbstractFacade<Administrador>{


	@PersistenceContext(unitName = "SoftwareCajadeAhorro")
	private EntityManager em;
	

	public AdministradorFacade() {
		super(Administrador.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
}
