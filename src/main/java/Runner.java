import db.DBDirector;
import db.DBHelper;
import models.Director;
import models.Film;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Director directorStephen = new Director("Stephen", "Spielburg");
            DBHelper.save(directorStephen);
        Director directorMichael = new Director("Michael", "Bay");
            DBHelper.save(directorMichael);

        Film filmJaws = new Film("Jaws", directorStephen, 15);
            DBHelper.save(filmJaws);
        Film filmJurassic = new Film("Jurassic Park", directorStephen, 12);
            DBHelper.save(filmJurassic);
        Film filmEt = new Film("ET", directorStephen, 0);
            DBHelper.save(filmEt);
        Film filmTransformers = new Film("Transformers", directorMichael, 15);
            DBHelper.save(filmTransformers);
        Film filmGain = new Film("Pain & Gain", directorMichael, 18);
            DBHelper.save(filmGain);

            List<Director> directors = DBHelper.getAll(Director.class);

            List<Film> films = DBHelper.getAll(Film.class);

            Director foundDirector = DBHelper.find(Director.class, directorMichael.getId());

            Film foundFilm = DBHelper.find(Film.class, filmJurassic.getId());

            List<Film> filmCatalogue = DBDirector.getfilmCatalogueForDirector(directorStephen);
    }
}