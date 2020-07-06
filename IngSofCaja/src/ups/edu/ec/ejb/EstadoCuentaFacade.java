package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import ec.ups.edu.ModuloSocio.EstadoCuenta;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/cmalena22/IngSofCaja.git
@Stateless
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
