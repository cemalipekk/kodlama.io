public class ders20 {
    public static void main(String[] args) {
        char harf= 'C';


        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");
        }

    }
}
