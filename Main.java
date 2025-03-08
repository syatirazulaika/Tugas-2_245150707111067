package GajiPegawai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sytr = new Scanner(System.in);

        Employee pegawai1 = new Employee();
        System.out.println("DATA PEGAWAI ");
        System.out.print("Nama      : ");
        pegawai1.setNama(sytr.nextLine());
        System.out.print("Jabatan   : ");
        pegawai1.setJabatan(sytr.nextLine());
        System.out.print("Gaji Pokok: ");
        pegawai1.setGajiPokok(sytr.nextDouble());
        System.out.print("Tunjangan : ");
        pegawai1.setTunjangan(sytr.nextDouble());
        System.out.print("Potongan  : ");
        pegawai1.setPotongan(sytr.nextDouble());
        System.out.print("Bonus     : ");
        pegawai1.setBonus(sytr.nextDouble());

        pegawai1.displayInfo();

        System.out.print("Masukkan tambahan bonus untuk " + pegawai1.getNama() + ": ");
        double tambahanBonus = sytr.nextDouble();
        pegawai1.tambahBonus(tambahanBonus);
        pegawai1.displayInfo();

        sytr.close();
    }
}
