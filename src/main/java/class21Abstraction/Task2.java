package class21Abstraction;
/*Task1) Music Player System: Create a class MusicPlayer with methods like play(), pause(), stop(),
and fields such as currentTrack and volume. Implement subclasses for different types of music players,
like MP3Player, CDPlayer, and StreamingPlayer, each with their unique implementations of the play()
method (e.g., streaming from the internet, playing from a CD). */
public abstract class Task2 {
    private String currentTrack;
    private  int volume;

    public Task2(String currentTrack, int volume) {
        this.currentTrack = currentTrack;
        this.volume = volume;
    }
        public abstract void play();

        public void pause(){
            System.out.println("pausing music "+currentTrack);
        }
        public void stop(){
            System.out.println("stop music at "+volume);
        }
    }
class M3Player extends Task2 {
    public M3Player(String currentTrack, int volume) {
        super(currentTrack, volume);
    }
    @Override
        public void play () {
            System.out.println("M3player is playing ");
        }
        @Override
        public void pause(){
            System.out.println("M3player is paused on 4.4");
    }
    @Override
    public void stop() {
        System.out.println("M3player is stopped");
    }
}

class CdPlayer extends Task2{
    public CdPlayer(String currentTrack, int volume) {
        super(currentTrack, volume);
    }
    public void play(){
        System.out.println("cdplayer is not working");
    }
    public void pause (){
        System.out.println("cdplayer got paused on 3.5");
    }
    public void stop(){
        System.out.println("cdplayer stopped because of dust");
    }
}
class StreamingPlayer extends Task2{
    public StreamingPlayer(String currentTrack, int volume) {
        super(currentTrack, volume);
    }

    @Override
    public void play() {
        System.out.println("streaming from internet");
    }
    @Override
    public void pause() {
        System.out.println("streaming is paused on 2.5 ");;

    }
    @Override
    public void stop() {
        System.out.println("streaming stop because internet is not working ");

    }
}
