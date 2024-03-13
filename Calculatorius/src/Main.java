import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //        System.out.println("Enter operation:");
        //        String operator = scanner.next();
        while(true) {
            String operator = write(scanner,"Enter an operator or 'quit' to exit");
            if (operator.equals("quit")) break;



            int a = read(scanner, "Enter a number:");
            int b = read(scanner, "Enter a second number:");



            Integer result = null;
            Boolean com = null;
            switch (operator) {
                case "+" -> result = a + b;
                case "-" -> result = a - b;
                case "*" -> result = a * b;
                case "/" -> result = a / b;
                case "%" -> result = a % b;

                case ">" -> com = a > b;
                case ">=" -> com = a >= b;
                case "<" -> com = a < b;
                case "<=" -> com = a <= b;
                case "!=" -> com = a != b;

                default -> {
                    System.err.println("Operator doesnt exist: " + operator);
                    return;
                }
            }
            if (com != null) {
                System.out.println("Results: ");
                System.out.println(com);
                return;
            }
            System.out.println("Results");
            System.out.println(result);
        }
    }

    private static int read(Scanner s, String prompt){
        System.out.println(prompt);
        return s.nextInt();
    }
    private static String write(Scanner scanner, String prompt){
        System.out.println(prompt);
        return scanner.next();
    }
}
//        public int sumAll(int... nums) { //var-args to let the caller pass an arbitrary number of int
//
//            int sum = 0; //start with 0
//
//            for(int n : nums) { //this won't execute if no argument is passed
//                sum += n; // this will repeat for all the arguments
//            }
//            return sum; //return the sum



//        char operator;
//        Double number1, number2, result;
//
//        // create an object of Scanner class
//        Scanner input = new Scanner(System.in);
//
//        // ask users to enter operator
//        System.out.println("Choose an operator: +, -, *, or /");
//        operator = input.next().charAt(0);
//
//        // ask users to enter numbers
//        System.out.println("Enter first number");
//        number1 = input.nextDouble();
//
//        System.out.println("Enter second number");
//        number2 = input.nextDouble();
//
//        switch (operator) {
//
//            // performs addition between numbers
//            case '+':
//                result = number1 + number2;
//                System.out.println(number1 + " + " + number2 + " = " + result);
//                break;
//
//            // performs subtraction between numbers
//            case '-':
//                result = number1 - number2;
//                System.out.println(number1 + " - " + number2 + " = " + result);
//                break;
//
//            // performs multiplication between numbers
//            case '*':
//                result = number1 * number2;
//                System.out.println(number1 + " * " + number2 + " = " + result);
//                break;
//
//            // performs division between numbers
//            case '/':
//                result = number1 / number2;
//                System.out.println(number1 + " / " + number2 + " = " + result);
//                break;
//
//            default:
//                System.out.println("Invalid operator!");
//                break;
//        }
//
//        input.close();
//    }
//}


//        if(operator. equals("+")){
//            System.out.println(a+b);
//