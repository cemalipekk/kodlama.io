public class ProductValidator {
    public ProductValidator(){
        System.out.println("Yapıcı blok calisti");
    }
    public static boolean isValid(Product product){
        if (product.price> 0 && product.name.isEmpty()){
            return true;
        }else {
            return false;
        }

    }
    public void bisey(){

    }
    public class BaskaBirClas{
        public  static void Sil(){

        }
    }
}
