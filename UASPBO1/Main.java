public class Main {
    public static void main(String[] args) {
        String variableString;
        Pengguna pengguna = new Pengguna();
        Buku buku = new Buku();
        VoucherWiFi voucher = new VoucherWiFi();

        // //  // Menggunakan method dari kelas Pengguna
        //  pengguna.login();
        //  pengguna.lupaPassword();
        //  pengguna.daftar();
 
        // //  // Menggunakan setter untuk mengatur nilai atribut
        //  pengguna.setId(1);
        //  pengguna.setUsername("user1");
        //  pengguna.setPassword("password1");
 
        // //  // Menggunakan getter untuk mendapatkan nilai atribut
        // System.out.println("============================================");
        //  System.out.println("ID: " + pengguna.getId());
        //  System.out.println("Username: " + pengguna.getUsername());
        //  System.out.println("Password: " + pengguna.getPassword());
        //  System.out.println("============================================");

        // // // Menggunakan method dari kelas Buku
        // buku.naikkanHarga();
        // buku.naikkanHarga(5000.0);
        // buku.tampilkanDetailBuku();
        // buku.tambahDiskon();

        // // // Menggunakan setter untuk mengatur nilai atribut
        // buku.setId(1);
        // buku.setJudul("Belajar Java");
        // buku.setPenulis("Penulis A");
        // buku.setJumlahHalaman(300);
        // buku.setHarga(75000.0);

        // // // Menggunakan getter untuk mendapatkan nilai atribut
        // System.out.println("ID: " + buku.getId());
        // System.out.println("Judul: " + buku.getJudul());
        // System.out.println("Penulis: " + buku.getPenulis()); 
        // System.out.println("Jumlah Halaman: " + buku.getJumlahHalaman());
        // System.out.println("Harga: " + buku.getHarga());
        // System.out.println("============================================");

         // Menggunakan method dari kelas VoucherWiFi
         voucher.naikkanHarga();
         voucher.naikkanHarga(5000.0);
         voucher.tampilkanDetailVoucher();
         voucher.tambahDiskon(1000.0);
 
         // Menggunakan setter untuk mengatur nilai atribut
         voucher.setId(1);
         voucher.setNama("Voucher Super Fast");
         voucher.setKecepatan(100.0);
         voucher.setDurasi(24);
         voucher.setHarga(15000.0);
 
         // Menggunakan getter untuk mendapatkan nilai atribut
         System.out.println("ID: " + voucher.getId());
         System.out.println("Nama: " + voucher.getNama());
         System.out.println("Kecepatan: " + voucher.getKecepatan());
         System.out.println("Durasi: " + voucher.getDurasi());
         System.out.println("Harga: " + voucher.getHarga());
         System.out.println("============================================");
 
         // Tampilkan detail voucher setelah diatur
         voucher.tampilkanDetailVoucher();
    }
    
}
