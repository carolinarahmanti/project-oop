package sekolah;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author newid
 */
public class Siswa extends Sekolah {
    public static void main(String[] args) {
        Siswa s = new Siswa();
        s.tampil();
        s.Biodata("Carolina");
        s.Biodata(16);
        s.setNama("Carolina");
        System.out.println(s.getNama());
    }
}
