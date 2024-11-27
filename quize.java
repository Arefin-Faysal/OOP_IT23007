import java.util.Scanner;
public class quize {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int score = 0, right = 0, wrong = 0;
        System.out.println("Welcome to Simple Quize.\n");

        String x1 = "1. What is the full from of ICT?\n" + 
                        "a. Information and Communication Technology\n" +
                        "b. Information and Technology\n" +
                        "c. Inform and Communication Technology\n" +
                        "d. Information and connection Technology\n" , ans = "a" ;
        

        System.out.print(x1);

        System.out.print("\nAns : ");
        String in = input.nextLine();
        
        if(in.equals(ans)) {score +=5; right++;}
        else {score -=1; wrong++;}

        String x2 = "2. What is the full from of DSA?\n" +
                    "a) Digital Subtraction Angiography\n" +
                    "b) Direct Selling Agent\n" +
                    "c) Democratic Socialists of America\n" +
                    "d) Data Structures and Algorithms\n" ;
        
        
        System.out.print(x2);

        System.out.print("\nAns : ");
        in = input.nextLine();
        ans = "d";
        
        if(in.equals(ans)) {score +=5; right++;}
        else {score -=1; wrong++;}

        String x3 = "3. Which of the following is an example of an open-source operating system?\n" + 
                    "a) Windows\n" + "b) macOS\n" + "c) Linux\n" + "d) ios\n" ;

        System.out.print(x3);
        
        System.out.print("\nAns : ");
        in = input.nextLine();
        ans = "c";
        
        if(in.equals(ans)) {score +=5; right++;}
        else {score -=1; wrong++;}

        String x4 = "4. Which company is known as the creator of the Windows operating system?\n" + 
                        "a) Apple\n" + "b) Google\n" + "c) Microsoft\n" + "d) Amazon\n" ;
        
        
        System.out.print(x4);
        
        System.out.print("\nAns : ");
        in = input.nextLine();
        ans = "c";
        
        if(in.equals(ans)) {score +=5; right++;}
        else {score -=1; wrong++;}


        String x5 = "5. Which of the following is NOT a programming language?\n" + 
                    "a) Python\n" + "b) Java\n" + "c) HTML\n" + "d) C\n" ;
        
        System.out.print(x5);
        
        System.out.print("\nAns : ");
        in = input.nextLine();
        ans = "d";
        
        if(in.equals(ans)) {score +=5; right++;}
        else {score -=1; wrong++;}
        
        System.out.print("\nyour Right ans is "+right);
        System.out.print("\nYour Wrong ans is "+wrong);
        System.out.print("\nYour Score is "+score);                   

        input.close();
    }
    
}

        

