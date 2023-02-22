import java.util.*;
public class Main   
{
	public static void main(String[] args) {
		int amt, k = 0;
    Scanner inp = new Scanner (System.in);

      System.out.print("Enter The Amount in Rupees :");
      amt = inp.nextInt ();
      
      int arr[] = {2000,500,100,50,20,10,5,2,1};
      for(int i=0;i<9;i++){
          k = amt / arr[i];
	     amt = amt % arr[i];
	     if(k>0){
	     System.out.println("Total Number Of"+arr[i]+"Rupees Notes: " + k);
	     }
      }