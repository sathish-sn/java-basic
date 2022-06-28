package Methods1;

public class B extends A{
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void setValue(int value) {
		System.out.println("setValue method in B class ");
		super.setValue(value);
	}


}
