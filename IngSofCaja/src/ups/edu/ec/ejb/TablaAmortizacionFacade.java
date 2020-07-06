package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import ec.ups.edu.ModuloTrasaccion.TablaAmortizacion;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/cmalena22/IngSofCaja.git
@Stateless
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
