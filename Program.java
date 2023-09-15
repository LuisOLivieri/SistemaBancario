import java.util.Locale;
import java.util.Scanner;
import entities.Saque;

public class Program{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Saque saque;

        System.out.println("Enter Acconut Number: ");
        int number = sc.nextInt();

        System.out.println("Enter Acconut Holder: ");
        sc.nextLine(); //Quebra de linha.
        String holder = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if(response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            saque = new Saque(number, holder, initialDeposit);
        } else {
            saque = new Saque(number, holder);
        }

        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(saque);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        saque.deposit(depositValue);

        System.out.println("Uptade account data: ");
        System.out.println(saque);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        saque.withdraw(withdrawValue);

        System.out.println("Uptade account data: ");
        System.out.println(saque);


        sc.close();
    }
}