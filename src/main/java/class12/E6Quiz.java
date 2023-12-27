package class12;

public class E6Quiz {
    public static void main(String[] args) {
        /*Write a program that reads two people's first names and if they expecting boy or girl?
           Based on the input suggests a name for a baby:
        Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
*/
        String fatherName="Daniel";
        String momName="Mary";

        boolean isBoy=false;
        if(isBoy){
        String fatherFirstPart=fatherName.substring(0,fatherName.length()/2);
         String momLastPart =momName.substring(momName.length()/2,momName.length());
        System.out.println(fatherFirstPart.trim()+momLastPart.trim());
    }else{
            String momFirstPart=momName.substring(0,momName.length()/2);
            String fatherLastPart =fatherName.substring(fatherName.length()/2,fatherName.length());
        System.out.println(momFirstPart.trim()+fatherLastPart.trim());
}}}
