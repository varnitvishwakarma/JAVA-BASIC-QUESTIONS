In this mini project ,that generates a random number between 1 and 100 and prompts the user to guess the number. The program should provide feedback to the user indicating whether their guess is too large or too small. The program should continue prompting the user for guesses until they correctly guess the number. Finally, the program should reveal the correct number.

import java.util.Scanner;

class HelloWorld {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mynumber=(int)(Math.random()*100);
    int usernumber=0;
    do{
        System.out.print("guess my number(1-100):");
        usernumber= sc.nextInt();

        if(mynumber==usernumber){
            System.out.println("wooho... correct number!");
            break;
        }
        else if (usernumber>mynumber){
            System.out.println("your number is large ");
        }
        else {
            System.out.println("your number is small");
        }
        } while(usernumber>=0);

        System.out.print("my number was :");
        System.out.println(mynumber);
            
        }
        } 

    

           
 


    

    
