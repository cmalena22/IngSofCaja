package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.ups.edu.ModuloSocio.Socio;
import ec.ups.edu.ModuloTrasaccion.Credito;
import ec.ups.edu.ModuloTrasaccion.CuentaAhorro;


@Stateless
public class CreditoFacade extends AbstractFacade<Credito>{

	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public CreditoFacade() {
		super(Credito.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	public CuentaAhorro nombreCuenta(String nombre) {
		CuentaAhorro cat = new CuentaAhorro();
		try {
			String sql = "SELECT c FROM CuentaAhorro c where c.numCuenta='" + nombre + "'";
			System.out.println(sql);
			Query query = em.createQuery(sql);
			cat = (CuentaAhorro) query.getSingleResult();

		} catch (Exception e) {
			System.out.println("Cuenta" + e.getMessage());
		}
		return cat;
	}
}
