package class5;

public class Array6TaskNameEquals {
    public static void main(String[] args) {
        String[] names={"aidios","zeesan","abid","sharif","zeesan"};
         int count=0;
        for(int i=0;i<names.length; i++){
            if(names[i].equals("zeesan")){
                count++;

        }

    }
        System.out.println("zeesan  "+count+" times");

}}
