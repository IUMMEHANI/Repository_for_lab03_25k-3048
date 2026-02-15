package Task02;

public class Mobile {
    String BrandName;
    String model;
    int price;
    Mobile () {
        this.BrandName = "Samsung";
        this.model = "S7Ultra";
        this.price = 30000;
    }
    Mobile (String brandName , String Model , int Price){
        this.BrandName = brandName;
        this.model = Model;
        this.price = Price;
    }
    public void show(){
       System.out.println("Brand name: " + BrandName + " Model " + model + " Price " + price);
    }
}
class MAIN {
    public static void main (String[] args){
        Mobile M1 = new Mobile();
        Mobile M2 = new Mobile();
        Mobile M3 = new Mobile("Huawei", "S22ultra" , 25000);
        M1.show();
        M2.show();;
        M3.show();
    }
}