public class ders2526 {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int toplam1 = topla(5, 15);
        System.out.println(toplam1);
        int toplam2 = topla2(5,5,5,5,5);
        System.out.println("toplam2 : "+ toplam2);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("silindi");

    }

    public static void guncelle() {
        System.out.println("Guncelle");

    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }

}
