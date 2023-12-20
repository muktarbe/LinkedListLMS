package madel;

import enums.Gender;

import java.time.Year;
import java.util.Comparator;


public class Movie {
    public static long ID = 0;
    private long id;
    private String name;
    private Year year;
    private Gender gender;
    private Producer producer;
    private Actor actor;

    public Movie( String name, Year year, Gender gender, Producer producer, Actor actor) {
        this.id = ++ID;
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.producer = producer;
        this.actor = actor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie " +
                "id = " + id +
                ", name = " + name +
                ", year = " + year +
                ", gender = " + gender +
                ", producer = " + producer +
                ", actor = " + actor + "\n";
    }

    public static Comparator<Movie> sortByMovieName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Movie> fromAtoZ = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Movie> fromZtoA = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    public static Comparator<Movie> sortByYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear().compareTo(o2.getYear());
        }
    };


}