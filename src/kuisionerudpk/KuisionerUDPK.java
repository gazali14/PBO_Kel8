/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuisionerudpk;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author U53R
 */
public class KuisionerUDPK {
    private static ArrayList<QuestionaireData> sheets = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //commit awal
        System.out.println("\033[34m=======================================");
        System.out.println("== Program Entri Data Kuesioner UDPK ==");
        System.out.println("=======================================");
        System.out.println("\033[0m");
        System.out.println("Selamat Datang di Program Entri Data Kuesioner UDPK (Update Direktori Perusahaan Konstruksi)!\n");
        System.out.println("Isilah kuesioner ini dengan jujur dan benar!");
        System.out.println("Selamat mengisi kuesioner!\n");
        }
    
    /**
     * Merupakan method untuk membersihkan Scanner setelah newline
     * @param scanner Scanner class yang digunakan
     */
    private static void ClearInputBuffer(Scanner scanner) {
        scanner.skip(".*\n");
    }
}