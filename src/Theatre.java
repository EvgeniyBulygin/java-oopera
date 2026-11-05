import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        // 1
        Actor valera = new Actor("Валера", "Зайцев", Gender.MALE, 188);
        Actor ira = new Actor("Ира", "Помпухина", Gender.FEMALE, 169);
        Actor egor = new Actor("Егор", "Романов", Gender.MALE, 175);
        Director vasiliy = new Director("Василий", "Васельков", Gender.MALE, 13);
        Director larisa = new Director("Лариса", "Шарикова", Gender.FEMALE, 6);
        String musicAuthor = "Бах";
        String choreographer = "Баланчин";

        // 2
        Show show = new Show("Обыкновенная история", 94, vasiliy, new ArrayList<>());
        Opera opera = new Opera(
                "Евгений Онегин",
                150,
                larisa,
                new ArrayList<>(),
                musicAuthor,
                "Либретто по роману А. С. Пушкина",
                40
        );
        Ballet ballet = new Ballet(
                "Лебединое озеро",
                125,
                larisa,
                new ArrayList<>(),
                musicAuthor,
                "Либретто по мотивам старинных немецких легенд",
                choreographer
        );

        // 3
        show.addNewActor(valera);
        show.addNewActor(egor);

        opera.addNewActor(egor);
        opera.addNewActor(ira);
        opera.addNewActor(egor); // проверка

        ballet.addNewActor(valera);
        ballet.addNewActor(ira);

        // 4
        show.printActors();
        opera.printActors();
        ballet.printActors();

        // 5
        show.changeActor(ira, valera.getSurname());
        show.changeActor(ira, valera.getSurname()); // проверка
        show.printActors();

        // 6
        show.changeActor(valera, "Пум-пурум");

        // 7
        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
