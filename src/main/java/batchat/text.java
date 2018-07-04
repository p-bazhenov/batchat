package batchat;

public class text {

	public static void main(String[] args) {
		java.util.Date uDate = new java.util.Date();
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		
		
		System.out.println(uDate);
		System.out.println(sDate);
	}
	
}
