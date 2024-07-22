public class VoucherWiFi {

    // Atribut VoucherWiFi
    private int id;
    private String nama; 
    private double kecepatan; 
    private int durasi; // dalam jam
    private double harga;
    
    public VoucherWiFi(){
        System.out.println("Object telah diciptakan, Constructor berjalan");  
    }
    
    public void naikkanHarga(){
        System.out.println("harga naik");
    }
    
    public void naikkanHarga(double kenaikan){
        this.harga += kenaikan;
        System.out.println("harga naik sebesar: " + kenaikan);
    }

    public void tampilkanDetailVoucher(){
        System.out.println("Detail Voucher WiFi:");
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " Mbps");
        System.out.println("Durasi: " + durasi + " jam");
        System.out.println("Harga: " + harga);
    }

    public void tambahDiskon(double diskon){
        this.harga -= diskon;
        System.out.println("Harga setelah diskon sebesar: " + diskon);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
