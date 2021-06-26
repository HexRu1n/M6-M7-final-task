public abstract class MovieDb {
    private String name;
    private String year;
    private String director;
    protected boolean isWatched;

    public MovieDb(String name, String year, String director) {
        this.name = name;
        this.year = year;
        this.director = director;
    }

    public abstract void playMovie();

    public abstract void displayState();

    public void printInfo(){
        System.out.printf("\nAbout\nTitle: \"%s\"\nProduction year: %s\nDirector(s): %s\n", name, year, director);
    }
}
