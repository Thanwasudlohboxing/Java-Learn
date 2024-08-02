public class Main {
    public static void main(String[] args) {
        int sumNumber = 0;

        for(int i = 1; i <= 10; i++){
            if(i % 2 != 0 ){
                continue;
            }
            sumNumber += i;
        }
        System.out.println(sumNumber);
    }
}