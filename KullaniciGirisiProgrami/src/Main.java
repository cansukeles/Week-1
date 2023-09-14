import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, reset, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        userName = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Login Success...");
        } else {
            System.out.println("Username and Password are incorrect!");
            System.out.println("Would you like to change your password? Enter Yes or No");
            reset = input.nextLine();

            if(reset.equals("no")) {
                System.out.println("Password is not changed");
            }
            else if(reset.equals("yes")){
                System.out.print("Please write new password: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.println("New password cannot same old password!");
                    System.out.print("Please write another password: ");
                    newPassword = input.nextLine();
                    System.out.println("Password changed successfully");
                }
                else {
                    System.out.println("Password changed successfully");


                }
            }
        }
    }
}
