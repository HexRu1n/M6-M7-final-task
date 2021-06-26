public class MovieDb {
    private String name;
    private String year;
    private String director;
    protected boolean isWatched;

    public MovieDb(String name, String year, String director) {
        this.name = name;
        this.year = year;
        this.director = director;
    }

    public void playMovie(){
        System.out.printf("\nPlaying \"%s\"\n", name);
    }

    public void displayState(){
        if(isWatched) System.out.printf("\nYou already watched \"%s\"\n", name);
        if(!isWatched) System.out.printf("\nYou not watched \"%s\" yet\n", name);
    }


    public void printInfo(){
        System.out.printf("\nAbout\nTitle: \"%s\"\nProduction year: %s\nDirector(s): %s\n", name, year, director);
    }
}
