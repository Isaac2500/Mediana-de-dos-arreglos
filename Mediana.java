public class Mediana {

    public static void main(String[] args) {

        int []a = {1,12,15,26,38};
        int []b = {2,13,17,30,45};

        int n1 = a.length;
        int n2 = b.length;

        if (n1 == n2) {
            System.out.println("La mediana es: "+obtenerMediana(a,b,n1)); 
        } else {
            System.out.println("Los arreglos son de diferente dimension");
        }
        
    }

    
    static int obtenerMediana (int[] a, int[] b,int n){
        int i = 0,j = 0;
        int cont;
        int Mediana1 = -1, Mediana2 = -1;

        for ( cont = 0; cont <= n; cont++) {
            
            if(i == n){
                Mediana1 = Mediana2;
                Mediana2 = b[0];
                break;
            }else{
                if(j == n){
                    Mediana1 = Mediana2;
                    Mediana2 = a[0];
                    break;
                }
            }

            if(a[i]<b[j]){
                Mediana1 = Mediana2;
                Mediana2 = a[i];
                i++;
            }else{
                Mediana1 = Mediana2;
                Mediana2 = b[j];
                j++;
            }
        }

        return (Mediana1 + Mediana2)/2;
    }
}