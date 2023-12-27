package class9;

public class Reclass3 {
    public static void main(String[] args) {
        String [] students=new String[5];
        students[0]="Kendi";
        students[1]="Sasha";
        students[2]="John";
        students[3]="Ali";
        students[4]="Sino";

        for(int i=0;i<students.length;i++){
            if(students[i].equals("John")){
                students[i]="Good  Student";
                System.out.println(students[i]+" ");
            }
        }
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
    }



}

