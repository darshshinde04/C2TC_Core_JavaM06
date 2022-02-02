package project1;

public class polymorphism 
{
	
	
	void m()
	{
		System.out.println ("no parameter");
	}
	
	void m(int i)
	{
		System.out.println ("int parameter");
	}

	void m(double j)
	{
		System.out.println ("double param");
	}
	public static void main(String[] args) {
		
		polymorphism p= new polymorphism();
		
		p.m();
		p.m(20);
		p.m(6.3);
	
		p.m('a');
		p.m(10l);
		p.m(5.8f);
		p.m(2.0);
		

	}
}
		