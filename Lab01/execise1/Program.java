public class Program{
	public static void main(String [] args){
		if(args.length != 3) System.out.println("Invalid expression");
		else{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[2]);
			switch(args[1]){
				case "+":
					System.out.println(a+b);
					break;
				case "-":
					System.out.println(a-b);
					break;
				case "x":
					System.out.println(a*b);
					break;
				case "^":
					System.out.println(Math.pow(a,b));
					break;
				case "/":
					System.out.println((float)a/b);
					break;
				default:
					System.out.println("Unsupported operator");

			}
		}	
	}
}
