package Fruit;

public class Teste {
    public static void main(String[] args) {
        apple ap=new apple();
        ap.taste();
        ap.getsize();
        pineAp pen = new pineAp();
        pen.taste();
        if (ap instanceof PeelFruit) {
            System.out.println(ap.ispeeled());
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        fruit FuitarrayObj[] = new fruit[2];
        FuitarrayObj[0]= new apple();
        FuitarrayObj[1]= new pineAp();
        
        for (int i = 0; i < FuitarrayObj.length; i++) {
            FuitarrayObj[i].eat();
        }
    }
}
 