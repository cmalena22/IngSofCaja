package ups.edu.ec.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import ups.edu.ec.modelos.TablaAmortizacion;

public class TablaAmortizacionFacade extends  AbstractFacade<TablaAmortizacion> {

	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public TablaAmortizacionFacade() {
		super(TablaAmortizacion.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
