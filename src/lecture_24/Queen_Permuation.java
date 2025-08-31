package lecture_24;

public class Queen_Permuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tq = 2;// total queens we have
		boolean[] board = new boolean[n];//this board ensure that the queen is present on which box(hold the queen's position)
		Permuation(board,tq,"",0);
		

	}
	
//	qpsf = queen place so far= this ensure that how many queen are placed
	public static void Permuation(boolean[] board,int tq , String ans, int qpsf) {
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for(int i = 0 ; i < board.length ; i++) {
			if(! board[i]) {
				board[i] = true;
				Permuation(board , tq , ans + "b" + i + "q" + qpsf , qpsf + 1);
				board[i] = false; // this step hold backtra lcking
			}
			
		}
		
		
	}

}
