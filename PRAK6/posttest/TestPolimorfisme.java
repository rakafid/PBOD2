import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai  = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/* 
   1. Jelaskan manfaat polimorfisme pada kasus ini.

    Dengan polimorfisme inclusion, kita dapat memasukkan berbagai tipe pegawai 
    (Programmer, Manajer, dll.) ke dalam satu koleksi Pegawai dan hanya memanggil 
    tampilData() sehingga tiap objek menjalankan implementasinya masing-masing 

   2. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa
      permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
      
     penambahan pegawai4 dan pegawai5 mengharuskan pembuatan daftar terpisah 
     atau pengecekan tipe dengan instanceof dan casting untuk memanggil method 
     yang tepat, yang membuat kode menjadi rumit.
*/