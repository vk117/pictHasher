/**
 * pictHasher - CharacterMapping
 *
 * This program contains all of the methods that
 * assign a character to a digit. These methods will
 * be called when the password is being generated
 * in the PassSequence program. The number next
 * to each method name is to make it easy for me
 * to put the methods in whatever order is needed
 * in the PassSequence program.
 *
 * @author Vikram Pasumarti, vpasuma@purdue.edu
 * @version 23 October 2016
 */

public class CharacterMapping {

    public char setCaps1(char digit) {
        char temp = ' ';
        switch(digit) {
            case '0':
                temp = 'O';
                break;
            case '1':
                temp = 'A';
                break;
            case '2':
                temp = 'B';
                break;
            case '3':
                temp = 'C';
                break;
            case '4':
                temp = 'D';
                break;
            case '5':
                temp = 'E';
                break;
            case '6':
                temp = 'F';
                break;
            case '7':
                temp = 'G';
                break;
            case '8':
                temp = 'H';
                break;
            case '9':
                temp = 'I';
                break;
        }
        return temp;
    }
    public char setCaps2(int digit) {
        char temp = ' ';
        switch (digit) {
            case '0':
                temp = 'O';
                break;
            case '1':
                temp = 'J';
                break;
            case '2':
                temp = 'K';
                break;
            case '3':
                temp = 'L';
                break;
            case '4':
                temp = 'M';
                break;
            case '5':
                temp = 'N';
                break;
            case '6':
                temp = 'O';
                break;
            case '7':
                temp = 'P';
                break;
            case '8':
                temp = 'Q';
                break;
            case '9':
                temp = 'R';
                break;
        }
        return temp;
    }
    public char setCaps3(int digit) {
        char temp = ' ';
        switch (digit) {
            case '0':
                temp = 'O';
                break;
            case '1':
                temp = 'S';
                break;
            case '2':
                temp = 'T';
                break;
            case '3':
                temp = 'U';
                break;
            case '4':
                temp = 'V';
                break;
            case '5':
                temp = 'W';
                break;
            case '6':
                temp = 'X';
                break;
            case '7':
                temp = 'Y';
                break;
            case '8':
                temp = 'Z';
                break;
            case '9':
                temp = '9';
                break;
        }
        return temp;
    }
    public char setLow1(char digit) {
        char temp = ' ';
        switch (digit) {
            case '0':
                temp = 'o';
                break;
            case '1':
                temp = 'a';
                break;
            case '2':
                temp = 'b';
                break;
            case '3':
                temp = 'c';
                break;
            case '4':
                temp = 'd';
                break;
            case '5':
                temp = 'e';
                break;
            case '6':
                temp = 'f';
                break;
            case '7':
                temp = 'g';
                break;
            case '8':
                temp = 'h';
                break;
            case '9':
                temp = 'i';
                break;
        }
        return temp;
    }
    public char setLow2(char digit) {
        char temp = ' ';
        switch (digit) {
            case '0':
                temp = 'o';
                break;
            case '1':
                temp = 'j';
                break;
            case '2':
                temp = 'k';
                break;
            case '3':
                temp = 'l';
                break;
            case '4':
                temp = 'm';
                break;
            case '5':
                temp = 'n';
                break;
            case '6':
                temp = 'o';
                break;
            case '7':
                temp = 'p';
                break;
            case '8':
                temp = 'q';
                break;
            case '9':
                temp = 'r';
                break;
        }
        return temp;
    }
    public char setLow3(char digit) {
        char temp = ' ';
        switch (digit) {
            case '0':
                temp = 'o';
                break;
            case '1':
                temp = 's';
                break;
            case '2':
                temp = 't';
                break;
            case '3':
                temp = 'u';
                break;
            case '4':
                temp = 'v';
                break;
            case '5':
                temp = 'w';
                break;
            case '6':
                temp = 'x';
                break;
            case '7':
                temp = 'y';
                break;
            case '8':
                temp = 'z';
                break;
            case '9':
                temp = '1';
                break;
        }
        return temp;
    }
    public char setSymbol1(int digit) {
        char temp = ' ';
        if (digit >= 0 && digit <= 4) {
            return '@';
        }
        else if(digit >= 5 && digit <= 9 ) {
            return '#';
        }
        return temp;
    }
    public char setSymbol2(int digit) {
        char temp = ' ';
        if (digit >= 0 && digit <= 4) {
            return '%';
        }
        else if (digit >= 5 && digit <= 9 ) {
            return '$';
        }
        return temp;
    }
    public char setSymbol3(int digit) {
        char temp = ' ';
        if (digit >= 0 && digit <= 4) {
            return '$';
        }
        else if (digit >= 5 && digit <= 9 ) {
            return '_';
        }
        return temp;
    }

}
