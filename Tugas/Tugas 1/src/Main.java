//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

 class LoginSystem {

    static class Admin {
        String u, p;
        Admin(String u, String p) { this.u = u; this.p = p; }
        boolean login(String u, String p) { return this.u.equals(u) && this.p.equals(p); }
    }

    static class Mahasiswa {
        String n, i;
        Mahasiswa(String n, String i) { this.n = n; this.i = i; }
        boolean login(String n, String i) { return this.n.equals(n) && this.i.equals(i); }
        void displayInfo() { System.out.println("Nama: " + n + "\nNIM: " + i); }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Admin a = new Admin("admin", "password");
        Mahasiswa m = new Mahasiswa("John Doe", "12345");

        while (true) {
            System.out.println("1. Admin\n2. Mahasiswa\n3. Keluar\nPilihan: ");
            switch (s.nextInt()) {
                case 1:
                    s.nextLine();
                    System.out.print("Username: ");
                    String u = s.nextLine();
                    System.out.print("Password: ");
                    String p = s.nextLine();
                    System.out.println(a.login(u, p) ? "Login admin berhasil!" : "Login admin gagal!");
                    break;
                case 2:
                    s.nextLine();
                    System.out.print("Nama: ");
                    String n = s.nextLine();
                    System.out.print("NIM: ");
                    String i = s.nextLine();
                    if (m.login(n, i)) {
                        System.out.println("Login mahasiswa berhasil!");
                        m.displayInfo();
                    } else {
                        System.out.println("Login mahasiswa gagal!");
                    }
                    break;
                case 3:
                    System.out.println("Keluar.");
                    s.close();
                    return;
                default:
                    System.out.println("Tidak valid.");
            }
            System.out.println();
        }
    }
}