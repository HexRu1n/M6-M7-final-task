public class Movie extends MovieDb{
    private String length;

    public Movie(String name, String year, String director, String length) {
        super(name, year, director);
        this.length = length;
    }

    @Override
    public void playMovie(){
        System.out.println("\nPlaying...");
        isWatched = true;
    }

    @Override
    public void displayState(){

    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Length - " + length);
    }
}
