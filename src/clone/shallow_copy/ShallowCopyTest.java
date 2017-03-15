package clone.shallow_copy;
public class ShallowCopyTest {
	public static void main(String[] args) {
		// Original Object
		PupilVO stud = new PupilVO("Johnathan", "Algebra");
		System.out.println("Original Object: " + stud.getName() + " - "+ stud.getSubj().getName());
		// Clone Object
		PupilVO clonedStud = (PupilVO) stud.clone();
		System.out.println("Cloned Object: " + clonedStud.getName() + " - "+ clonedStud.getSubj().getName());
		stud.setName("Daniel");
		stud.getSubj().setName("Physics");
		System.out.println("Original Object after it is updated: "+ stud.getName() + " - " + stud.getSubj().getName());
		System.out.println("Cloned Object after updating original object: "+ clonedStud.getName() + " - "
						+ clonedStud.getSubj().getName());
	}
}
