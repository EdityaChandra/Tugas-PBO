public class Main {
    public static void main(String[] args) {
        HewanPeliharaan kucing = new HewanPeliharaan("Kucing", 2, "Mamalia", "Kucing", "Hitam", "", "");
        HewanPeliharaan anjing = new HewanPeliharaan("Anjing", 3, "Mamalia", "Anjing", "", "Bulldog", "");
        HewanPeliharaan kelinci = new HewanPeliharaan("Kelinci", 1, "Mamalia", "Kelinci", "", "", "French Lop");

        kucing.makan();
        kucing.meow();

        anjing.makan();
        anjing.gonggong();

        kelinci.makan();
        kelinci.melompat();
    }
}