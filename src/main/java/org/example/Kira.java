package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Kira {
    static Scanner input = new Scanner(System.in);
    static double discount = 0.5;
    static int monthInSem = 6;

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        System.out.println("Ikut bulan? (y/n)");
        String ikutBulan = input.next();
        System.out.println("Set discount? (y/n) by default is 50%");
        if (input.next().equals("y")) {
            System.out.println("Enter discount");
            discount = input.nextDouble();
        }
        clearConsole();
        if (ikutBulan.equals("y")) {
            KiraIkutBulanDanSem();
        } else {
            KiraIkutTahun();
        }
    }

    private static void KiraIkutTahun() {
        System.out.println("Enter total year");
        int totalYear = input.nextInt();
        System.out.println("Enter total allowance per year in RM");
        int totalAllowancePerYear = input.nextInt();
    }

    private static void KiraIkutBulanDanSem() {
        System.out.println("Enter total sem");
        int totalSem = input.nextInt();
        System.out.println("Enter total allowance per sem in RM");
        int totalAllowancePerSem = input.nextInt();
        //total allowance per month
        int totalAllowancePerMonth = totalAllowancePerSem / monthInSem;

        //out total allowance per month
        System.out.println("Total allowance per month: RM " + totalAllowancePerMonth);

        System.out.println("Enter usage per month in RM ");
        int usagePerMonth = input.nextInt();
        System.out.println("Enter how much you save per month in RM ");
        int savePerMonth = input.nextInt();

        //how much available allowance per month
        int availableAllowancePerMonth = totalAllowancePerMonth - (usagePerMonth + savePerMonth);
        System.out.println("Available allowance per month: RM " + availableAllowancePerMonth);

        int totalAllowance = totalAllowancePerSem * totalSem;
        //need to pay after discount
        int needToPay = (int) (totalAllowance * discount);
        //total save per sem
        int totalSavePerSem = savePerMonth * monthInSem;
        System.out.println("\nTotal save per sem: RM " + totalSavePerSem);
        //total save
        int totalSave = totalSavePerSem * totalSem;
        System.out.println("Total save: RM " + totalSave);

        //total available allowance
        int totalAvailableAllowance = availableAllowancePerMonth * monthInSem * totalSem;
        System.out.println("Total available allowance: RM " + totalAvailableAllowance);

        System.out.println("Total allowance: RM " + totalAllowance);
        System.out.println("\nNeed to pay after discount: RM " + needToPay);

        System.out.println();
        //pay using total save
        if (totalSave >= needToPay) {
            System.out.println("You can pay using total save");
            //show the remaining save
            System.out.println("Remaining save: RM " + (totalSave - needToPay));
        } else {
            System.out.println("You can't pay using total save");
            //show the remaining need to pay
            System.out.println("Remaining need to pay: RM " + (needToPay - totalSave));

            System.out.println("Panda");
        }
    }
}
