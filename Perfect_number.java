

/*perfect number*/
//input number 6----->1 2 3 4 5 
//6----->1+2+3 = 6
import java.util.Scanner;
class Perfect_number{
    public static void main(String[] args){
    int n,Sum = 0;
    System.out.print("Enter any number:");
   Scanner r = new Scanner(System.in);
   n = r.nextInt();
   for(int i = 1; i < n; i++){
    if(n % i== 0){
      Sum = Sum + i; 
    } 
   }
   if(n== Sum){
     System.out.print("perfect number: ");
   }
     else{
   System.out.print(" not perfect number: ");
   }
    } 
}














