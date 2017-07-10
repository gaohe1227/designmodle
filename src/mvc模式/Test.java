package mvcģʽ;

public class Test {
	public static void main(String[] args) {

		// �����ݿɻ�ȡѧ����¼
		StudentModel model = retriveStudentFromDatabase();

		// ����һ����ͼ����ѧ����ϸ��Ϣ���������̨
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();

		// ����ģ������
		controller.setStudentName("John");

		controller.updateView();
	}

	private static StudentModel retriveStudentFromDatabase() {
		StudentModel student = new StudentModel();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
