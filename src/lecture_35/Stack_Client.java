package lecture_35;

public class Stack_Client {

	public static void main(String[] args) {
//		StackI st = new StackI();
		Stack_Class sc = new Stack_Class();
		StackI st = new StackI() {

			@Override
			public void push(int item) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int peek() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};

	}

}
