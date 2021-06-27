public class MiniSerial extends MovieDb implements PlaySome{
    protected int series;
    protected int seasons = 1;
    protected int watchedSeries;

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

    @Override
    public void playSeries(int numOfSeries){
        if(numOfSeries > series*seasons - watchedSeries) numOfSeries = series*seasons - watchedSeries;
        if(numOfSeries >= series) {
            playSeasons(numOfSeries/series);
        }
        watchedSeries += numOfSeries % series;
        if(watchedSeries == series*seasons) isWatched = true;
    }

    @Override
    public void playSeasons(int numOfSeasons){
        if(seasons - watchedSeries/series < 0) numOfSeasons = seasons - watchedSeries/series;
        if(watchedSeries % series != 0) {
            watchedSeries += (series - watchedSeries % series);
            numOfSeasons--;
        }
        watchedSeries += numOfSeasons * series;
        if(watchedSeries == series*seasons) isWatched = true;
    }
}
