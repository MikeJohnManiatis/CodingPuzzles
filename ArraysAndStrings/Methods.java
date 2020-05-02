import java.util.*;
public class Methods
{

    /*
        Implement an algorithm to determine if a string has all unique characters.
     */
    public boolean isUniqueWithDataStructures(String s){
        char[] chars = s.toCharArray();
        boolean[] charTracker = new boolean[256];

        for(char c : chars){
            int ascii = c;
            if (charTracker[ascii] == true)
                return false;
            else
                charTracker[ascii] = true;
        }

        return true;
    }
    /*
        Given two strings, write a mthod to decide if one is a permutation of the other.
     */
    public boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        boolean[] visited = new boolean[s1.length()];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++){
            for (int j = 0; j < s2.length(); j++){
                if ((s1.charAt(i) == s2.charAt(j)) && (visited[j] == false)) {
                    sb.append(s2.charAt(j));
                    break;
                }
            }
        }
        System.out.println(sb);
        return (sb.length() == s1.length());
    }

    /*
        Given a string, determine if it's a permutation of a palindrome.
        ex: RaceCar | Taco Cat
     */
    public boolean isPermutationOfPalindrome(String str){
        String newString = str.toLowerCase();
        int[] visited = new int[256];

        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ' ')
                visited[str.charAt(i)]++;
        }

        boolean tooManyOdds = false;
        for (int i : visited)
        {

            if (i % 2 != 0)
            {
                if (tooManyOdds)
                    return false;
                else
                    tooManyOdds = true;
            }
        }
        return true;
    }
}