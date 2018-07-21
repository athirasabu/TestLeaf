package map;

public class SingleWhiteSpace {
	
	public static void main(String[] args) {
		String word="Athira  is  from  kochi";
		String replaceAll = word.replaceAll("\\s{2,}", " ");
		System.out.println(replaceAll);
		
	}

}
