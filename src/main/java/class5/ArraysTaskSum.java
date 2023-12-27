package class5;

public class Arrayas6Task {
    public static void main(String[] args) {
        int[] num={10,20,30,40,45,55,25,80,90};
         int sum=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                sum=sum+num[i];
            }

        }
        System.out.println(sum);

    }
}
