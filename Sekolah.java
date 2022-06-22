/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sekolah;

/**
 *
 * @author newid
 */
public class Sekolah {
    /**
     * @param args the command line arguments
     */
    //enkap
    private String nama;
    
    
    public String getNama() {
        return this.nama;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    //inheri
    public String Jurusan = "Rekayasa Perangkat Lunak";
    public void tampil(){
        System.out.println(Jurusan);
    }
    
    //polimor
    public void Biodata(String nama){
        System.out.println("Nama saya adalah "+ nama);
    }
    
    public void Biodata(int umur){
        System.out.println("Umur "+ umur);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Sekolah sekolah = new Sekolah();
        sekolah.Biodata("Carolina");
        sekolah.Biodata(20);
        
    }
    
}
