import java.util.*;
public class Placement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int m1=0,m2=1,m3=2;
        for (int i=0;i<= n-3;i++) {
            if (arr[i]*arr[i+1]*arr[i+2]<arr[m1]*arr[m2]*arr[m3]) {
                m1=i;
                m2=i+1;
                m3=i+2;
            }
        }

        System.out.println("Minimum Product: "+arr[m1]*arr[m2]*arr[m3]);
    }
}
