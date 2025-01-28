/*
 * recursion with parameter
 * 
 *  sum of first N number
 *      2 way
 *      parameter or functional
 */


 /*
 parameter to print 
 f(i,sum){
    if(i<1){
        print(sum);
        return;
    }
    f(i-1, sum+i);
 }

 main{
    int n; // given
    f(n,0)
 }

*/

// function is use return, n= 3 given

/*f(n)
{
   if(n=<1)
   {
      return 0;
   }

   return n + f(n-1);
}
main()
{
   // n
   print(f(n));
}
*/

//

/*revers a array.

f(l,r){
   if(l>=r) return;
   swap(a[l],a[r])
   f(l+1,r-1);
}

by one pointer var

f(i)
{
   if(i > = (n/2)) return ;
   swap(a[i],a[n-i-1]);
   f(i+1);
}
main(){
   f(0);
}
*/

import java.util.Arrays;

public class Recusionpra {

   void swap(int i, int arr[], int n){
      if( i >= (n/2)) return;

      // Swap logic
      int temp = arr[i];
      arr[i] = arr[n-i-1];
      arr[n-i-1] = temp;

      // Recursion call
      swap(i+1, arr, n);
   }

   public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4, 5};

      // Create an instance of Recusionpra class
      Recusionpra obj = new Recusionpra();
      
      // Call the swap method on the object
      obj.swap(0, arr, 5);

      // Print the swapped array
      System.out.println(Arrays.toString(arr));
   }
}