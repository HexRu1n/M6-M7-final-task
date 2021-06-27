public class Serial extends MovieDb{
    //Колличество серий в одном сезоне
    private int series;
    private int seasons;
    private int watchedSeries;

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
    }

    @Override
    public void displayState(){
        super.displayState();
        System.out.println("Watched series total: " + watchedSeries);
        System.out.printf("You watched %d season and %d series\n", watchedSeries/series, watchedSeries%series);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Series in season: " + series);
        System.out.println("Number of seasons: " + seasons);
        System.out.println("Total number of series: " + series * seasons);
    }
}
