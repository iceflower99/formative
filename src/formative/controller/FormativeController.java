package formative.controller;

import formative.veiw.FormativeVeiw;
import formative.model.thingy;
public class FormativeController
{

	private FormativeVeiw myPopups;
	private thingy mytestThing;
	
public formativeController()
{
 	myPopups = new FormativeVeiw();
}

public void start()
{
	String myName = myPopups.grabAnswer("Type in your name");
	myPopups.showResponse("You typed in: " + myName);
}
}

