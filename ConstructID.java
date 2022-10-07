//EXERCISE====>7
package constructid;

import java.util.Scanner;

public class ConstructID 
{
    public static void main(String[] args) 
    {
String name, streetaddress;
        Scanner sr = new Scanner(System.in);
        
        System.out.println("Enter your Name: ");
        name = sr.nextLine();
        
        System.out.println("Enter your address: ");
        streetaddress = sr.nextLine();

        String initials = "";
        char c = name.charAt(0);
        initials += c;
        
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (letter == ' ') {
                initials += name.charAt(i + 1);
            }

        }
        String IDnumber = "";
        boolean finished = false;
        for (int i = 0; i < streetaddress.length(); i++) {
            if (!finished) {
                char num = streetaddress.charAt(i);
                if (num != ' ') {
                    IDnumber += num;
                } else 
                {
                    finished = true;
                }
            } else 
            {
                break;
            }
        }
        System.out.println(initials + IDnumber);

    }
    }