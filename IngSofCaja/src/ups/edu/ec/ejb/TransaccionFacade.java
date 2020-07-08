package ups.edu.ec.ejb;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.ups.edu.ModuloSocio.Socio;
import ec.ups.edu.ModuloTrasaccion.CuentaAhorro;
import ec.ups.edu.ModuloTrasaccion.Transaccion;
@Stateless
public class TransaccionFacade extends AbstractFacade<Transaccion>{
	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public TransaccionFacade() {
		super(Transaccion.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	public CuentaAhorro nombreSocio(String cuenta) {
		CuentaAhorro cat = new CuentaAhorro();
		try {
			String sql = "SELECT c FROM CuentaAhorro c where c.numCuenta='" + cuenta + "'";
			System.out.println(sql);
			Query query = em.createQuery(sql);
			cat = (CuentaAhorro) query.getSingleResult();

		} catch (Exception e) {
			System.out.println("cuenta" + e.getMessage());
		}
		return cat;
	}
}
