package models;


import javax.persistence.*;

@Entity
@Table(name ="films")
public class Film {
    private int id;
    private String title;
    private Director director;
    private int ageRating;

    public Film(){
    }

    public Film(String title, Director director, int ageRating){
        this.title = title;
        this.director = director;
        this.ageRating = ageRating;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @ManyToOne
    @JoinColumn(name = "director", nullable = false)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Column( name = "age_ating")
    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }
}
