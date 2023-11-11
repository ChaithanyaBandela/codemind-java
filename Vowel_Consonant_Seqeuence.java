import java.util.*;
public class VowelConsonantSequence{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(generateSequence(input));
    }
    public static String generateSequence(String s){
        StringBuilder sequence=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                if(sequence.length()==0 || sequence.charAt(sequence.length()-1)!='V'){
                    sequence.append('V');
                }
            }
            else{
                if(sequence.length()==0||sequence.charAt(sequence.length()-1)!='C'){
                    sequence.append('C');
                }
            }
        }
        return sequence.toString();
    }
    public static boolean isVowel(char c){
        return "aeiou".indexOf(c)!=-1;
    }
}