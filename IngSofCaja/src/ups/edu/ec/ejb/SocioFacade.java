package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.ModuloSocio.Administrador;
import ec.ups.edu.ModuloSocio.Socio;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/cmalena22/IngSofCaja.git
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
