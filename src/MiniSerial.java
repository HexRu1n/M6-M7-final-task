public class MiniSerial extends MovieDb implements PlaySome{
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
        System.out.printf("You watched %d series\n", watchedSeries);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Total number of series: " + series);
    }

    @Override
    public void playSeries(int numOfSeries){

    }
}
