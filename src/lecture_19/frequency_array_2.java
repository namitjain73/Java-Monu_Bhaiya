package lecture_19;

public class frequency_array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rcdfvgbnjm,./;:?><`~!@#$%^&*()_+/*-+.kopl6636!@#$%^&*()_!@#$%^&*(){}:<>? fdghgjgfds";
		char[] ch = s.toCharArray();
		int [] arr = new int[256];
		for(int i = 0 ; i < ch.length ;i ++) {
			arr[ch[i]] ++;
		}
		for(int i = 0 ; i < 256 ;i ++) {
			System.out.print(arr[i]);
		}
		
		

	}

}
