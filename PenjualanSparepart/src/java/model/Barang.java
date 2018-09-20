/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yurike
 */
public class Barang implements java.io.Serializable{
    private Integer kodeBarang;
    private String namaBarang;
    private double hargaJual;
    private double hargaBeli;
    private int satuan;
    private String kategori;
    
    public Barang(String namaBarang, double hargaJual, double hargaBeli, int satuan, String kategori){
        this.namaBarang = namaBarang;
        this.hargaJual = hargaJual;
        this.hargaBeli = hargaBeli;
        this.satuan = satuan;
        this.kategori = kategori;
    }
    
    public Barang(){
        
    }
    
    public Integer getKodeBarang(){
        return this.kodeBarang;
    }
    
    public void setKodeBarang(Integer kodeBarang){
        this.kodeBarang = kodeBarang;
    }
    
    public String getNamaBarang() {
        return this.namaBarang;
    }
    
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    
    public double getHargaJual() {
        return this.hargaJual;
    }
    
    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }
    
    public double getHargaBeli() {
        return this.hargaBeli;
    }
    
    public void setHargaBeli(double hargaBeli) {
        this.hargaBeli = hargaBeli;
    }
    
    public int getSatuan() {
        return this.satuan;
    }
    
    public void setSatuan(int satuan) {
        this.satuan = satuan;
    }
    
    public String getKategori() {
        return this.kategori;
    }
    
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
}
