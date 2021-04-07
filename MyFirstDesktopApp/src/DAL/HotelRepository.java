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
import java.util.List;
import BLL.Hotel;

public class HotelRepository extends EntMngClass implements HotelInterface
{
    public void create(final Hotel h) throws CrudFormException {
        try {
            this.em.getTransaction().begin();
            this.em.persist((Object)h);
            this.em.getTransaction().commit();
        }
        catch (Exception e) {
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public void edit(final Hotel h) throws CrudFormException {
        try {
            this.em.getTransaction().begin();
            this.em.merge((Object)h);
            this.em.getTransaction().commit();
        }
        catch (Exception e) {
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public void delete(final Hotel h) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet. Per javet ne vijim");
    }
    
    @Override
    public List<Hotel> findAll() throws CrudFormException {
        try {
            return (List<Hotel>)this.em.createNamedQuery("Hotel.findAll").getResultList();
        }
        catch (Exception e) {
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }
    
    @Override
    public Hotel findByID(final Integer ID) throws CrudFormException {
        throw new UnsupportedOperationException("Not supported yet. Per javet ne vijim");
    }
}