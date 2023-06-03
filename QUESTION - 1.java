In this code, the program prompts the user to enter the amount of money they have. It then calculates how many things the user can buy based on the given prices. Finally, it displays the result to the user.
  
  import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class HelloWorld {
    public static void main(String[] args) {
    //conditional statements

    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER YOUR CASH");
    int amount = sc.nextInt();

    //pen = 10 and notebook =40
    
    if(amount<10){
    System.out.println("you cannot buy anything");
    System.out.println("get more cash");
}    
    else if (amount>10 && amount<50 ){
    System.out.println("can get 1 thing");
    }
    
    else 
    System.out.println("you can get both things");

       
 }
}

    

    
