import java.util.*;

public class Main {

	public static void main(String[] args) {

		Album undercurrent = new Album("Undercurrent", 1967, new String[]{"Bill Evans", "Jim Hall"}, new String[]{"Bill Evans", "Jim Hall"});
		System.out.println(undercurrent.getName());
		System.out.println(undercurrent.getYear());
		System.out.println(undercurrent.getArtists());
		

		for (int i = 0; i < undercurrent.getLeader().length; i += 1 ) {
			System.out.println(undercurrent.getLeader()[i]);
		}

	}

}