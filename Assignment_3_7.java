package Assignment_3;

public class Assignment_3_7 {

	public static void main(String[] args) {
		String [] s1={"ABX","ac","acd","mahe"};
		String sb1="";
		for(int i=0;i<s1.length;i++) {
			
			
			StringBuffer sb =new StringBuffer(s1[i]);
			
			if(sb.length()>=3) {
				
				 sb1+=sb.substring(sb.length()-1)+'$';
				
			}else {
				
			}
			
			
		}String k=sb1.substring(0,sb1.length()-1);
		System.out.print(k);
		
		
		
		
		

	}

}
