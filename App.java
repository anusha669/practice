import javax.swing.*;
import java.awt.*;
/*<applet="App" width=200 height=150></applet>*/
class App extends JApplet
{
	void init(){
	SwingUtilities.invokeAndWait(new Runnable
	(){
	public void run()
		{
		GUI();
		}
	});
	}
	void GUI()
	{
	JTable t;
	String data[][]={ {"ana","45"},{"anu","67"}};
	String col[]={"name","num"};
	t=new JTable(data,col);
	JScrollpane j=new JScrollpane(t);
	add(j);
}	}