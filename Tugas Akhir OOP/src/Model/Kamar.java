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
public class Kamar {
    private int nomor;
    private String kelas;
    private String ketersediaan;

    public Kamar() {
    }

    public Kamar(int nomor, String kelas, String ketersediaan) {
        this.nomor = nomor;
        this.kelas = kelas;
        this.ketersediaan = ketersediaan;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKetersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(String ketersediaan) {
        this.ketersediaan = ketersediaan;
    }
    
    
}
