package Q614;

class B {
	private String school;
	private int grade;
	public schoolName (String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	public void print() {
		System.out.println(grade + " grade in "+ school+ " School");
	}
	public void setschool(String school) {
		this.school = school;
	}
	public String getschool() {
		return school;
	}
	public void setgraade(int grade) {
		this.grade = grade;
	}
	public String getgrade() {
		return grade;
	}
}
