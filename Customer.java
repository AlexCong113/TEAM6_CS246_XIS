
public class Customer {
    private String ID;
    private String name;
    private String diachi;
    private String numberphone;

    public Customer(String ID, String name, String diachi, String numberphone) {
        this.ID = ID;
        this.name = name;
        this.diachi = diachi;
        this.numberphone = numberphone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }
    
}
