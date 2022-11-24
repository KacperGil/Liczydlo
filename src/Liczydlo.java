public class Liczydlo {
    public static void main(String[] args) {
        int[] liczby = new int[]{2, 3, 7, 3, 3, 5, 2};
        int liczydlo=0;
        for (int liczba : liczby){

            if(liczba==3){
                System.out.println(liczba);
                liczydlo++;
            }

        }
        System.out.println("Mamy "+liczydlo+" trójki/ek");
    }
}
