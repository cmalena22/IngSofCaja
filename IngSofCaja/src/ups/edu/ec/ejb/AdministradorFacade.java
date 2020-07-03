package ups.edu.ec.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ups.edu.ec.modelos.Administrador;


@Stateless
public class AdministradorFacade extends AbstractFacade<Administrador>{


	@PersistenceContext(unitName = "IngSofCaja")
	private EntityManager em;
	

	public AdministradorFacade() {
		super(Administrador.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	public Administrador inicio(String username, String password) {
		
    	Administrador ad=new Administrador();
   	 String query = "SELECT e " +
   		      "FROM Administrador e " +
   		      "WHERE e.correo = '" + username +
   		      "' AND " +
   		      " e.contrasena = '" + password + "'";
      	ad =em.createQuery(query, Administrador.class).getSingleResult();
   		      return ad;
   }
}

