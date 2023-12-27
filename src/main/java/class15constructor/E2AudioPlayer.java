package class15;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2AudioPlayer {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        FileInputStream fis=new FileInputStream("C:\\Users\\swati\\IdeaProjects\\NewSDETbatch18\\src\\main\\java\\class15\\Ambient-music-free.mp3");
        Player player=new Player(fis);
        player.play();
    }
}
