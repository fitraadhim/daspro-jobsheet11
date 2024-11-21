public class modifikasiPengunjungKafe2 {
    public static void daftarPengunjung(String kategori, int... usiaPengunjung) {
        System.out.println("Kategori Pengunjung: " + kategori);
        System.out.println("Usia Pengunjung:");
        
        for (int i = 0; i < usiaPengunjung.length; i++) {
            System.out.println("- Usia " + (i + 1) + ": " + usiaPengunjung[i]);
        }
    }
    
    public static void main(String[] args) {
        daftarPengunjung("Anggota", 20, 25, 30);
    }
}
