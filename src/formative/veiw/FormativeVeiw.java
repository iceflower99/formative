package formative.veiw;

import javax.swing.JOptionPane;
public class FormativeVeiw
{
	public void showResponse(String wordsFromSomewhere)
    {
    	JOptionPane.showMessageDialog(null,wordsFromSomewhere);    	
    }
    
    public String grabAnswer(String stuff)
    {
    	String answer="";
    	answer=JOptionPane.showInputDialog(null,stuff);
    	
    	return answer;
    }
}
