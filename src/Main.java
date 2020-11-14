import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an amount that is a multiple of 10:");
        int amount = input.nextInt();
        int num50s;
        int num20s;
        int num10s;

        if(amount >= 50){
            num50s = amount/50;
            int remainder50s = amount % 50;
            System.out.println("Dispensing " + num50s + " €50 notes");

            if(remainder50s >= 20){
                num20s = remainder50s/20;
                int remainder20s = remainder50s % 20;
                System.out.println("Dispensing " + num20s + " €20 notes");

                if(remainder20s >= 10){
                    num10s = remainder20s/10;
                    System.out.println("Dispensing " + num10s + " €10 notes");
                }
            }
            if(remainder50s == 10){
                System.out.println("Dispensing 1 €10 note");
            }
        }

        if(amount <50 && amount >= 20){
            num20s = amount/20;
            int remainder20s = amount % 20;
            System.out.println("Dispensing " + num20s + " €20 notes");

            if(remainder20s >= 10){
                num10s = remainder20s/10;
                System.out.println("Dispensing " + num10s + " €10 notes");


            }
        }

        if(amount == 10){
            System.out.println("Dispensing 1 €10 note");
        }

    }
}
