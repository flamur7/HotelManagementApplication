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

public interface HotelInterface
{
    void create(final Hotel h) throws CrudFormException;
    
    void edit(final Hotel h) throws CrudFormException;
    
    void delete(final Hotel h) throws CrudFormException;
    
    List<Hotel> findAll() throws CrudFormException;
    
    Hotel findByID(final Integer h) throws CrudFormException;
}
