public class HewanPeliharaan extends Mamalia {
    private String jenisHewan;
    private String warnaBulu;
    private String jenisAnjing;
    private String jenisKelinci;

    public HewanPeliharaan(String nama, int umur, String jenisMamalia, String jenisHewan, String warnaBulu, String jenisAnjing, String jenisKelinci) {
        super(nama, umur, jenisMamalia);
        this.jenisHewan = jenisHewan;
        this.warnaBulu = warnaBulu;
        this.jenisAnjing = jenisAnjing;
        this.jenisKelinci = jenisKelinci;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    public String getJenisAnjing() {
        return jenisAnjing;
    }

    public void setJenisAnjing(String jenisAnjing) {
        this.jenisAnjing = jenisAnjing;
    }

    public String getJenisKelinci() {
        return jenisKelinci;
    }

    public void setJenisKelinci(String jenisKelinci) {
        this.jenisKelinci = jenisKelinci;
    }

    public void meow() {
        System.out.println(getNama() + " sedang meow");
    }

    public void gonggong() {
        System.out.println(getNama() + " sedang gonggong");
    }

    public void melompat() {
        System.out.println(getNama() + " sedang melompat-lompat");
    }

    public void makan() {
        if (jenisHewan.equals("Kucing")) {
            System.out.println(getNama() + " sedang makan kucing");
        } else if (jenisHewan.equals("Anjing")) {
            System.out.println(getNama() + " sedang makan anjing");
        } else if (jenisHewan.equals("Kelinci")) {
            System.out.println(getNama() + " sedang makan kelinci");
        }
    }
}