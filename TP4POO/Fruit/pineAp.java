package Fruit;

public class pineAp extends fruit implements PeelFruit {

    public pineAp() {
        super("PineApple");
       
    }

    @Override
    public void taste() {
        System.out.println("ammere "+ getName());

    }

    @Override
    public int getsize() {
        return 20;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }

    @Override
    public boolean ispeeled() {
        
        return true;
    }

    @Override
    public String getSkinType() {
        // TODO Auto-generated method stub
        return "pas lisse";
    }
    
    public void eat(){
        System.out.println(getName()+" is good for eating");
    }
    
}
