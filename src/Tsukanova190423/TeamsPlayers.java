package Tsukanova190423;

import java.util.Scanner;

public class TeamsPlayers {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введіть назву першої команди гравців");
        String team1 = scanner.next();

        System.out.println("Введи кількість фрагів для 5-ти гравців першої команди, після фракції одного гравця, нажми \"Enter\" - щоб перейти до наступного ");
       int team1Players1 = 0;
            if (scanner.hasNextInt()){
            team1Players1=scanner.nextInt();
            scanner.nextLine();
            }else {
            System.out.println("Помилка. Введіть лише число");
            }
       int team1Players2 = 0;
            if (scanner.hasNextInt()){
            team1Players2=scanner.nextInt();
            scanner.nextLine();
            }else {
            System.out.println("Помилка. Введіть лише число");
            }
       int team1Players3 = 0;
            if (scanner.hasNextInt()){
            team1Players3=scanner.nextInt();
            scanner.nextLine();
            }else {
            System.out.println("Помилка. Введіть лише число");
            }
       int team1Players4 = 0;
            if (scanner.hasNextInt()){
            team1Players4=scanner.nextInt();
            scanner.nextLine();
            }else {
            System.out.println("Помилка. Введіть лише число");
            }
       int team1Players5 = 0;
            if (scanner.hasNextInt()){
            team1Players5=scanner.nextInt();
            scanner.nextLine();
            }else {
            System.out.println("Помилка. Введіть лише число");
            }

        System.out.println("Введіть назву другої команди гравців");
        String team2 = scanner.next();

        System.out.println("Введи кількість фрагів для 5-ти гравців другої команди, після фракції одного гравця, нажми \"Enter\" - щоб перейти до наступного ");
        int team2Players1 = 0;
        if (scanner.hasNextInt()){
            team2Players1=scanner.nextInt();
            scanner.nextLine();
            }else {
            System.out.println("Помилка. Введіть лише число");
            }
        int team2Players2 = 0;
            if (scanner.hasNextInt()){
            team2Players2=scanner.nextInt();
            scanner.nextLine();
            }else {
            System.out.println("Помилка. Введіть лише число");
            }
        int team2Players3 = 0;
            if (scanner.hasNextInt()){
            team2Players3=scanner.nextInt();
            scanner.nextLine();
            }else {
            System.out.println("Помилка. Введіть лише число");
            }
        int team2Players4 = 0;
            if (scanner.hasNextInt()){
            team2Players4=scanner.nextInt();
            scanner.nextLine();
            }else {
            System.out.println("Помилка. Введіть лише число");
            }
        int team2Players5 = 0;
            if (scanner.hasNextInt()){
            team2Players5=scanner.nextInt();
            scanner.nextLine();
            }else {
            System.out.println("Помилка. Введіть лише число");
            }

        int people=5;
        double team2Result=(team2Players1+team2Players2+team2Players3+team2Players4+team2Players5)/(double)people;
        double team1Result=(team1Players1+team1Players2+team1Players3+team1Players4+team1Players5)/(double)people;


        if (team1Result>team2Result){
            System.out.println("Перемогла команда " + team1 + " набрала " + team1Result + " очків");
        } else if (team1Result<team2Result){
            System.out.println("Перемогла команда " + team2 + " набрала " + team2Result + " очків");
        } else {
            System.out.println("Нічия. " +"Команда "+team1+" команда " +team2 + " набрали " + team1Result + " очків");
        }
    }
}
