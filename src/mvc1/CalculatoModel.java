
package mvc1;

import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculatoModel{
    private int sum,diff,pro,divi;

public void add(int x , int y)
{
sum = x+y;
}
public void SUB(int x , int y)
{
diff = x-y;
}
public void MULT(int x , int y)
{
pro = x*y;
}
public void DIV(int x , int y)
{
divi = x/y;
}
public int getsum()
{
return sum;

}
public int getdiff()
{
return diff;

}
public int getproduct()
{
return pro;

}
public int getdiv()
{
return divi;

}
}