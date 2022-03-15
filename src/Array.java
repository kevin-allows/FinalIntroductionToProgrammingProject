public class Array {
    public static void main (String[] args){
        char Field[]=new char[10];
        boolean repeatMe;
        for (int i = 0; i <= 9; i++) Field[i] = ' ';
        do{
            repeatMe=false;
            int randomNumber = (int)(Math.random()*10);
            if (Field[randomNumber]=='X')
                Field[randomNumber]='Y';
            else if (Field[randomNumber]==' ')
                Field[randomNumber]='X';
            System.out.print(Field[randomNumber] + " ");
            for (int i=0;i<=9;i++){
                if (Field[i]!='Y')
                    repeatMe=true;
            }
        } while (repeatMe);
        System.out.println();
        System.out.println("The final array:");
        for (int j=0;j<=9;j++) System.out.print(Field[j] + " ");
        System.out.println();
    }
}

/* NON-Compulsory HOMEWORK:

        Please write the following program:

        The program creates a character array[10] and fills with spaces.
        Then the program displays the array.
        Then the program finds a random position. If it is empty (space), the program puts an "X"
        to that position.
        If there is already an 'X' there, then the program replaces with an 'Y'.
        If there is already an 'Y' there, the program finds another random number (position), again and again,
        until an empty space (position) or an 'X' will not be found. Then the program puts there
        an 'X' (if it is empty) or an 'Y' (if 'X'), etc.
        Then the program displays the array.
        Then again and again, until every element will be filled with 'Y' ("YYYYYYYYYY" will be displayed).
        Then the program terminates.

        while (Field[i]='Y');
*/