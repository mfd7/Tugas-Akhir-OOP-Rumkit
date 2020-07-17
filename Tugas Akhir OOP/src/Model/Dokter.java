/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class Dokter extends Person{
    private int dokter_id;
    private String spesialis;

    public Dokter() {
    }

    public Dokter(int dokter_id, String spesialis) {
        this.dokter_id = dokter_id;
        this.spesialis = spesialis;
    }

    public int getDokter_id() {
        return dokter_id;
    }

    public void setDokter_id(int dokter_id) {
        this.dokter_id = dokter_id;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
   
 
}
