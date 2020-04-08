package demo;
import org.testng.annotations.DataProvider;

public class Datafunction {
	
	@DataProvider(name = "dataforPost")	
		public Object[][] dataforPost() {
			
			//Object[][] data= new Object[2][4];
			
//			data[0][0]="elena";
//			data[0][1]="elena@ee.com";
//			data[0][2]="https://s3.amazonaws.com/uifaces/faces/twitter/araa3185/128.jpg";
//			data[0][3]=4;
//			
//			data[1][0]="tiger";
//			data[1][1]="tiger@tt.com";
//			data[1][2]="https://s3.amazonaws.com/uifaces/faces/twitter/araa3185/128.jpg";
//			data[1][3]=1;
//			
//			return data;
			
			return new Object[][] {
				{
	"khalisi","kkGeorge@gg.com","https://s3.amazonaws.com/uifaces/faces/twitter/mrmoiree/128.jpg",5
					},
					{
	"sharryl","sssRachel@gg.com","https://s3.amazonaws.com/uifaces/faces/twitter/hebertialmeida/128.jpg",4
					}
			};		
		}
		

	
	@DataProvider(name="deletefordat")
	public Object[] deletefordat() {
	
	 return new Object[] 
			{11};
			}
}
