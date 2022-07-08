package camelcase;

public class Solution{

    static String toCamelCase(String s){
      String[] newString= s.split("_");
      String[] newString2= s.split("-");
      String camel= "";
    
      if ((newString.length!=0) && newString2[0].equals(s)) {
        for (int y=0; y<newString.length; y++) {
            if (y==0) {
                camel= newString[y].substring(0,1).toLowerCase() + newString[y].substring(1);
            }
            else {
                camel+= newString[y].substring(0,1).toUpperCase() + newString[y].substring(1);
            }
        }
      }
      else {
        if (newString2.length!=0) {
            for (int i=0; i<newString2.length; i++) {
                if (i==0) {
                    camel= newString2[i].substring(0,1).toLowerCase() + newString2[i].substring(1);
                }
                else {
                    camel+= newString2[i].substring(0,1).toUpperCase() + newString2[i].substring(1);
                }
            }

        }
      }
      
        return camel;
    }
}

class test {
    public static void main (String[] args) {
        System.out.println(Solution.toCamelCase("The_Stealth_Warrior"));
    }
}