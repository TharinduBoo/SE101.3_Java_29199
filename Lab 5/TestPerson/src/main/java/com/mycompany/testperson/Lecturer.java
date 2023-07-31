
package com.mycompany.testperson;
public class Lecturer extends Person {
    private String programme;

    public Lecturer(String name, int id, String programme) {
        super(name, id);
        this.programme = programme;
    }

    // Getter and Setter for programme
    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
}
