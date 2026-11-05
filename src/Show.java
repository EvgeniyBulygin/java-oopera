import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        System.out.println("Актёры спектакля \"" + title + "\":");
        for (Actor actorForPrint : listOfActors) {
            System.out.println(actorForPrint);
        }
    }

    public void addNewActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Актёр уже в списке!");
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println("Актёр успешно добавлен!");
    }

    public void changeActor(Actor newActor, String surname) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Этот актёр уже в списке!");
            return;
        }
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                System.out.println("Актёр заменён!");
                return;
            }
        }
        System.out.println("Не удалось заменить актёра. Нет актёра с такой фамилией.");
    }
}
