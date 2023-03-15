import java.util.Arrays;
import java.util.Scanner;

class joop_opdracht {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the size of the array : ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] a = new int[size];

        System.out.println("Give me " + size + " numbers : ");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("This is the array : " + Arrays.toString(a));

        boolean order = true;
        for (int i = 0; i < size - 1; i++) {
            if (a[i] > a[i + 1]) {
                order = false;
                break;
            }
        }
        System.out.print(order);
    }
}

/*
import java.util.Arrays;

import java.util.Scanner;

class Joop_opdracht {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        String str_array = scanner.nextLine(); // de input vanuit de terminal is een string --> deze mooet je dan omzetten naar integers

        // string --> array met behulp van de split methode https://www.w3resource.com/java-tutorial/string/string_split.php
        String[] array_string = str_array.split(" ");

        // size van de array
        int size = str_array.length();

        // type van array elements van str --> int veranderen
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            //  https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
            arr[i] =  Integer.parseInt(array_string[i]);
        }

        // PROBEER NU VANAF HIER JE EIGEN CODE AAN TE PASSEN
        /*
        // Read the two integer numbers n and m
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Check if n and m never occur next to each other
        boolean found = false;
        for (int i = 0; i < size - 1; i++) {
            if ((arr[i] == n && arr[i + 1] == m) || (arr[i] == m && arr[i + 1] == n)) {
                found = true;
                break;
            }
        }        // Output the result

        System.out.println(!found); */
   /* }
            }*/