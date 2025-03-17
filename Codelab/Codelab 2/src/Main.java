import java.util.ArrayList;
import java.util.List;

class Nasabah {
    String nomorRekening;
    String nama;
    double saldo;

    public Nasabah(String nomorRekening, String nama, double saldo) {
        this.nomorRekening = nomorRekening;
        this.nama = nama;
        this.saldo = saldo;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
        System.out.println(nama + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    public void tarik(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(nama + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println(nama + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + nama);
        System.out.println("Saldo: Rp" + saldo);
    }
}

class SimulasiBank {
    public static void main(String[] args) {
        List<Nasabah> nasabahList = new ArrayList<>();
        nasabahList.add(new Nasabah("202310370311129", "Maharani", 500000.0));
        nasabahList.add(new Nasabah("202310370311307", "Amelia", 1000000.0));

        Nasabah maharani = nasabahList.get(0);
        Nasabah amelia = nasabahList.get(1);

        maharani.setor(200000.0);
        amelia.setor(500000.0);

        maharani.tarik(800000.0);
        amelia.tarik(300000.0);

        System.out.println();

        maharani.tampilkanInfo();
        System.out.println();
        amelia.tampilkanInfo();

        System.out.println("\nProcess finished with exit code 0");
    }
}