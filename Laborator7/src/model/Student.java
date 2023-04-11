package model;

public class Student {

    private String nume;
    private String prenume;
    private String facultate;
    private String grupa;
    private Catalog catalog;

    public Student(String nume, String prenume, String facultate, String grupa) {
        this.nume = nume;
        this.prenume = prenume;
        this.facultate = facultate;
        this.grupa = grupa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", facultate='" + facultate + '\'' +
                ", grupa='" + grupa + '\'' +
                ", catalog=" + catalog.toStringNote() +
                '}';
    }
}
