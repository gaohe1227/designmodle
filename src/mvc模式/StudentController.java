package mvc模式;

/**
 * 
 * Description:controller层
 * 
 * @author:高鹤
 * @date:2017年7月10日
 */
public class StudentController {
	private StudentModel model;
	private StudentView view;

	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
