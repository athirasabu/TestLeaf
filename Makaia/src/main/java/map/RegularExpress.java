package map;

public class RegularExpress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="Syntel(5034680)";
		//String pattern="\\D";
		String replaceAll=text.replaceAll("\\d", "");
		String replaceAll1=replaceAll.replaceAll("\\W","");
		System.out.println(replaceAll1);
		
		
		
		
		//String replaceAll1=replaceAll.replaceAll("\\w", "");
		//System.out.println(replaceAll1);

	}

}
