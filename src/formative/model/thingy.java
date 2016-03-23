package formative.model;

public class thingy
{
   private String name;
   private int rock;
   private int paper;
   private int scissors;
   
   public Thingy()
   {
	   name = "";
	   int rock = 1 ;
       int paper = 2;
       int scissors = 3;
    }
    
   public Thingy(String name ,int rock,int paper,int scissors)
   {
	   this.name=name;
	   this.rock=rock;
	   this.paper=paper;
       
   }
   
   public String getName()
	{
		return name;
	}

}
