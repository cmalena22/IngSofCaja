package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.ModuloSocio.Administrador;
import ec.ups.edu.ModuloTrasaccion.CuentaAhorro;
@Stateless
public class CuentaAhorroFacade extends AbstractFacade<CuentaAhorro> {

	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public CuentaAhorroFacade() {
		super(CuentaAhorro.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
}
