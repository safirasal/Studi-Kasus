package studikasus4;
import java.util.Scanner;
public class StudiKasus4 {
    public static void main(String[] args) {
        int nilai;
        String grade;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nilai: ");
        nilai=input.nextInt();
        
        if (nilai>=90){
            System.out.println("grade = A");
            
        }else if(nilai>=80){
            System.out.println("grade = B+");
        
        }else if(nilai>=70){
            System.out.println("grade = B");
            
        }else{
            System.out.println("Grade F");
        }
        
    }
    
}






