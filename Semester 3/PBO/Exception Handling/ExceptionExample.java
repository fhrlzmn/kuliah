public class ExceptionExample {
    public static void main(String[] args) {
        try {
            String number = "28";
            String number1 = "tr282";
            int angka = Integer.parseInt(number);
            int angka1 =Integer.parseInt(number1);

            System.out.println(angka);
            System.out.println(angka1);
        } catch (Exception e) {
            // jika yang di parse bukan sebuah angka, maka error
            System.out.println("Tidak dapat parsing String yang isinya bukan Angka");
        } finally {
            System.out.println("Program Selesai");
        }
    }
}
