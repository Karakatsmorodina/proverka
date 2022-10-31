import java.util.Scanner;

public class Task1 {
    public static int max(int arr[],int height[],int n){
        int max=0;
        int temp;
        for (int i = 0; i < n; i++) {
            temp = (arr[i]*i* height[i]) / 2;
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length:");
        int n=input.nextInt();
        int [] arr = new int[n];
        int [] height=new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter number:");
            int temp = input.nextInt();
            arr[i]=temp;
            System.out.println("Enter height:");
            int s = input.nextInt();
            height[i]=s;
        }
        System.out.println( max(arr,height,n));
    }
}
