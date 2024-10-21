public class App {
    public static void main(String[] args) throws Exception { 

        int input;

        if(args.length > 0){
            
            try{
        
                input = (Integer.parseInt(args[0]));
                
                if(input < 0){

                    System.out.println("Input must be a non-negative integer.");
                }
                else{
                    System.out.println(FibonacciSequence(input));
                }

            }catch(NumberFormatException e){
                
                System.out.println("Argument must be a non-negative integer");
                System.exit(1);
            }
        }
    }

    public static int FibonacciSequence(int output){

        int[] fib = new int[output + 1];
        fib[0] = 0;

        if(output > 0){
            fib[1] = 1;
        }
        
        for(int i = 2; i <= output; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
    
        return fib[output];
    }
}
