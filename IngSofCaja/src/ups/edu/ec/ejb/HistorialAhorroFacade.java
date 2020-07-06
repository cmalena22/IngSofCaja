package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.ModuloTrasaccion.Credito;
import ups.edu.ec.modelos.HistorialAhorro;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/cmalena22/IngSofCaja.git
@Stateless
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
