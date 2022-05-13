public class TVShows {
        private String showName;
        private Integer showEpisodes;
        private String genre;

        // the class constructor
    public TVShows(String showName, Integer showEpisodes, String genre) {
        this.showName = showName;
        this.showEpisodes= showEpisodes;
        this.genre =  genre;
    }

    public TVShows(String showName){
        this.showName= showName;
    }

    public TVShows(Integer showEpisodes, String genre){
        this.showEpisodes = showEpisodes;
        this.genre = genre;
    }

    public String getName(){
        return showName;
    }
    public Integer getEpisodes(){
        return showEpisodes;
    }
    public String getGenre(){
        return genre;
    }
    @Override
    public String toString (){ 
    return "The name of the show is " + this.showName + " with " + showEpisodes + " episodes. The genre is " + this.genre + ".";
    }



}
