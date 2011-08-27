import com.cycling74.max.MaxObject;

import processing.core.PApplet;

public class HelloWorld extends PApplet{

	private static final long serialVersionUID = 1L;
	public String message = "Hello world from SR!??";
	public int i = 0;
	private MaxObject maxmsp;
	
	public void setup()
	{	size(600,600);
		textFont(loadFont("CourierNew-14.vlw"));
	}
	
	public void draw() {
		i = i + 1;
		background(0);
		text(message,10,10);
		text(i,10,30);
		rect(width/2,height/2,30,10);
	}
	
	public void keyPressed() {
		if ((keyCode == ENTER) && (maxmsp != null))
		{	maxmsp.outlet(0, "ENTER");
			MaxObject.post("Processing detected an ENTER press!");
		}
		
			
	}
	
	public void setMessage(String text)
	{	message = text;
	}

	public void setMaxMSP(MaxObject _maxmsp) {
		maxmsp = _maxmsp;		
	}
	

}



