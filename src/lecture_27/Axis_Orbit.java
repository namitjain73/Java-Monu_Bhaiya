 package lecture_27;

public class Axis_Orbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nititn";
		System.out.println(count_palindromic(s));

	}
	
	public static int count_palindromic(String s) {
		int odd = 0;
		int max = 0;
		String s2 = "";
		for(int axis = 0 ; axis < s.length() ; axis++) {
			for(int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length() ; orbit++) {
				if(s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
					break;
				}
				odd++;
				if(max < odd) {
					max = odd;
					
					s2 = s.substring((int)(axis - orbit) , (int)(axis + orbit));
					System.out.println(s2);
				}
			}
		}
//		even
		int even = 0;
		for(double axis = 0.5 ; axis < s.length() ; axis++) {
			for(double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length() ; orbit++) {
				if(s.charAt((int)(axis - orbit)) != s.charAt((int)(axis + orbit))) {
					break;
				}
				even++;
				if(max < even) {
					max = even;
					
					s2 = s.substring((int)(axis - orbit) , (int)(axis + orbit));
					System.out.println(s2);
				}
			}
		}
		System.out.println(s2);
		return odd+even;
		
	}
	

}
