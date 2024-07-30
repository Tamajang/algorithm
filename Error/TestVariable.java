import java.util.Scanner;
public class TestVariable {
    public static void main(String[] args) {
        //(1)data type char
        char clothingSize = 's';
        System.out.println(" clothingSize = "+clothingSize);
        //(2)data type int 
        int people = 123456;
        System.out.println(" website = "+people);
       //(3)data type char
       char GPA ='A';
       System.out.println("GPA = "+GPA);
       //(4)data type int
      Scanner input = new Scanner(System.in);
      int[]score;
      System.out.println("How Many People");
      int PeopleCount = input.nextInt();
      for(int a = 1;a<=PeopleCount;a++)
      {
        System.out.println("Enter Score");
      }
    }
}
