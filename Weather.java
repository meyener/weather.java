import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
       int weather;
       System.out.println("Lütfen sıcakliği giriniz : ");
        Scanner scn=new Scanner(System.in);
        weather=scn.nextInt();
        
        
        
        
       if (weather<=4) {
        System.out.println("Hava kayak yapmaya müsait");
       }
       else if (weather>4 && weather<=14) {
        System.out.println("Hava Sinema yapmaya müsait");
       } 
       else if (weather>14 && weather<=24){
        System.out.println("Hava Pşknik yapmaya müsait");
       }
       else{
        System.out.println("Hava Yüzme yapmaya müsait");
       }
    }
}
