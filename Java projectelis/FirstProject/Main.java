import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


//		while(!name.equals("quit")){
//			name = scanner.next();
//			System.out.println("Hello, " + name);
////
//		Person p
//
//		Path file = Paths.get("file.txt");
//
//
//		try {
//			List<String> lines = Files.readAllLines(file);
//			System.out.println(lines);
//			Files.writeString(file, "Hello World!");
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//
//
//	}
//	public Person(String data) {
//		String[] fields = data.split("___");
//
//		this.name = fields[0];
//		this.age = Indeger.parseInt(fields[1])
//	}
//
//	@Override
//	public String toString() {
//		return "Main{}";
//	}
//}


		Scanner scanner = new Scanner(System.in);
		int answer = new Random().nextInt(101);
		System.out.println("Guess a number I am thinking of:");


		int guess;
		while (true) {

			guess = scanner.nextInt();
			if (guess == answer) {
				System.out.println("Correct");
				break;
			} else if (guess > answer) {
				System.out.println("LESS");
			} else if (guess < answer) {
				System.out.println("MORE");
			}

		}
	}
}
//
////		boolean[] invert = new boolean[] {true, true, false};
////		for(boolean e:invert){
////			boolean a = invert(e);
////			System.out.println(a);
////		}
//	}
//	private static boolean invert(boolean yep) {
//		return !yep;
//	}
//}
//
//

//		int[] list = new int[4];
//		list[0] = 3;
//		list[1] = 4;
//		list[2] = 5;
//		list[3] = 6;
//		System.out.println(list[2]);
//




//		int a = 5;
//		int b = 10;
//		System.out.println(a/b);







//		String message = name.equalsIgnoreCase("Povilas") ? "Hello, " + name : "You are not Welcome!";
//		System.out.println(message);


//		if(name..equalsIgnoreCase("Povilas")) {
//			System.out.println("Hello, " + name.trim());
//		} else {
//			System.out.println("You are not Welcome");
//		}

//  private static int[] reverse(int[] nums) {
//	int[] reversed = new int[nums.length];
//	for(int i = nums.length - 1; i >= 0; i--) {
//		reversed[nums.length - i - 1] = nums[i];
//	}
//	return reversed;
// }

