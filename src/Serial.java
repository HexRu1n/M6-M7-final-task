public class Serial extends MiniSerial implements PlaySome{

    public Serial(String name, String year, String director, int series, int seasons) {
        super(name, year, director, series);
        this.seasons = seasons;
    }

    @Override
    public void displayState(){
        super.displayState();
        System.out.printf("You watched %d season and %d series\n", watchedSeries/series, watchedSeries%series);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Number of seasons: " + seasons);
        System.out.println("Total number of series: " + series * seasons);
    }
}
