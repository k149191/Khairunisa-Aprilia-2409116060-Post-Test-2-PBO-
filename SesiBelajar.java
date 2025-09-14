package model;

import java.util.ArrayList;

public class SesiBelajar {
    private String namaSesi;
    private int waktuBelajar;       
    private int waktuIstirahat;
    ArrayList<String> daftarTugas;
    
    public SesiBelajar(String namaSesi, int waktuBelajar, int waktuIstirahat) {
        this.namaSesi = namaSesi;
        this.waktuBelajar = waktuBelajar;
        this.waktuIstirahat = waktuIstirahat;
        daftarTugas = new ArrayList<>();
    }
    
    public String getNamaSesi() {
        return namaSesi;
    }

    public void setNamaSesi(String namaSesi) {
        this.namaSesi = namaSesi;
    }
         
    public int getWaktuBelajar() {
        return waktuBelajar;
    }
    
    public void setWaktuBelajar (int waktuBelajar) {
        this.waktuBelajar = waktuBelajar;
    }
    
    public int getWaktuIstirahat() {
        return waktuIstirahat;
    }
    
    public void setWaktuIstirahat (int waktuIstirahat) {
        this.waktuIstirahat = waktuIstirahat;
    }
    
    public ArrayList<String> getDaftarTugas() {
        return daftarTugas;
    }
    
    public void tambahTugas(String tugas) {
        daftarTugas.add(tugas);
    }
}
