/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Pasien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class IgdTableModel extends AbstractTableModel{
    List<Pasien> pasien=new ArrayList<Pasien>();
 
    private final String HEADER[]={"KTP","Nama","Umur","Alamat"};
    
    public IgdTableModel(List<Pasien> pasien){
        this.pasien=pasien;
    }

    public IgdTableModel() {
        
    }

     @Override
    public int getRowCount() {
        return pasien.size();
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
        Pasien ps=pasien.get(rowIndex);
        
        switch(columnIndex){
            case 0: return ps.getPasien_ktp();
            case 1: return ps.getNama();
            case 2: return ps.getUmur();
            case 3: return ps.getAlamat();
        }
        return null;
    }
}
