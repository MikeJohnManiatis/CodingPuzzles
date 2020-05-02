import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    static Methods methods = new Methods();
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = reader.readLine();
//        System.out.println(methods.isUniqueWithDataStructures(line));
//        System.out.println(methods.urlify("This is a test.", 15));
        System.out.println(methods.isPermutationOfPalindrome("taco cate"));

    }

}
