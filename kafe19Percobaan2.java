public class kafe19Percobaan2 {
    public static void menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang, "+namaPelanggan+" !");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap Pembelian!");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - RP 15,000");
        System.out.println("2. Cappucino - RP 20,000");
        System.out.println("3. Latte - RP 22,000");
        System.out.println("4. Teh Tarik - RP 12,000");
        System.out.println("5. Roti Bakae - RP 10,000");
        System.out.println("6. Mie Goreng - RP 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan Pilih Menu yang anda inginkan.");
    }
    public static void main(String[] args) {
        menu("Andi",  true);
    }
}
