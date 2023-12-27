package review8;

public class Sports {
    /*   MUST     MUST
        dataType name;
     */

    // static variable
    static boolean fun;

    //instance variables
    String type, teamName;
    int numberOfPlayers;
    String location;
    String coach;

    Sports(String type, String teamName){
        this.type=type;
        this.teamName=teamName;
    }

    Sports(String type, String teamName, int numberOfPlayers, String location, String coach){
        this(type, teamName);
        this.numberOfPlayers=numberOfPlayers;
        this.location=location;
        this.coach=coach;
    }

    /*    MUST     MUST
        returnType name() {}
     */
    void play() {
        System.out.println("We play "+type);
    }

    void watch(String stream){
        System.out.println("I am watching "+type+" on "+stream );
    }
}

