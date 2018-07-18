package fun;

import java.util.Scanner;

public class gener {

    private static Scanner scanner;

    public static void main(String[] args) {
        char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
        System.out.println("Сколько символов должно быть в вашем пароле?");
        scanner = new Scanner(System.in);
        int letter = scanner.nextInt();
        for(int i = 0; i < letter; i++) {
            System.out.print(arr[1 + (int)(Math.random() * arr.length - 1)]);
        }
    }

}