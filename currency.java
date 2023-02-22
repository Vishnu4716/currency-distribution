import java.util.*;
public class Main
{
  public static void main (String args[])
  {
    int amt, k = 0;
    Scanner inp = new Scanner (System.in);

      System.out.print("Enter The Amount in Rupees :");
      amt = inp.nextInt ();
    if(amt>0){
    while (amt >= 2000)
      {
	k = amt / 2000;
	amt = amt % 2000;
	System.out.println("Total Number Of 2000 Rupees Notes :" + k);
	break;
      }
    while (amt >= 500)
      {
	k = amt / 500;
	amt = amt % 500;
	System.out.println("Total Number Of 500 Rupees Notes : " + k);
	break;
      }
    while (amt >= 100)
      {
	k = amt / 100;
	amt = amt % 100;
	System.out.println("Total Number Of 100 Rupees Notes : " + k);
	break;
      }
    while (amt >= 50)
      {
	k = amt / 50;
	amt = amt % 50;
	System.out.println("Total Number Of 50 Rupees Notes : " + k);
	break;
      }
    while (amt >= 20)
      {
	k = amt / 20;
	amt = amt % 20;
	System.out.println("Total Number Of 20 Rupees Notes : " + k);
	break;
      }
    while (amt >= 10)
      {
	k = amt / 10;
	amt = amt % 10;
	System.out.println("Total Number Of 10 Rupees Notes : " +
			  k);
	break;
      }
    while (amt >= 5)
      {
	k = amt / 5;
	amt = amt % 5;
	System.out.println("Total Number Of 5 Rupees Notes : " + k);
	break;
      }
    while (amt >= 2)
      {
	k = amt / 2;
	amt = amt % 2;
	System.out.println("Total Number Of 2 Rupees Notes : " + k);
	break;
      }
    while (amt >= 1)
      {
	k = amt / 1;
	amt = amt % 1;
	System.out.println("Total Number Of 1 Rupees Notes: " + k);
	break;
      }
    }
    else{
        System.out.print("please enter the valid amount");
    }
  }
}