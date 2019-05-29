
package mvc1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ClaculateConroler
{
private CalculatoView theView;
private CalculatoModel theModel;
public ClaculateConroler (CalculatoView theView, CalculatoModel theModel)
{
this.theView = theView;
this.theModel = theModel;
theView.addClaculationListner(new CalculateListener());
}
class CalculateListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
int firstNumber, secondNumber = 0;
try{
firstNumber = theView.getFirstnu();
secondNumber = theView.getSectnu();
theModel.add(firstNumber, secondNumber);
theModel.SUB(firstNumber, secondNumber);
theModel.MULT(firstNumber, secondNumber);
theModel.DIV(firstNumber, secondNumber);
if(e.getSource()==theView.pluse){
    theView.setSolu(theModel.getsum());
    
}else if(e.getSource()==theView.mines){
   theView.setSolu(theModel.getdiff()); 
}
else if(e.getSource()==theView.mult){
   theView.setSolu(theModel.getproduct()); 
}
else if(e.getSource()==theView.div){
   theView.setSolu(theModel.getdiv()); 
}
}
catch(NumberFormatException ex)
{
System.out.println(ex);
theView.displayerror("You Need to Enter 2 Integers"); } }}}