package class5;

public class Quiz9LargestNo {
    public static void main(String[] args) {
        int[] num={20,40,10,50,80};
        int largestNo=0;
        int lowestNo=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>largestNo) {
                largestNo = num[i];
            }else{
                lowestNo=num[i];
            }}
                System.out.println("largest no:"+largestNo);
                System.out.println("lowest no:"+lowestNo);
            }
        }

