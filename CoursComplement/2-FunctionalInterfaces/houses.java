public class houses extends building {
    String str;

    public houses(String name, String type) {
        super(name, type);
        str = " this is a kind of houses";
    }

    @Override
    public String toString() {
        return super.toString() + str;
    }

    @Override
    public String decorate() {
        return " we implement houses decoracting ";
    }

    @Override
    public String colorate() {

        return " colorating houses";
    }

}
