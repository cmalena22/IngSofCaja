package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.ups.edu.ModuloSocio.Administrador;
import ec.ups.edu.ModuloSocio.Socio;
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
	public Socio nombreSocio(String nombre) {
		Socio cat = new Socio();
		try {
			String sql = "SELECT c FROM Socio c where c.nombre='" + nombre + "'";
			System.out.println(sql);
			Query query = em.createQuery(sql);
			cat = (Socio) query.getSingleResult();

		} catch (Exception e) {
			System.out.println("socio" + e.getMessage());
		}
		return cat;
	}
	
	
	public double suma() {
		double  saldo;
			String sql = "SELECT sum(c.saldoCuenta) FROM CuentaAhorro c";
			System.out.println(sql);
			Query query = em.createQuery(sql);
			saldo = (double) query.getSingleResult();
            System.out.println(saldo);
		return saldo;
	}

	
	

}
