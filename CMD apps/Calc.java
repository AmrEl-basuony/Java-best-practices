class Calc{
	public static void operate(String one,String operation,String two){
	    float numOne = Float.parseFloat(one);
 		float numTwo = Float.parseFloat(two);
		switch(operation){
		 	case "+":
		 		System.out.println(numOne+numTwo);
		 		break;
		 	case "-":
		 		System.out.println(numOne-numTwo);
		 		break;
		 	case "x":
		 		System.out.println(numOne*numTwo);
		 		break;
		 	case "/":
		 		if (numTwo==0) {
		 			System.out.println("you can't devide by 0.");
		 			break;
		 		}
		 		System.out.println(numOne/numTwo);
		 		break;
		 	default:
		 		System.out.println("please use + , - , x or / operations only.");
		 }
	}

	public static void main(String[] args) {
		if (args.length==3) {
			 boolean error = false;
			 String one = args[0];
			 String operation = args[1];
			 String two = args[2];
			try{
	 			Float numOne = Float.parseFloat(one);
	 		    Float numTwo = Float.parseFloat(two);
			}
			catch(NumberFormatException ex){
				System.out.println("your numbers are not numbers i guess.");
				error = true;
			}
			if(error==false){
				operate(one,operation,two);
			}
		}else if(args.length<3){
			System.out.println("you lack input.");
		}else{
			System.out.println("you have entered more than 3 args.");
		}
	}
}