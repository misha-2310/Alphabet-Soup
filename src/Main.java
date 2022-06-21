import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String result = alphabetSoup("misha");
        System.out.println(result);
    }

    public static String alphabetSoup(String str){
        char[] a = str.toCharArray();

        Arrays.sort(a);


        System.out.println(a);

        String str1 = " ";

        str1 = String.copyValueOf(a);
        return str1;
        //return String.valueOf(a);
    }
}
