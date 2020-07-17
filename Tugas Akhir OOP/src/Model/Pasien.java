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
public class Pasien extends Person{
    private String pasien_ktp;
    private int kamar_nomor;
    private String dokter_nama;

    public String getPasien_ktp() {
        return pasien_ktp;
    }

    public void setPasien_ktp(String pasien_ktp) {
        this.pasien_ktp = pasien_ktp;
    }

    public int getKamar_nomor() {
        return kamar_nomor;
    }

    public void setKamar_nomor(int kamar_nomor) {
        this.kamar_nomor = kamar_nomor;
    }

    public String getDokter_nama() {
        return dokter_nama;
    }

    public void setDokter_nama(String dokter_nama) {
        this.dokter_nama = dokter_nama;
    }
    
    




    
    
}
