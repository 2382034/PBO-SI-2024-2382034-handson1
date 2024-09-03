public class konversitipeDataNumber {
    public static void main(String[] args) {
        //Widening
        short tipeDataShort = 10;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;

        //Narrowing
        int tipeDataInteger2 = 10;
        byte tipeDataByte = (byte) tipeDataInteger2;

        //Number Overflow
        int tipeDataInteger = 128;
        short tipedataShortConverted = (short) tipeDataInteger;
        System.out.println(tipedataShortConverted);
    }
}
