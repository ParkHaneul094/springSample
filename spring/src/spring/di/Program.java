package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;

public class Program {

	public static void main(String[] args) {
		
//		Exam exam = new NewlecExam();
//		ExamConsole console = new GridExamConsole(exam);
//		console.setExam(exam);
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml")
		
		ExamConsole console = ;
		console.print();
	}

}
