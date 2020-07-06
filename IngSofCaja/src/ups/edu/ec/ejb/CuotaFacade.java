package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.ModuloSocio.Administrador;
import ec.ups.edu.ModuloTrasaccion.Cuota;
@Stateless
public class CuotaFacade extends AbstractFacade<Cuota> {

	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public CuotaFacade() {
		super(Cuota.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
