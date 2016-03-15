/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tamyg
 */
@Stateless
public class PersonaFacade extends AbstractFacade<Persona> {

    @PersistenceContext(unitName = "JavaEEJpaEntityEjbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaFacade() {
        super(Persona.class);
    }
    
    public ArrayList<Persona> getAll(){
        ArrayList<Persona> retorno = new ArrayList<>();
        List<Persona> listaAux = this.findAll();
        for (final Persona p : listaAux) {
          retorno.add(p);
        }
        return retorno;
    }
    
}
