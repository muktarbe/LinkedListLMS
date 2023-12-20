
import enums.Gender;
import madel.Actor;
import madel.Movie;
import madel.Producer;
import service.seviceInpl.MovieServiceImpl;

import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Producer producer1 = new Producer("Тимур","Бекмамбетов");
        Producer producer2 = new Producer("Антон","Златопольский");
        Producer producer3 = new Producer("Сергей","Сельянов");
        Producer producer4 = new Producer("Леонид","Верещагин");
        Producer producer5 = new Producer("Никита","Михалков");

        Actor actor1 = new Actor("Алина","ыы");
        Actor actor2 = new Actor("Дастан","ыы");
        Actor actor3 = new Actor("Арсен","ыы");
        Actor actor4 = new Actor("Эржан","ыы");
        Actor actor5 = new Actor("","ыы");

        Movie movie1 = new Movie("1+1=3", Year.of(2002), Gender.КАМЕДИА,producer1,actor1);
        Movie movie2 = new Movie("Аватар", Year.of(2003), Gender.БАЙВИК,producer2,actor2);
        Movie movie3 = new Movie("Переводчик", Year.of(2004), Gender.КАМЕДИА,producer3,actor3);
        Movie movie4 = new Movie("В путь", Year.of(2005), Gender.ПУТИШЕСТВИЕ,producer4,actor4);
        Movie movie5 = new Movie("Слова патсана", Year.of(2006), Gender.БАЙВИК,producer5,actor5);

        ArrayList<Movie> movieArrayList = new ArrayList<>();
        movieArrayList.add(movie1);
        movieArrayList.add(movie2);
        movieArrayList.add(movie3);
        movieArrayList.add(movie4);
        movieArrayList.add(movie5);

        MovieServiceImpl movieService = new MovieServiceImpl();

        while (true){
            menu();
            int scaner = scanner.nextInt();
            switch (scaner){
                case 1 -> System.out.println(movieService.getAllMovies(movieArrayList));
                case 2 -> {
                    System.out.print("Ведите название кино: ");
                    String scannerMovieName = scanner.next();
                    System.out.println(movieService.findMovieByNameOrPartName(movieArrayList, scannerMovieName));
                }
                case 3 -> {
                    System.out.print("Ведите имя актёра: ");
                    String scannerActorName = scanner.next();
                    System.out.println(movieService.findMovieByActorName(movieArrayList, scannerActorName));
                }
                case 4 -> {
                    System.out.print("Ведите год фильма: ");
                    Year scannerYar = Year.of(scanner.nextInt());
                    System.out.println(movieService.findMovieByYear(movieArrayList, scannerYar));
                }
                case 5 -> {
                    System.out.print("Ведите имя продюсера: ");
                    String scannerNameProducer = scanner.next();
                    System.out.println(movieService.findMovieByProducer(movieArrayList, scannerNameProducer));
                }
                case 6 -> {
                    System.out.print("Ведите жанр фильма: ");
                    String scannerNameGender = scanner.next();
                    System.out.println(movieService.findMovieByGenre(movieArrayList, scannerNameGender));
                }
                case 7 -> {
                    System.out.print("Ведите роль: ");
                    String scannerRole = scanner.next();
                    System.out.println(movieService.findMovieByRole(movieArrayList, scannerRole));
                }
                case 8 -> {
                    Comparator<Movie> sortByMovieName = MovieServiceImpl.sortByMovieName;
                    movieArrayList.sort(sortByMovieName);
                    System.out.println("Сортировка по названию фильма выполнена!");
                    System.out.println(movieArrayList);
                       }
                case 9 -> {
                    Comparator<Movie> fromAtoZ = MovieServiceImpl.fromAtoZ;
                    movieArrayList.sort(fromAtoZ);
                    System.out.println("Сортировка от А до Я выполнена!");
                    System.out.println(movieArrayList);
                }
                case 10 -> {
                    Comparator<Movie> fromZtoA = MovieServiceImpl.fromZtoA;
                    movieArrayList.sort(fromZtoA);
                    System.out.println("Сортировка от Я до А выполнена!");
                    System.out.println(movieArrayList);
                }
                case 11 -> {
                    Comparator<Movie> sortByYear = MovieServiceImpl.sortByYear;
                    movieArrayList.sort(sortByYear);
                    System.out.println("Сортировка по году выпуска фильма выполнена!");
                    System.out.println(movieArrayList);
                }
                case 12 -> {
                    Comparator<Movie> sortByProducer = MovieServiceImpl.sortByProducer;
                    movieArrayList.sort(sortByProducer);
                    System.out.println("Сортировка по октёру фильма выполнена!");
                    System.out.println(movieArrayList);
                }
                case 13 -> {
                    return;
                }
                default -> System.out.print("Извените действие под номером :("+scaner+") не найденно!");
            }
        }

    }
    public static void menu (){
        System.out.println("Добро пажаловать в кинотиатр!");
        System.out.print("""
                 1. Получить все фильмы.
                 2. Найти фильм по названию или части названия.
                 3. Найти фильм по имени актёра.
                 4. Найти фильм по году.
                 5. Найти фильм по продюсеру.
                 6. Найти фильм по жанру.
                 7. Найти фильм по роли.
                 8. Сортировка по названию фильма.
                 9. Сортировка от A до Я.
                10. Сортировка от Я до А.
                11. Сортировка по годам.
                12. Сортировка по продюсеру.
                13. Выйти.
                -----------------------------
                """);
        System.out.print("Ваша действия: ");
    }
}
