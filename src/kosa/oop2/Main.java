package kosa.oop2;

public class Main {

	public static void main(String[] args) {
		
		Work work = new Work();
		Study study = new Study();
		
		
		//Person person = new Person("gg", work);
		Person person = new Person("gg", new Role() {

			@Override
			public void doing() {
				System.out.println("Driver Role");
			}
		});
		person.doIt();
	}

}
