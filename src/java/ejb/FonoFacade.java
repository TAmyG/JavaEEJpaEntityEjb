/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Fono;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tamyg
 */
@Stateless
public class FonoFacade extends AbstractFacade<Fono> {

    @PersistenceContext(unitName = "JavaEEJpaEntityEjbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FonoFacade() {
        super(Fono.class);
    }
    
}
