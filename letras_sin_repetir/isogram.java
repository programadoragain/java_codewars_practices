package letras_sin_repetir;

public class isogram {
    public static boolean isIsogram(String str) {
        String[] split= str.toLowerCase().split(" ");

        for (String s :split) {
            for (int i=0; i < s.length(); i++) {
                for (int x= i+1; x < s.length(); x++) {
                    if (s.charAt(i) == s.charAt(x)) return false; 
                }
            }
        }
        
        return true;
    } 

    public static void main (String arg[]) {
        System.out.println(isIsogram("moOse"));
    }



}