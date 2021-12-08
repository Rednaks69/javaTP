package Exe4TP5;

public class TesteFact {
public static void main(String[] args) {
    try {
        int n = Integer.parseInt(args[0]);
        if (n==0) {
            System.out.println("Le factorielle de "+n+"est egal a !");
            throw new NegatifNumberExeption();
        }else{
            int f = 1;
            for (int i = 2; i < n; i++) {
               f=f*i;
            }
            System.out.println("le factorielle de "+n+"est "+f);
        }
    } catch (NumberFormatException e) {
      System.out.println(" lentrer n nest pas entier ");
    }catch(NegatifNumberExeption ex){
        System.out.println(ex.getMessage());
    }catch(ArrayIndexOutOfBoundsException ex){
        System.out.println(ex.getMessage());
    }
}    
}
