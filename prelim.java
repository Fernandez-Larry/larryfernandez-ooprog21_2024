public class prelim {
public static int fibo(int k) {
   if (k < 0) {
   return 1; 

} else if (k == 0) {
   return 0; 

} else if (k == 1) {
return 1; 

} else {
return fibo(k - 1) + fibo(k - 2); 
   }
}

public static void main(String[] args) {
for (int i = 0; i <= 10; i++) {

System.out.println("fibonacci()"+i+" -> " + fibo(i));
   }
      }
         } 
