import java.util.Scanner;

class Main {
	public static boolean isPrime(int n){
    for (int i = 3; i < (int)Math.sqrt(n) + 1; i+=2) {
      if (n % i == 0) {
        return false;
      }
    }
		if(n%2 == 0){
			return false;
		}
		if (n == 2){
      return true;
    }
		return true;
	}
	public static int returnPrime(int n){
		int counter = 1; int i = 3;
		if(n == 1) return 2;
		while(true){
			if(isPrime(i)) counter++;
			if(counter == n) return i;
			i += 2;
		}
	}
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("This program will return the nth prime, starting from 2.");
		String input = " ";
		while(true){
			System.out.println("Enter a value for [n] or [d]one:");
      try{
        input = scan.nextLine();
        if (input.toLowerCase().trim().equals("d")){
          break;
        }
        int num = Integer.parseInt(input);
        System.out.println("Nth prime: " + returnPrime(num));
      }catch(Exception e){
        System.out.println("Invalid input.");
      }
		}
  }
}
