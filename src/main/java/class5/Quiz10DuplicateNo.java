package class5;

public class Quiz10DuplicateNo {
    public static void main(String[] args) {
        int[] num={25,40,25,60,70};

        for(int i=0; i<num.length ;i++){
            for(int j=i+1; j<num.length ;j++){
                if(num[i]==num[j]){
                    System.out.println(num[i]);
                }
            }
        }
    }
}
