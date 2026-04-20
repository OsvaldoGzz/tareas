/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 * @author moren
 */
import java.util.Scanner;



public class ConvertirUnidades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double metros;

        System.out.println("Programa para convertir de metros a kilometros");
        System.out.println("Ingresa los metros:");
        metros = sc.nextDouble();

        double kilometros = metros / 1000;

        System.out.println("Es igual a : " + kilometros + " kilometros");
    }
}