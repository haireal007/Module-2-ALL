package model;

public class Gamer  {
    private String nameG;
    private String passG;

    public Gamer() {
    }

    public Gamer(String nameG, String passG) {
        this.nameG = nameG;
        this.passG = passG;
    }

    public String getNameG() {
        return nameG;
    }

    public void setNameG(String nameG) {
        this.nameG = nameG;
    }

    public String getPassG() {
        return passG;
    }

    public void setPassG(String passG) {
        this.passG = passG;
    }
}
