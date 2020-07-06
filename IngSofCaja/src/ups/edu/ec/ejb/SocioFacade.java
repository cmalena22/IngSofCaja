package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.ModuloSocio.Administrador;
import ec.ups.edu.ModuloSocio.Socio;
@Stateless
public class SocioFacade extends AbstractFacade<Socio>{

	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public SocioFacade() {
		super(Socio.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	

}
