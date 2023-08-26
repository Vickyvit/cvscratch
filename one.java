// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class one{
 public static boolean primalrange(int n){
     if(n == 2){
         return true;
     }
     for(int i=2; i<=Math.sqrt(n); i++){
         if(n % i==0){
            // System.out.println(n);
            return false;
         }
     }
     return true;

    }
    public static void primeranges(int n){
        for(int i = 2; i<=n; i++ ){
            if(primalrange(i)){
                System.out.println(i);
            }
        }System.out.println();
     }
     public static void main(String []args){
      //  System.out.println(primalrange(13));
        primeranges(12);
     }
}