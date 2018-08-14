package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="directors")
public class Director {
    private int id;
    private String firstName;
    private String lastName;
    private List<Film> filmCatalogue;

    public  Director(){}

    public Director(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId(){
        return id;}

    public void setId(int id){
        this.id = id;
        }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @OneToMany(mappedBy = "director", fetch = FetchType.EAGER)
    public List<Film> getFilmCatalogue() {
        return filmCatalogue;
    }

    public void setFilmCatalogue(List<Film> filmCatalogue) {
        this.filmCatalogue = filmCatalogue;
    }
}
