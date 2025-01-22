package beginner;

public class Loops {
    public static void main(String[] args) {
//        for loop
        for (int number = 1; number <= 5; number++) { // (initialize variable; condition; update)
            System.out.println(number);
        }

//        array for loop
        int num[] = {1,2,3,4,5,6,7,8,9,10};

        for (int index = 0; index < num.length; index++) {
            System.out.println(num[index]);
        }
    }
}
//      While loop
class While_loop{
    public static void main(String[] args) {
        int number = 5;         // initialize
        int multiplier = 1;

        while(multiplier<=10) {     // condition
            System.out.printf("%d X %d = %d\n", number, multiplier, number*multiplier);
            multiplier++;       // update
        }
    }
}


//      Do... While loop

class Do_while{
    public static void main(String[] args) {
        int numb = 5;
        int multiplier = 1;

        do{
            System.out.printf("%d X %d = %d\n", numb, multiplier, numb*multiplier);

            multiplier++;
        } while (multiplier<=10);
    }
}
