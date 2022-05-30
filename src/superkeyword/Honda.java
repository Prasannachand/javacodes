package superkeyword;

public class Honda extends Suzuki{
	

	void engine() {
	System.out.println("This engine fits for Honda");
	}
void breaks()
{
	super.breaks();
	System.out.println("apply breaks");
}
	void Hondastart() {
	super.engine();
	}
	public static void main(String[] args) {
		Honda H = new Honda();
		H.engine();
		H.Hondastart();
		H.breaks();
		
		
		

		}

}
