import java.util.Scanner;
import java.util.ArrayList;

public class TVShowsMain {
    public static void main (String[] args){
        ArrayList<TVShows> shows = new ArrayList <> ();
        Scanner scan = new Scanner(System.in);

        while (true){
        System.out.print("Name of the show: ");
        String showName = scan.nextLine();
        if (showName.isBlank()) break;
        System.out.print("How many episodes: ");
        String episodes= scan.nextLine();
        if (showName.isBlank()) break;
        System.out.print("what is the genre: ");
        String genre=scan.nextLine();
        
        if (showName.isBlank()) break;
                if( showName.isBlank() || episodes.isBlank()|| genre.isBlank()){
                break;
                }else{
                    shows.add(new TVShows(showName, Integer.valueOf(episodes), genre));
                }
        }
        for (int i = 0; i < shows.size(); i ++){
            System.out.println(shows.get(i));
        }
        scan.close();
    }
}
