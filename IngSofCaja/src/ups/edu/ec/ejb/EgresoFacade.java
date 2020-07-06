package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelos.Egreso;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/cmalena22/IngSofCaja.git
@Stateless
public class EgresoFacade extends AbstractFacade<Egreso> {
	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public EgresoFacade() {
		super(Egreso.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
