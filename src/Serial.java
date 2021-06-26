public class Serial extends MiniSerial implements PlaySome{
    //Колличество серий в одном сезоне
    private int series;
    private int seasons;
    private int watchedSeries;
    private int watchedSeasons;

    public Serial(String name, String year, String director, int series, int seasons) {
        super(name, year, director);
        this.series = series;
        this.seasons = seasons;
    }

    @Override
    public void playMovie(){
        super.playMovie();
        if(watchedSeries < series*seasons) ++watchedSeries;
        else isWatched = true;
        watchedSeasons = watchedSeries/series;
    }

    @Override
    public void displayState(){
        super.displayState();
        System.out.printf("You watched %d season and %d series\n", watchedSeasons, watchedSeries%series);
        System.out.println("Watched series total: " + watchedSeries);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Number of seasons: " + seasons);
        System.out.println("Series in season: " + series);
        System.out.println("Total number of series: " + series * seasons);
    }
}
