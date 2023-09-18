import java.util.*;
public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        String[] words = str.split(" ");

        for (String word : words) {
            if (word.length() > 1) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                boolean startsWithVowel = firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U' ||
                                          firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
                boolean endsWithConsonant = !((lastChar == 'A' || lastChar == 'E' || lastChar == 'I' || lastChar == 'O' || lastChar == 'U' ||
                                               lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u'));

                if (startsWithVowel && endsWithConsonant) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
