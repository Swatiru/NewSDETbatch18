package class21Abstraction;

public class Task2Tester {
            public static void main(String[] args) {
        Task2[] music={new M3Player("hiphop",16),
                new CdPlayer("rock",20),
                new StreamingPlayer("dance music",18)};
        for(Task2 m:music){
            m.play();
            m.pause();
            m.stop();
            System.out.println("-------------------");
        }
    }
}
