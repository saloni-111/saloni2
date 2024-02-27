import java.applet.Applet;
import java.awt.*;
public class demo11 extends Applet
{
	/*
	<applet code="demo11.class" width="200" height="200">
	</applet>
	*/
	public void init()
	{
		System.out.println("init method");
	}
	public void start()
	{
		System.out.println("start method");
	}
	public void stop()
	{
		System.out.println("stop method");
	}
	public void destroy()
	{
		System.out.println("destroy method");
	}
	public void paint(Graphics g)
	{
		System.out.println("paint method");
	}
}
