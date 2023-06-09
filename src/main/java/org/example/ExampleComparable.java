package org.example;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {

    private double rating;
    private String name;
    private int year;


    @Override
    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }

    public Movie(String name , double rating, int year)
    {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
    public String getName(){return name;}
    public double getRating(){return rating;}
    public int getYear(){return year;}
}
 public class ExampleComparable{
        public static void main(String[] args) {
            ArrayList<Movie> list = new ArrayList<Movie>();
            list.add(new Movie("Force Awakens", 8.3, 2015));
            list.add(new Movie("Star Wars", 8.7, 1977));
            list.add(new Movie("Empire Strikes Back", 8.8, 1980));
            list.add(new Movie("Return of the Jedi", 8.4, 1983));

            Collections.sort(list);
            for(Movie movie : list){
                System.out.println(movie.getName() + " " +
                        movie.getRating() + " " +
                        movie.getYear());
            }

        }
    }