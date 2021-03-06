package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.ModuloTrasaccion.Credito;
import ups.edu.ec.modelos.Ingreso;


@Stateless
public class IngresoFacade extends AbstractFacade<Ingreso> {
	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public IngresoFacade() {
		super(Ingreso.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
