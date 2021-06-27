public class MiniSerial extends MovieDb{
    private int series;
    private int watchedSeries;

    public MiniSerial(String name, String year, String director, int series) {
        super(name, year, director);
        this.series = series;
    }

    @Override
    public void playMovie(){
        super.playMovie();
        if(watchedSeries < series) ++watchedSeries;
        else isWatched = true;
    }

    @Override
    public void displayState(){
        super.displayState();
        System.out.println("Watched series total: " + watchedSeries);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Series in season: " + series);
    }
}
