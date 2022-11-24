import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Liczydlo {
    public static void main(String[] args) {
        System.out.println("Posortować malejąco (1) czy rosnąco (2)?");
        Scanner scanner=new Scanner(System.in);
        int sortowanie=scanner.nextInt();
        Integer [] liczby = new Integer []{2, 3, 7, 3, 3, 5, 2};
        int liczydlo=0;
        for (int liczba : liczby){

            if(liczba==3){
                System.out.println(liczba);
                liczydlo++;
            }

        }
        System.out.println("Mamy "+liczydlo+" trójki/ek");
        switch (sortowanie){
            case 1:
                Arrays.sort(liczby, Collections.reverseOrder());
                System.out.println(Arrays.toString(liczby));
                break;
            case 2:
                Arrays.sort(liczby);
                System.out.print(Arrays.toString(liczby));
                break;
        }
    }
}
