
public class Ejercicio1
{
    public int algoritmo1(int veces){
       int valor = 1;
       for(int i = 2; i <= veces; i = i ){
            valor = valor + 1;
            i = i + 1;
            if(i <= veces){
               valor = valor + 2;
               i = i + 1;
               if(i <= veces ){
                  valor = valor + 3;
                  i = i + 1;
                  if(i <= veces){
                  valor = valor + 2;
                  i = i + 1;
                  }
               }
            }
        }
       return valor;
       }
}
