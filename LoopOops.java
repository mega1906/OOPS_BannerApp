/** 
* OOPSBANNERAPP UC4 - OOPS BANNER Display Application
* 
* This class demonstrates a simple Java application that displays the Object
*Oriented Programming System OOPS acronym to the console.
* @author Developer
* @version 4.0
**/
class LoopOops{
	public static void main(String[] args){
		String oops[] = new String[9];
		oops[0] = String.join(" ", "   ***   " , "   ***   " , " ******   " , "  ***** ");
		oops[1] = String.join(" "," **   **" , "  **   **" , "  **   **" ,  " **");
		oops[2] = String.join(" ","**     **" , "**     **" , " **    **" , "**");
		oops[3] = String.join(" ","**     **" , "**     **" , "  **   **" , " **");
		oops[4] = String.join(" ","**     **" , "**     **" , " ****** " , "   ****");
		oops[5] = String.join(" ","**     **" , "**     **" , " **     " , "      **");
		oops[6] = String.join(" ","**     **" , "**     **" , " **     " , "       **");
		oops[7] = String.join(" "," **   **" , "  **   **" , "  **     " , "      **");
		oops[8] = String.join(" ","   ***   " , "   ***   " , " **     " , "  ***** ");
		
		for (String i : oops){
			System.out.println(i);
		}	
	}
}