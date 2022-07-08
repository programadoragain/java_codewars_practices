package likes;

public class Solution {
        public static String whoLikesIt(String... names) {
            String frase= "";
            
            if (names.length==0 || names[0].equals("")) {
                frase= "no one likes this";
            } 
            else
                if (names.length==1) {
                    frase= names[0] + " likes this";
                }
                else
                    if (names.length==2) {
                        frase= names[0] + " and " + names[1] + " like this";
                    }
                    else
                        if (names.length==3) {
                            frase= names[0] + ", " + names[1] + " and " + names[2] + " like this";
                        }
                        else
                            if (names.length>3) {
                                frase= names[0] + ", " + names[1] + " and " + (names.length-2) +  " others like this";
                            }
        
            return frase;
        }
       
}

/** (Mejor Solución)
 * class Solution {
    public static String whoLikesIt(String... names) {
        switch (names.length) {
          case 0: return "no one likes this";
          case 1: return String.format("%s likes this", names[0]);
          case 2: return String.format("%s and %s like this", names[0], names[1]);
          case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
          default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
}
 */

class test {

    public static void main (String[] args) {
               
        System.out.println(Solution.whoLikesIt());
    }

}
