import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] arr1 = new String[]{"morango", "abacaxi", "kiwi", "acerola"};
        String[] arr2 = new String[]{"laranja", "uva", "acerola", "melancia"};

        for(int i = 0; i<arr1.length; i++){
            for (int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
