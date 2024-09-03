public class tipeDataArray {
    public static void main(String[] args) {
        //array daldah kumpulan dari sebuah data dengan tipe data yang sama
        int[] kumpulanAngka = new int[3];
        kumpulanAngka[0] = 10;
        kumpulanAngka[1] = 10;
        kumpulanAngka[2] = 50;
        System.out.println(kumpulanAngka[2]);

        //Array multi-dimension
        int[][] kumpulanAngkaMultiDimension = new int [3][3];
        kumpulanAngkaMultiDimension[0] = kumpulanAngka;
        System.out.println(kumpulanAngkaMultiDimension[0][2]);
    }
}
