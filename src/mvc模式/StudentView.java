package mvc模式;
/**
 * 
 * Description:view层
 * @author:高鹤
 * @date:2017年7月10日
 */
public class StudentView {
	public void printStudentDetails(String studentName, String studentRollNo) {
		System.out.println("Student: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}
}
