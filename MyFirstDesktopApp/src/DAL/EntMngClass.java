/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author hp
 */
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

public abstract class EntMngClass
{
    EntityManager em;
    
    public EntMngClass() {
        this.em = Persistence.createEntityManagerFactory("MyFirstDesktopAppPU").createEntityManager();
    }
}