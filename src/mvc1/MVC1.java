
package mvc1;


public class MVC1 {

public static void main(String[] args)
{
CalculatoView view = new CalculatoView();
CalculatoModel model= new CalculatoModel();
new ClaculateConroler(view,model);
view.setVisible(true);
}
}

