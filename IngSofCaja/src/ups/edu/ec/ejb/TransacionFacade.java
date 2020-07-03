package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

<<<<<<< HEAD
import ups.edu.ec.modelos.Transaccion;
=======
import ec.ups.edu.ModuloSocio.Administrador;
import ec.ups.edu.ModuloTrasaccion.Transaccion;
>>>>>>> branch 'master' of https://github.com/cmalena22/IngSofCaja.git



public class TransacionFacade extends AbstractFacade<Transaccion>  {

	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public TransacionFacade() {
		super(Transaccion.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
