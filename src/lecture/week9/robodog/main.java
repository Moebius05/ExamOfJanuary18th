package lecture.week9.robodog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Ceasar ceasar = new Ceasar();

        int verschieben = 1;

        String plaintext = "ABC bis Z.";

        HappinessApplication happinessApplication = new HappinessApplication();
        for (int i = 0; i < 5; i++) {
            System.out.println(happinessApplication.findHappiestPlaces("lecture/week9/robodog/world-happiness-2017.csv").get(i));


        }
        System.out.println(
                FilmReader.getFilms("lecture/week9/robodog/films.csv").get(1).toString());

        performanceReader performanceReader = new performanceReader();

        System.out.println(performanceReader.getPerformance("lecture/week9/robodog/students-performance.csv"));
    }
}
