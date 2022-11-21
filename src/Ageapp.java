import java.util.Scanner;
import java.util.Calendar;

// this is simple programe for calc age !!

public class Ageapp {
    public static void main(String[] args){
        int BirthYear , age , thisYear;
        System.out.print("\nEnter Your Birth Year : ");
        BirthYear = new Scanner(System.in).nextInt();
        thisYear = Calendar.getInstance().get(Calendar.YEAR);
        age = thisYear - BirthYear;
        System.out.print("\nYour age is " + age);
    }
}
