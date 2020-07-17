/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Dokter;
import Model.Pasien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class DokterTableModel extends AbstractTableModel{
    List<Dokter> dokter=new ArrayList<Dokter>();
 
    private final String HEADER[]={"ID","Nama","Umur","Alamat","Spesialis"};
    
    public DokterTableModel(List<Dokter> dokter){
        this.dokter=dokter;
    }

    public DokterTableModel() {
        
    }

     @Override
    public int getRowCount() {
        return dokter.size();
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
        Dokter dkt=dokter.get(rowIndex);
        
        switch(columnIndex){
            case 0: return dkt.getDokter_id();
            case 1: return dkt.getNama();
            case 2: return dkt.getUmur();
            case 3: return dkt.getAlamat();
            case 4: return dkt.getSpesialis();
        }
        return null;
    }
}
