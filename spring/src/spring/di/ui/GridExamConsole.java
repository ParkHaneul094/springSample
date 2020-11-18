package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.println("天天天天天天天天天天天天天");
		System.out.println("| total  |  avg  |");
//		System.out.println("| %d  |  %f  |", exam.total(), exam.avg() );
		System.out.println("天天天天天天天天天天天天天");

	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
