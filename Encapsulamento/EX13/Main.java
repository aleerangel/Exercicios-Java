public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setTitle("Arrival");
        movie.setDirector("Christopher Nolan");
        movie.setDuration(146);

        System.out.println(movie.getMovieDetails());
    }
}