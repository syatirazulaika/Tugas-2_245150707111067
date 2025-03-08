package GajiPegawai;

public class Employee {
    private String nama;
    private String jabatan;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;
    private double bonus;

    public Employee() {
        this.nama = "";
        this.jabatan = "";
        this.gajiPokok = 0;
        this.tunjangan = 0;
        this.potongan = 0;
        this.bonus = 0;
    }

    public Employee(String nama, String jabatan, double gajiPokok, double tunjangan, double potongan, double bonus) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
        this.bonus = bonus;
    }

    public void setNama(String nama) { this.nama = nama; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }
    public void setGajiPokok(double gajiPokok) { this.gajiPokok = gajiPokok; }
    public void setTunjangan(double tunjangan) { this.tunjangan = tunjangan; }
    public void setPotongan(double potongan) { this.potongan = potongan; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    public String getNama() { return this.nama; }
    public String getJabatan() { return this.jabatan; }
    public double getGajiPokok() { return this.gajiPokok; }
    public double getTunjangan() { return this.tunjangan; }
    public double getPotongan() { return this.potongan; }
    public double getBonus() { return this.bonus; }

    public double hitungGajiTotal() {
        return gajiPokok + tunjangan + bonus - potongan;
    }

    public void displayInfo() {
        System.out.println("\n=== Informasi Pegawai ===");
        System.out.printf("Gaji Pokok   : Rp %,.2f%n", gajiPokok);
        System.out.printf("Tunjangan    : Rp %,.2f%n", tunjangan);
        System.out.printf("Bonus        : Rp %,.2f%n", bonus);
        System.out.printf("Potongan     : Rp %,.2f%n", potongan);
        System.out.printf("Total Gaji   : Rp %,.2f%n", hitungGajiTotal());        
    }

    public void tambahBonus(double tambahanBonus) {
        this.bonus += tambahanBonus;
    }
}
