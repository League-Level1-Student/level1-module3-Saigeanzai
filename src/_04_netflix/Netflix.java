package _04_netflix;

import javax.swing.JOptionPane;

public class Netflix {

	public static void main(String[] args) {

		Movie movie = new Movie("movie", 0);
		Movie movie1 = new Movie("movie1", 1);
		Movie movie2 = new Movie("movie2", 2);
		Movie movie3 = new Movie("movie3", 3);
		Movie movie4 = new Movie("movie4", 4);
		Movie movie5 = new Movie("movie5", 5);

		System.out.println(movie.getTitle());
		System.out.println(movie.getRating());
		System.out.println(movie.toString());
		System.out.println(movie.getTicketPrice());

		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(movie);
		netflix.addMovie(movie1);
		netflix.addMovie(movie2);
		netflix.addMovie(movie3);
		netflix.addMovie(movie4);
		netflix.addMovie(movie5);

		netflix.getMovie(0);
		netflix.getMovie(1);
		netflix.getMovie(2);
		netflix.getMovie(3);
		netflix.getMovie(4);
		netflix.getMovie(5);

		netflix.sortMoviesByRating();
		netflix.printMovies();

		System.out.println("The best movie is " + netflix.getBestMovie());
		System.out.println("The second best movie is " + netflix.getMovie(1));

	}
}
