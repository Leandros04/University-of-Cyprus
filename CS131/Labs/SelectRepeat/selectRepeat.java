
public class selectRepeat {
	public static void newLine (){
			 System.out.println();
			 }
	public static void main(String[] args) {
		 
			 char START_CHAR = ' ';
			 char END_CHAR = '~';
			 int per_line = 5;
			 newLine();
			 System.out.println("Displaying Print Characters with their Codes");
			 for (char c = START_CHAR; c <= END_CHAR; c++){
			 if ((c - START_CHAR)% per_line == 0) newLine();
			 System.out.print(" " + c + " " + (int)c);
			 }

	}

}
