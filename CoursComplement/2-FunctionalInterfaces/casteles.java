/**
 * casteles
 */
public class casteles extends building implements flyable {

    public casteles(String name, String type) {
        super(name, type);
    }

    @Override
    public String decorate() {
        return " we implement casteles decoration";
    }

    @Override
    public String colorate() {

        return " colorating casteles";
    }

    @Override
    public String fly() {
        return this + " and it can fly";
    }

}