package com.example.moviesort;

public class Movie implements Comparable<Movie>{
	private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    // Overriding the compareTo() method to sort movies by year of release
    @Override
    public int compareTo(Movie other) {
        return this.year - other.year;  // Ascending order by year
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }

}
