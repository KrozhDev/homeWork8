import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");

        int[] arr1 = new int[] {1,2,3};
        double[] arr2 = new double[] {1.57, 7.654, 9.986};
        String[] names = new String[4];
        names[0] = "Vika";
        names[1] = "Masha";
        names[2] = "Sonya";
        names[3] = "Katya";

        System.out.println();

        System.out.println("Task2");

        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
                break;
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
                break;
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                System.out.print(names[i]);
                break;
            } else {
                System.out.print(names[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Task3");

        for (int i = arr1.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr1[i]);
                break;
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.println();


        for (int i = arr2.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr2[i]);
                break;
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        System.out.println();

        for (int i = names.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(names[i]);
                break;
            } else {
                System.out.print(names[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();


        System.out.println("Task4");

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
                break;
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.println();









    }
}