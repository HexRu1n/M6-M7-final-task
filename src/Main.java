public class Main {
    public static void main(String[] args) {
        MovieDb[] list = new MovieDb[3];
        list[0] = new Movie("Back to the Future", "1985", "Robert Zemeckis", "1h 56min");
        list[1] = new MiniSerial("The Lost Room", "2006", "Craig R. Baxley, Michael W. Watkins", 3);
        list[2] = new Serial("Narcos", "2015 - 2017", "Carlo Bernard, Chris Brancato, Doug Miro", 10, 3);


        for (MovieDb n : list) {
            n.printInfo();
            n.playMovie();
            n.displayState();
        }

        PlaySome[] serials = new PlaySome[2];
        int j = 0;

        for (MovieDb movieDb : list) {
            if (movieDb instanceof PlaySome) {
                serials[j] = (PlaySome) movieDb;
                j++;
            }
        }

        for (PlaySome playSome : serials) {
            playSome.playSeasons(1);
            playSome.playSeries(12);
            if (playSome instanceof MovieDb) list[1] = (MovieDb) playSome;
        }

        for (MovieDb n : list) n.displayState();
    }
}
