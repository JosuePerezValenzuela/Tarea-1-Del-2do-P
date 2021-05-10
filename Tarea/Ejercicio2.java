
public class Ejercicio2
{
    public int padovan (int veces){
       int a1 = 1;
       int a2 = 1;
       int a3 = 1;
       int resp = 1;
       for (int i = 4; i <= veces; i = i + 1){
           resp = a1 + a2;
           a1 = a2;
           a2 = a3;
           a3 = resp;
        }
       return resp;
   }
}
