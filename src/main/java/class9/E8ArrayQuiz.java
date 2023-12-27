package class9;

public class E8ArraysQiz {
    public static void main(String[] args) {


        String[] [] student = {
                {"Nisha", "Maria","alex","john"},
                              {"A","B","c","d"}};

           for(int i=0; i<4;i++){
               if(student[1][i].equals("A")||student[1][i].equals("B")){
                   System.out.println(student[0][i]+student[1][i]);
               }
           }

            }
        }