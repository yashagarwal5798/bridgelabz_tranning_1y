package com.gla.level_1;

import java.util.Scanner;

public class Maximum_handshake {
    public static int Handshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int handshakes = Handshakes(n);
        System.out.println("Maximum number of possible handshakes: " + handshakes);

    }
}
