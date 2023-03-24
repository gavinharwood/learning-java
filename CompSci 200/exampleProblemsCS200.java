import java.util.Random;
public class exampleProblemsCS200 {

    public static void main(String[] args) {
        
        for(int i = 1; i <= 7; i+=2) {
            if (i > 5) break;
            if (i % 3 == 0) continue;
            System.out.print(i + " ");
        }
        for(int k = 0; k < 6; k++) {
            if (k % 2 == 0) continue;
            if (k % 3 == 0) break;
            System.out.println(k);
        }

        //for(int g = 9; g != -12; g -=3) {

            //System.out.println(g + " ");

        //}
        
        int j = 0;
        do {
            ++j;
            if (j % 2 == 0) {
                System.out.println(" * * * * *");
            } else if (j % 2 != 0) {
                System.out.println("* * * * * *");
            }
        } while (j < 6);


        int f = 0;
        do {
            ++f;
            if (f % 2 != 0) {
                System.out.println("0 1 2 3 4 5");
            } else if (j % 2 == 0) {
                System.out.println("6 5 4 3 2 1");
            }
        } while (f < 6);

        for (int i = 1; i < 6; ++i) {
            int g = i + 4;
            String tempVal = "";
            for(int n = i; n <= g; ++n) {
                tempVal = tempVal + (n + " ");
            }
            System.out.println(tempVal);
        }

        int [] list = {14, 23, 35, 42};
        System.out.println(list[2]);


        

    }
    
}
