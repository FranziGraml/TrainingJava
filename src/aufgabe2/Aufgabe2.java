package aufgabe2;

public class Aufgabe2 {


    public static void main(String[] args) {

        int i = 0;
        int j = 7;
        int k = 13;


// Snippet 1
        if (i > 0 || j > 5) { // false or true = true
            k = 10;
        }
// -> i= 0, j= 7, k= 10

// Snippet 2
        if (i > 0 && j > 5) { // false und true = false
            k = 10;
        }
// -> i= 0, j= 7, k= 13

// Snippet 3
        if ((i > 0 && j > 5) || k < 15) { // (false und true) or true = false or true = true
            k = 10;
        }
// -> i= 0, j= 7, k= 10

// Snippet 4
        if ((i > 0 || j > 5) && k > 15) { // (false or true) and false = true and false = false
            k = 10;
        }
// -> i= 0, j= 7, k= 13

// Snippet 5
        if (i == 0 & j++ < 5) { // true und false
            k = 10;
        }
// -> i= 0, j= 8, k= 13

// Snippet 6
        if (i == 0 && j++ < 5) {
            k = 10;
        }
// -> i= 0, j= 8, k= 13

// Snippet 7
        if (i != 0 && j++ < 5) {
            k = 10;
        }
// -> i= 0, j= 7, k= 13

// Snippet 8
        if (i != 0 & j++ < 5) {
            k = 10;
        }
// -> i= 0, j= 8, k= 13

        int x = 3;
        if( x++ == 4){
           System.out.println("x++ == 4 " );
        }
        System.out.println("x " + x);

        int y = 3;
        if(++y ==4){
            System.out.println("++y == 4 ");
        }
        System.out.println("y " + y);
        System.out.println(0b101); //5
        System.out.println(0b010); //2
        System.out.println(0b111); //7
        System.out.println(2 | 5); //7
        System.out.println(2 & 5);

    }
}