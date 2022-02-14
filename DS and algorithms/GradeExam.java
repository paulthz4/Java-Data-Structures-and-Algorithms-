public class GradeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Students' answers to the questions
	    char[][] answers = {
	      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
	      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
	      {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
	      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
	      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
	      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
	      {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
	      {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

	    // Key to the questions
	    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

	    // Grade all answers
    	int max = 0;
    	int student = 0;
	    for(int i=0;i<answers.length;i++) {
	    	int	correct = 0;
	    	for(int j=0;j<answers[i].length;j++) {
	    		if(answers[i][j] == keys [j]) {
	    			correct++;
	    			if(correct > max) {
	    				max = correct;
	    				student = i;
	    			}
	    		}
	    	}
	    	System.out.println("Correct questions for student " + i+" is "+correct);
	    }
    	System.out.println("\nstudent with the max grade is student"+student+" with "+max+" correct");

	}

}
