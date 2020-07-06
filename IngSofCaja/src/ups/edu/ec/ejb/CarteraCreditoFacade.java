package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.ModuloTrasaccion.Credito;
import ups.edu.ec.modelos.CarteraCredito;
@Stateless
public class CarteraCreditoFacade extends AbstractFacade<CarteraCredito> {
	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public CarteraCreditoFacade() {
		super(CarteraCredito.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
