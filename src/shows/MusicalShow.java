package shows;

import people.Actor;
import people.Director;

import java.util.ArrayList;

public class MusicalShow extends Show {
    private final String musicAuthor;
    private final String librettoText;

    public MusicalShow(
            String title,
            int duration,
            Director director,
            ArrayList<Actor> listOfActors,
            String musicAuthor,
            String librettoText
    ) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
