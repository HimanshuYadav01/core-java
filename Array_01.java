import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int [][][] arr = new int[n1][n2][n3];

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                for(int k = 0; k < arr[i][j].length; k++){
                    System.out.println("Enter the arr array element at index " +i +" " +j +" " +k + " "+ " and press ENTER");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.print("The required array is: \n");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                for(int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]);
                    System.out.print(" ");
                }
            System.out.print("\n");
            }
        }
    }
}
