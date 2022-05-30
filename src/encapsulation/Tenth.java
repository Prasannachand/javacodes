package encapsulation;

public class Tenth extends Nineth{

	
	   String sname;
		 int rollno;
		String subject;
		 int marks;
		public void details()
		{
			super.setsname(sname);
			super.getsname();
			super.setrollno(rollno);
			super.getrollno();
			super.setsubject(subject); 
			super.getsubject();
			super.setmarks(marks);
			super.getmarks();
			
			
		}
		

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


		/*public void setsname(String name)
		{	
			super.setsname(name);
			sname=name;
		}
		public String getsname() {
			super.getsname();
			return sname;
		}
		
		public void setrollno(int a)
		{
			super.setrollno(a);
		rollno=a;
		}
		
		public int getrollno() {
			super.getrollno();
			
			return rollno;
		}
		public void setsubject(String sub2) {
			super.setsubject(sub2);
			subject=sub2;
		}
		public String getsubject()
		{
			super.getsubject();
			return subject;
		}
		public void setmarks(int c) {
			super.setmarks(c);
			marks=c;
		}
		public int getmarks()
		
		{
			super.getmarks();
			return marks;
		}*/
		

