public class Main {
    public static void main(String[] args) {
        int sayi1 = 49;
        int sayi2 = 25;
        int sayi3 = 35;

        //soru : if else bloklarını kullanarak hangi sayının büyük olduğunu gösteren program yazınız.

        int enBuyuk = sayi1;

        if (enBuyuk<sayi2){
            enBuyuk = sayi2;
        }

        if (enBuyuk<sayi3){
            enBuyuk = sayi3;
        }

        System.out.println("En büyük = "+enBuyuk);




    }
}