/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Student
        Student student = new Student("John Doe", "123456");
        System.out.println("Name: " + student.getName());
        System.out.println("NPM: " + student.getNpm());

        // Membuat objek User
        User user = new User(1, "johndoe");
        System.out.println("ID: " + user.getId());
        System.out.println("Username: " + user.getUsername());
        
        // Membuat objek log
        Log log = new Log ("3284363","dsreuydu");
        System.out.println("id: " + log.getid());
        System.out.println("user: " + log.getuser());
        
        // Membuat objek config
        config config = new config ("12093174");
        System.out.println("id= " + config.getid());
        
        // Membuat objek pustakawan
        pustakawan orang = new pustakawan("23657","baru","beny");
        System.out.println("id: " + orang.getid());
        System.out.println("user: " + orang.getuser());
        System.out.println("nama: " + orang.getnama());
        
        
        
        // Membuat objek anggota
        anggota perpus = new anggota("134838382","beny","4");
        System.out.println("no_induk: " + perpus.getno_induk());
        System.out.println("nama: " + perpus.getnama());
        System.out.println("kelas: " + perpus.getkelas());
        
        //Membuat objek peminjaman
        peminjaman book = new peminjaman("1374721","beny","sosiologi");
        System.out.println("id: " + book.getid());
        System.out.println("siswa: " + book.getsiswa());
        System.out.println("buku: " + book.getbuku());
        
        //Membaut objek buku
        buku panjang = new buku("131434","2A","Matematika");
        System.out.println("no: " + panjang.getno());
        System.out.println("kode_buku: " + panjang.getkode_buku());
        System.out.println("kelas: " + panjang.getjudul());
        
        //Membbua objek kas
        kas internal = new kas("1241324","kamis","sabtu","mencukupi");
        System.out.println("id: " + internal.getid());
        System.out.println("masuk: " + internal.getmasuk());
        System.out.println("keluar: " + internal.getkeluar());
        System.out.println("saldo: " + internal.getsaldo());
        
        //Membuat objek telat
        telat denda = new telat("185394","IPA","7C","9 maret");
        System.out.println("id: " + denda.getid());
        System.out.println("buku: " + denda.getbuku());
        System.out.println("siswa: " + denda.getsiswa());
        System.out.println("tanggal: " + denda.gettanggal());
    }
}
