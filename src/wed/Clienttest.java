package wed;

class Encapsulationtest1 {
	private int i;
	private String name;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Clienttest {
	public static void main(String[] args) {
		Encapsulationtest1 t = new Encapsulationtest1();
		t.setI(2);
		System.out.println(t.getI());
		System.out.println(t.getName());

	}
}
