public class Mamalia extends Hewan {
    private String jenisMamalia;

    public Mamalia(String nama, int umur, String jenisMamalia) {
        super(nama, umur);
        this.jenisMamalia = jenisMamalia;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }

    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }

    public void menyusui() {
        System.out.println(getNama() + " sedang menyusui");
    }
}