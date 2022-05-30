package encapsulation;

public class Final {

	public static void main(String[] args) {
		Tenth T=new Tenth();
		System.out.println("Details for Nineth Class");
		//Nineth n=new Nineth();
		T.setsname("prasanna");
		T.setrollno(1);
		T.setsubject("science");
		T.setmarks(60);
		
		
		System.out.println("name: "+T.getsname());
		System.out.println("roll no: "+T.getrollno());
		System.out.println("Subject: "+T.getsubject());
		System.out.println("Marks :"+T.getmarks());
		
		System.out.println("Details for Tenth Class");
		//Tenth T = new Tenth();
		T.setsname("raswitha");
		T.setrollno(21);
		T.setsubject("computers");
		T.setmarks(50);
		System.out.println("name: "+T.getsname());
		System.out.println("roll no: "+T.getrollno());
		System.out.println("Subject: "+T.getsubject());
		System.out.println("Marks: "+T.getmarks());
		
		
		
		

	}

}
