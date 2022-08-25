package pkg3;

import java.util.Scanner;

public class Main {

public static void main (String[] args){
bill sc=new bill();
sc.domestic();
sc.com();
                            }

}

class bill 
{
     int cnumber;
     String cname;
     double preading;
     double creading; 
   void domestic()
{

    int unit=0;
    Scanner obj=new Scanner(System.in);
    System.out.println("ENTER UNITS");
    unit = obj.nextInt();

if (unit==100)
       {
   System.out.println("rs=1.5");
         }

else if (unit<200 && unit>=100)
{
System.out.println("rs=3");
         }
else if (unit<500 && unit>=200)
{
System.out.println("rs=4.5");
         }

else 
{
System.out.println("rs=7");
         }
}

void com()
{
    int unitc=0;
    Scanner obj=new Scanner(System.in);
    System.out.println("ENTER UNITS");
    unitc=obj.nextInt();
if (unitc==100)
{
System.out-println("rs=2.5"):
}

else if(unitc>=100 && unitc<200)
{
System.out.println("rs=5");
}

else if (unitc>=200 && unitc<500)
{
System. out.println("rs=6.5");
}
else
{
System.out.println("rs=9"):
         }
}
}
