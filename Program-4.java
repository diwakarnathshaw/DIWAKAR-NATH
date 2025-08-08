import java.util.*;

class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int listSize = sc.nextInt();
        int list[] = new int[listSize];

        for(int i = 0; i < listSize; i++)
            list[i] = sc.nextInt();

        for(int i = 1; i < 10; i++) {
            int count = 0;
            for(int j = 0; j < listSize; j++) {
                if(list[j] % i == 0)
                    count++;
            }
            System.out.println(i + ":" +  count);
        }
    }
}