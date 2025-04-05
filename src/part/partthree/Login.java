package part.partthree;

import java.util.Scanner;

public class Login {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] usernames = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter username: ");
        String password = sc.nextLine();

        boolean loggedIn = false; // always remember this approach

        for (int i = 0; i < usernames.length; i++){
            if (username.equals(usernames[i]) && password.equals(passwords[i])){
                System.out.println("You have successfully logged in!");
                loggedIn = true; // here
                break;
            }
        }

        if (!loggedIn){ // aaand here
            System.out.println("Incorrect username or password!");
        }

    }
}
