public class ship extends vehicule implements flyable {

    public ship(String name, String type) {
        super(name, type);

    }

    @Override
    public String fly() {
        return this + " and it can fly";
    }

}
