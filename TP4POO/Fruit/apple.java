package Fruit;

public class apple extends fruit implements PeelFruit {

         
    private boolean peeled = false;

    public apple() {
        super("toto");
    }

    @Override
    public void taste() {
        System.out.println("la pomme est sucree  "+ getName());
    }

    @Override
    public int getsize() {
        int size = 10;
        System.out.println(size);
        return size;
    }

    @Override
    public boolean hasSeed() {
     
        return false;
    }

    @Override
    public boolean ispeeled() {
       
        return peeled;
    }

    @Override
    public String getSkinType() {
        return "lisse";
    }
    public void eat(){
        System.out.println(getName()+" is good for eating");
    }
}
