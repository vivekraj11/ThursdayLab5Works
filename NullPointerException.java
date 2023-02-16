package thursdayLab5;
import java.io.*;
public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ptr = null;
		try
        {
            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(Exception e)
        {
            System.out.print("NullPointerException Caught");
        }
	}

}