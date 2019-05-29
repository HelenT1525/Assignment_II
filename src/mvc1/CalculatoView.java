
package mvc1;

import java.awt.event.ActionListener;
import javax.swing.*;


public class CalculatoView extends JFrame
{

private JTextField fn = new JTextField(5);
private JTextField sn = new JTextField(5);
JButton pluse= new JButton("+");
JButton mines = new JButton("-");
JButton mult = new JButton("*");
JButton div = new JButton("/");

private JTextField sol = new JTextField(5);
public CalculatoView()
{
JPanel jp = new JPanel();
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(600,300);
jp.add(fn);
jp.add(sn);
jp.add(pluse);
jp.add(mines);
jp.add(mult);
jp.add(div);
jp.add(sol);
this.add(jp); }
public int getFirstnu()
{
return Integer.parseInt(fn.getText());
}
public int getSectnu()
{
return Integer.parseInt(sn.getText());
}

public void setSolu(int solution)
{
sol.setText(Integer.toString(solution));
}
void addClaculationListner(ActionListener forButton)
{
pluse.addActionListener(forButton);
mines.addActionListener(forButton);
mult.addActionListener(forButton);
div.addActionListener(forButton);
}
void displayerror(String error)
{
JOptionPane.showMessageDialog(this, error); }}