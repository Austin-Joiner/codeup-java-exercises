package movies;


import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {

        choicesMethod();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        boolean exit = false;
        while (!exit) {
            int choice = Input.getInt();

            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    viewAllMovies();
                    break;
                case 2:
                    viewAnimatedMovies();
                    break;
                case 3:
                    viewDramaMovies();
                    break;
                case 4:
                    viewHorrorMovies();
                    break;
                case 5:
                    viewSciFiMovies();
                    break;
                case 6:
                    viewMusicalMovies();
                    break;
                case 7:
                    viewComedyMovies();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        Input.closeScanner();
    }


    protected static void viewAllMovies() {
        Movie[] movies = MoviesArray.findAll();

        System.out.println("ALL GENRES");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (Movie movie : movies) {
            System.out.printf("%s, %s\n", movie.getName(), movie.getCategory());
        }
        choicesMethod();
    }

    protected static void viewAnimatedMovies() {
        Movie[] movies = MoviesArray.findAll();

        System.out.println("Genre: Animated");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (Movie movie : movies) {
            if (movie.getCategory().equals("animated")) {
                System.out.println(movie.getName());
            }
        }
        choicesMethod();
    }

    protected static void viewDramaMovies() {
        Movie[] movies = MoviesArray.findAll();

        System.out.println("Genre: Drama");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (Movie movie : movies) {
            if (movie.getCategory().equals("drama")) {
                System.out.println(movie.getName());
            }
        }
        choicesMethod();
    }

    protected static void viewHorrorMovies() {
        Movie[] movies = MoviesArray.findAll();

        System.out.println("Genre: Horror");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (Movie movie : movies) {
            if (movie.getCategory().equals("horror")) {
                System.out.println(movie.getName());
            }
        }
        choicesMethod();
    }

    protected static void viewSciFiMovies() {
        Movie[] movies = MoviesArray.findAll();

        System.out.println("Genre: SciFi");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (Movie movie : movies) {
            if (movie.getCategory().equals("scifi")) {
                System.out.println(movie.getName());
            }
        }
        choicesMethod();
    }
    protected static void viewMusicalMovies() {
        Movie[] movies = MoviesArray.findAll();

        System.out.println("Genre: Musical");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (Movie movie : movies) {
            if (movie.getCategory().equals("musical")) {
                System.out.println(movie.getName());
            }
        }
        choicesMethod();
    }
    protected static void viewComedyMovies() {
        Movie[] movies = MoviesArray.findAll();

        System.out.println("Genre: Comedy");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (Movie movie : movies) {
            if (movie.getCategory().equals("comedy")) {
                System.out.println(movie.getName());
            }

        }
        choicesMethod();
    }

    public static void choicesMethod() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musical category");
        System.out.println("7 - view movies in the comedy category");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}
