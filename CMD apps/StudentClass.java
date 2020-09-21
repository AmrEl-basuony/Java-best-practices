class Student{
	public static String name , track;
	public static int age;
	public static void list(){
		System.out.println(Student.name +" "+ Student.age +" "+ Student.track);
	}
	public void setStudent(String name, String track, int age){
		this.name = name;
		this.track = track;
		this.age = age;
	}
    public static void main(String[] args){  
       Student s1 = new Student();
       s1.setStudent("amr","android",22);
       s1.list();
    }  
}  