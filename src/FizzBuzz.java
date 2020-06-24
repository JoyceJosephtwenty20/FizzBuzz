public class FizzBuzz {
    public static void main(String[] args) {
        int number = 1;
        int stop = 100;
        for (; number <= 100; number++) {
            if(number % 3 == 0) {
                System.out.println("Fizz");
            }else if (number % 5 ==0){
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }

        }

    }
}

