//Programmer: Jennifer King

public class UserPlayer 
{
	public static void main(String[] args)
	{
		Child child = new Child();
		Musician musician = new Musician();
		Actor actor = new Actor();
		
		System.out.println(child.play());
		System.out.println(musician.play());
		System.out.println(actor.play());
	}
}
