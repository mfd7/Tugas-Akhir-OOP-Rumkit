/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Kamar;
import Model.Pasien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class KamarTableModel extends AbstractTableModel {
    List<Kamar> kamar=new ArrayList<Kamar>();
 
    private final String HEADER[]={"Nomor Kamar","Kelas","Ketersediaan"};
    
    public KamarTableModel(List<Kamar> kamar){
        this.kamar=kamar;
    }

    public KamarTableModel() {
        
    }

     @Override
    public int getRowCount() {
        return kamar.size();
    }
 
    @Override
    public int getColumnCount() {
        return HEADER.length;
    }
    
    @Override
    public String getColumnName(int column){
        return HEADER[column];
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Kamar km=kamar.get(rowIndex);
        
        switch(columnIndex){
            case 0: return km.getNomor();
            case 1: return km.getKelas();
            case 2: return km.getKetersediaan();
        }
        return null;
    }
}
