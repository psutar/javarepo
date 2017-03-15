package clone.deep_copy;

public class PupilVO implements Cloneable {
	
	public PupilVO(String name, String sub) {
		this.name = name;
		this.subj = new SubjectVO(sub);
	}
	// Contained object
	private SubjectVO subj;
	private String name;

	/** * @return the subj */
	public SubjectVO getSubj() {
		return subj;
	}

	/** * @param subj * the subj to set */
	public void setSubj(SubjectVO subj) {
		this.subj = subj;
	}

	/** * @return the name */
	public String getName() {
		return name;
	}

	/** * @param name * the name to set */
	public void setName(String name) {
		this.name = name;
	}
	

	public Object clone() {
		// deep copy
		PupilVO pupil = new PupilVO(name, subj.getName());
		return pupil;
	}
}
