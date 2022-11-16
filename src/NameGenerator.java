import java.util.Random;

public class NameGenerator {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String[] nameList = {"Amal", "Antonio", "Giampiero", "Daniele", "Marco"};
		String[] lastNameList = {"Jomon", "Mendetta", "Fedeli", "Canale", "Cafasso"};
		
		
		for (int i = 0; i < nameList.length && i < lastNameList.length; i++) {
			
			System.out.println(nameList[i] + " " + lastNameList[i]);
		}
		
	}
	
}