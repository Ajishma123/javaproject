package package1;

public class pgm23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Score(0-100)
		int score =80;
		String grade = null;
		switch (score/10) {
		
		case 10:
		case 9:
			grade = "A";
			break;
			
		case 8:
			grade = "B";
			break;
		case 7:
			grade ="c";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade ="E";
			break;
		
				
		}
		// display result
		System.out.println("Grade ="+ grade);
	}
	

}
