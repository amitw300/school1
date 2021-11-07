import java.util.*;

class Main

{

public static void main(String[] args)

{

Scanner input = new Scanner (System.in);

int num1, num2; // הצהרת על המשתנים

System.out.println( " input first number");

num1 = input.nextInt();

System.out.println( " input second number");

num2 = input.nextInt();
System.out.print( "The numbers are: ");
System.out.println(num1 +","+ num2);
System.out.print( "The total of both numbers is: ");

System.out.println ( num1 + num2);
System.out.print ("The product of the two numbers is: ");
System.out.println ( num1*num2);

}

}