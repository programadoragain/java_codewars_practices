package array_filtra_enteros;

import java.util.ArrayList;
import java.util.List;

public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> listaTemp= new ArrayList<Integer>();
    
    for (int x :a) {
      listaTemp.add(x);
    }
    
    for (int y :b) {
      for (int z=0; z < listaTemp.size(); z++) 
        if (y == listaTemp.get(z)) listaTemp.remove(z);
    }

    int[] arrayFinal= new int[listaTemp.size()];

    for (int i=0; i < listaTemp.size(); i++)
      arrayFinal[i]= listaTemp.get(i);

    return arrayFinal;
  }

  public static void main(String[] args) {
      int[] testA= {8,10,2,3,5,50,8,5,30,8};
      int[] testB= {2,3,8};

      for (int x :arrayDiff(testA,testB)) 
        System.out.print(x + " ");
      

  }
    
  }
