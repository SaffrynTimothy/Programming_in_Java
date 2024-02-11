import java.util.*;
public class Placement
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Size: ");
        int n = s.nextInt(), a[] = new int[n];
        System.out.print("Enter Elements of Array: ");
        for (int i = 0; i < n; i++)
        {
             a[i] = s.nextInt();
        }
        System.out.print("Number: ");
        int x = s.nextInt(), i = Arrays.binarySearch(a, x);
        if (i >= 0) {
            if (i + 1 < n) {
                System.out.println("Next bigger: " + a[i + 1]);
            }
            else {
                System.out.println("Not found");
            }
        } 
        else {
            System.out.println("Number not found");
        }
    }
}
