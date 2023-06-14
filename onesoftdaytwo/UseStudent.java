package onesoftdaytwo;

public class UseStudent {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="prashanth";
		student1.rollno=21;
		student1.tamil=88;
		student1.english=99;
		student1.maths=99;
		student1.physics=78;
		student1.chemsitry=99;
		student1.computerscience=88;
		student1.totalmarks=(student1.tamil+student1.english+student1.maths+student1.physics+student1.chemsitry+student1.computerscience);
		student1.average=student1.totalmarks/6;
		
		
		
		Student student2=new Student();
		student2.name="shanth";
		student2.rollno=22;
		student2.tamil=84;
		student2.english=89;
		student2.maths=91;
		student2.physics=58;
		student2.chemsitry=69;
		student2.computerscience=68;
		student2.totalmarks=(student1.tamil+student1.english+student1.maths+student1.physics+student1.chemsitry+student1.computerscience);
		student2.average=student1.totalmarks/6;
		
		System.out.println("studentnam e"+student2.name+"  studentaverage="+student2.average);
		System.out.println("studentname "+student1.name+"  studentaverage="+student1.average);
	}

}
