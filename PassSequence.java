/**
 * pictHasher - PassSequence
 *
 * This program generates the password based on the ordering
 * selected by the user. There are 24 possible passwords that
 * can be made from an image. Each password has a unique ordering
 * of Capital letters, Lowercase letters, Symbols, and Numbers
 * Notice the comment next each case. The comment states the ordering
 * for the password. For instance, CLSN means the first digit should
 * be converted into a capital letter, the second digit should be
 * lowercase, the third a symbol, and the fourth should remain as a digit.
 * The ordering also tells me which method from CharacterMapping should
 * I use, based on the number next to the CharacterMapping method.
 * For instance, CLSN means use setCaps1, setLow2, and setSymbol3.
 * If C, L, or S are last in the ordering, like in NCLS,
 * then CharacterMapping methods ending in 1 are used. Once all passwords
 * are generated, a character array containing the passwords is returned.
 *
 * @author Vikram Pasumarti, vpasuma@purdue.edu
 * @version 22 October 2016
 */
public class PassSequence extends CharacterMapping {

    public char[] setOrder(int num, String rgbSum) {
        char rgbSumArray[] = rgbSum.toCharArray();
        int patternCount = 1;
        switch(num) {
            case 1: //CLSN
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        rgbSumArray[i] = setLow2(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol3(temp);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        patternCount = 1;
                    }
                }
                break;

            case 2: //LCSN
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setLow1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        rgbSumArray[i] = setCaps2(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol3(temp);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        patternCount = 1;
                    }
                }
                break;

            case 3: //SCLN
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol1(temp);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        rgbSumArray[i] = setCaps2(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        rgbSumArray[i] = setLow3(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        patternCount = 1;
                    }
                }
                break;

            case 4: //NCLS
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        rgbSumArray[i] = setCaps2(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        rgbSumArray[i] = setLow3(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol1(temp);
                        patternCount = 1;
                    }
                }
                break;

            case 5: //CLNS
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        rgbSumArray[i] = setLow2(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol1(temp);
                        patternCount = 1;
                    }
                }
                break;

            case 6: //LCNS
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setLow1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        rgbSumArray[i] = setCaps2(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol3(temp);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol1(temp);
                        patternCount = 1;
                    }
                }
                break;
            case 7: //SCNL
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol1(temp);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        rgbSumArray[i] = setCaps2(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        rgbSumArray[i] = setLow1(rgbSumArray[i]);
                        patternCount = 1;
                    }
                }
                break;
            case 8: //NCSL
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        rgbSumArray[i] = setCaps2(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol3(temp);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        rgbSumArray[i] = setLow1(rgbSumArray[i]);
                        patternCount = 1;
                    }
                }
                break;
            case 9: //CSLN
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol2(temp);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        rgbSumArray[i] = setLow3(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        patternCount = 1;
                    }
                }
                break;
            case 10: //LSCN
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setLow1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol2(temp);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        rgbSumArray[i] = setCaps3(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        patternCount = 1;
                    }
                }
                break;
            case 11: //SLCN
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        rgbSumArray[i] = setLow2(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol3(temp);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        patternCount = 1;
                    }
                }
                break;
            case 12: //NSCL
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol2(temp);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        rgbSumArray[i] = setCaps3(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        rgbSumArray[i] = setLow1(rgbSumArray[i]);
                        patternCount = 1;
                    }
                }
                break;
            case 13: //CSNL
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol2(temp);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                       patternCount++;
                    }
                    else if(patternCount == 4) {
                        rgbSumArray[i] = setLow1(rgbSumArray[i]);
                        patternCount = 1;
                    }
                }
                break;
            case 14: //LSNC
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setLow1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol2(temp);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                    patternCount++;
                    }
                    else if(patternCount == 4) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount = 1;
                    }
                }
                break;
            case 15: //SLNC
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        rgbSumArray[i] = setLow2(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol3(temp);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        patternCount = 1;
                    }
                }
                break;
            case 16: //NSLC
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol2(temp);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        rgbSumArray[i] = setLow3(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount = 1;
                    }
                }
                break;
            case 17: //CNLS
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        rgbSumArray[i] = setLow3(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol1(temp);
                        patternCount = 1;
                    }
                }
                break;
            case 18: //LNCS
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setLow1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        rgbSumArray[i] = setCaps3(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol1(temp);
                        patternCount = 1;
                    }
                }
                break;
            case 19: //SNLC
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol1(temp);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        rgbSumArray[i] = setLow3(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount = 1;
                    }
                }
                break;
            case 20: //NLCS
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        rgbSumArray[i] = setLow2(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol1(temp);
                        patternCount = 1;
                    }
                }
                break;
            case 21: //CNSL
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol3(temp);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        rgbSumArray[i] = setLow1(rgbSumArray[i]);
                        patternCount = 1;
                    }
                }
                break;
            case 22: //LNSC
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        rgbSumArray[i] = setLow1(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol3(temp);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount = 1;
                    }
                }
                break;
            case 23: //SNCL
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol1(temp);
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        rgbSumArray[i] = setCaps3(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        rgbSumArray[i] = setLow1(rgbSumArray[i]);
                        patternCount = 1;
                    }
                }
                break;
            case 24: //NLSC
                for (int i = 0; i < rgbSum.length(); i++) {
                    if (patternCount == 1) {
                        patternCount++;
                    }
                    else if(patternCount == 2) {
                        rgbSumArray[i] = setLow2(rgbSumArray[i]);
                        patternCount++;
                    }
                    else if(patternCount == 3) {
                        int temp = Character.digit(rgbSumArray[i],10);
                        rgbSumArray[i] = setSymbol3(temp);
                        patternCount++;
                    }
                    else if(patternCount == 4) {
                        rgbSumArray[i] = setCaps1(rgbSumArray[i]);
                        patternCount = 1;
                    }
                }
                break;
        }
        return rgbSumArray;
    }
}
