In this code, the program prompts the user to enter the number . If user enter a number less than 0 then it display the end otherwise it display the number enter by the user .
  
  
  import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int number = 0;


        do{
            System.out.print("ENTER YOUR NUMBER:");
            number = sc.nextInt();
            System.out.print("this is your number:");
            System.out.println(number);

        }while(number>=0);

        System.out.println("THE END");
       
 }
}

    

    
