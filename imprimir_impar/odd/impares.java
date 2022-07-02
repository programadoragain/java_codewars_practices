package imprimir_impar.odd;

public class impares {

        public int findIt(int[] a) {
            int x= 0;
            int i= 0;
            int k;
            int count;
            int odd= 0;
            boolean par= true;

            while ((i<a.length) && (par)) {
                x= a[i];
                k= 0;
                count= 0;
                while (((k)<a.length) && (par)) {
                    if (x == a[k]) count++;
                    k++;
                }
                if ((count % 2) != 0) {
                    par= false;
                    odd= x;
                }
                i++;
            }

            return odd;
        }
}

