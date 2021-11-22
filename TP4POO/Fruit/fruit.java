package Fruit;



public abstract class fruit {
   private String name;
   
    public fruit(String name) {
        this.name=name;
    }
    

    public abstract void taste();
    public abstract int getsize();
    public abstract boolean hasSeed();

    public String getName(){
        return name;
    }

    public void eat(){
        System.out.println(" is good for eating");
    }
    
    
}