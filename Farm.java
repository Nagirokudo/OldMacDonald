class Farm 
{     
   //your code here
	private Animal[] aBunchOfAnimals = new Animal [3];
	Public Farm ()
	{
		aBunchOfAnimals[0] = new Cow ("cow", "moo");
		aBunchOfAnimals[1] = new Chick ("chick", "cluck");
		aBunchOfAnimals[2] = new Cow ("pig", "oink");

	}
	public void animalSounds()
	{
		for (int nI = 0; nI < aBunchOfAnimals.length; nI++)
		{
			System.out.println(aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals);
		}
		System.out.println( " The cow is known as " + ((NamedCow)aBunchOfAnimals[0]);
	}
}
