package day10_shorthand_operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++; // tradition way
        i++;// shorthand operator
        ++i;// most common postincrement
        ++i;// another preincrement
        System.out.println("i = " + i);// will print 6
        
        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        //increase linesOfCOde by 1, 4 different ways that we learnt today
        linesOfCode = linesOfCode + 1;
        linesOfCode += 1;
        linesOfCode++;
        ++linesOfCode;
        //++linesOfCode++; Error
        System.out.println("linesOfCode = " + linesOfCode);

        //type 4 different ways of decreasing / decrement by 1

        linesOfCode = linesOfCode-1;
        linesOfCode -= 1;
        linesOfCode --;
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        
        char letter = 'a'; // will give you next character
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        
        letter--;
        --letter;
        --letter;
        letter--;
        //or //  letter--; --letter; --letter; letter--;
        System.out.println("letter = " + letter);




    }
}
