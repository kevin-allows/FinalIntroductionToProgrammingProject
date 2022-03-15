public class GiveANumber {
    static void ConversionToInt (char c) {
        int i = (int) c;
    }
    static void ConversionToChar (int i){
        char c = (char)i;
    }
    public static void main (String[] args){
        System.out.print("Please input the first character: ");
        char c1 = extra.Console.readChar();
        for (c1=c1; c1 <= 122; c1++){
            System.out.print(c1);
            ConversionToInt(c1);
            for (int s = 97;s <= c1;s++)
                System.out.print(" ");
            ConversionToChar(c1);
        }
    }

}
