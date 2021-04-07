/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

/**
 *
 * @author hp
 */
import BLL.Hotel;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class HotelTableModel extends AbstractTableModel
{
    List<Hotel> list;
    String[] cols;
    
    public HotelTableModel() {
        this.cols = new String[] { "Nr.", "Hotel Description" };
    }
    
    public HotelTableModel(final List<Hotel> list) {
        this.cols = new String[] { "Nr.", "Hotel Description" };
        this.list = list;
    }
    
    public void addList(final List<Hotel> list) {
        this.list = list;
    }
    
    @Override
    public String getColumnName(final int col) {
        return this.cols[col];
    }
    
    @Override
    public int getRowCount() {
        return this.list.size();
    }
    
    public void remove(final int row) {
        this.list.remove(row);
    }
    
    public Hotel getHotel(final int index) {
        return this.list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return this.cols.length;
    }
    
    @Override
    public Object getValueAt(final int rowIndex, final int columnIndex) {
        final Hotel h = this.list.get(rowIndex);
        switch (columnIndex) {
            case 0: {
                return h.getHotelID();
            }
            case 1: {
                return h.getHotelDescription();
            }
            default: {
                return null;
            }
        }
    }
}
