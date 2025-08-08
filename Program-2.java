import java.util.*;

class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;

        if(num == 0 || num == 1) 
            System.out.println(num);
        else {
            for(int i = 0; i < num; i++) {
                System.out.println(count);
                count += 2;
            }
        }
    }
}