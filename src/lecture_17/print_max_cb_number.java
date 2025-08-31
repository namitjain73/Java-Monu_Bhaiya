package lecture_17;
 public class print_max_cb_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "127";
		PrintSubString(s);

	}
	public static void PrintSubString(String s) {
		int c = 0;
		boolean[] visited = new boolean[s.length()];
		for(int len = 1 ; len <= s.length() ; len++){
			for(int j = len ; j <= s.length(); j++) {
				int i = j - len;
				Long num = Long.parseLong(s.substring(i,j));
				if(isCBnumber(num) && isvisited(visited,i,j)) {
					s_true(visited,i,j);
					c++;
					
				}
			}
		}
		System.out.println(c);
	}
	public static boolean isvisited(boolean[] visited , int i , int j) {
		for(int k = i ; k < j ; k++) {
			if(visited[k] == true) {
				return false;
			}
		}
		return true;
	}
	public static void s_true(boolean[] visited,int i , int j) {
		for(int k = i ; k < j ; k++) {
			visited[k] = true;
		}
		
	}
	public static boolean isCBnumber(Long num) {
		if(num ==0 || num == 1) {
			return false;
		}
		int[] arr = {2,3,5,7,11,13,17,19,23,29};
		for(int i = 0 ; i < arr.length ;i++) {
			if(num == arr[i]) {
				return  true;
			}
		}
		
		for(int i = 0 ; i < arr.length ;i++) {
			if(num%arr[i]==0) {
				return false;
			}
		}
		return true;
	}

}
