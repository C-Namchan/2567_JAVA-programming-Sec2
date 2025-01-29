
public class Student {
private String studentName;
private int studentScore;

	//getter and setter method
	public void setName(String stdName) {
		studentName = stdName;
		
	}
	public String getName() {
		return studentName;
	}
	public void setScore(int stdScore) {
		studentScore = stdScore;
	}
	public int getScore() {
		return studentScore;
	}
	
	//check if the score is within the valid range (0-100)
	public boolean checkScore() {
		return getScore()>=0 && getScore()<=0;
		
	}
	//check the student passed (score>=50)
	public boolean isPass() {
		return getScore() >=50;
		}
	
}
