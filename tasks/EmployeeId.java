package pavan.tasks;

import java.util.*;
public class EmployeeId
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String inStr="", outString = "";
        final int MAX = 999;
        int[] emps = new int[4];
        int x=0;
        try
        {
            for(x = 0; x < emps.length; ++x)
            {
                System.out.println("Enter employee ID number");
                inStr = input.next();
                emps[x] = Integer.parseInt(inStr);
                if(emps[x] > MAX)
                {
                    throw new DebugEmployeeIDException("Number too high " + emps[x]);
                }
            }

        }
        catch(NumberFormatException error)
        {  
            --x;
            System.out.println(inStr + "\nNonnumeric ID");
        }
        catch(DebugEmployeeIDException error)
        {  
            --x;
            System.out.println("FixDebugEmployeeIDException");
        }


        for(x = 0; x < emps.length;x++)
        {
            outString = outString + emps[x] + " ";
        }
        System.out.println("Four valid IDS are: " + outString);    
    }
}
class DebugEmployeeIDException extends Exception
{
    public DebugEmployeeIDException()
    {
        super("Debug employee exception");
    }
    public DebugEmployeeIDException(String message) {
        super(message);
    }
}

