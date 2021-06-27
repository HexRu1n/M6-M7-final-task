public class Movie extends MovieDb{
    private String length;

    public Movie(String name, String year, String director, String length) {
        super(name, year, director);
        this.length = length;
    }

    @Override
    public void playMovie(){
        super.playMovie();
        isWatched = true;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Length - " + length);
    }
}
