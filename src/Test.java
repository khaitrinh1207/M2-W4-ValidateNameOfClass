public class Test {
    private static ValidateNameOfClass validateNameOfClass;
    public static final String[] validName = new String[] {"C0318G"};
    public static final String[] invalidName = new String[] {"M0318G", "P0323A"};

    public static void main(String[] args) {
        validateNameOfClass = new ValidateNameOfClass();
        for (String name:
             validName) {
            boolean isvalid = validateNameOfClass.validate(name);
            System.out.println("Name is "+name+" is valid: "+isvalid);
        }
        for (String name:
             invalidName) {
            boolean isvalid = validateNameOfClass.validate(name);
            System.out.println("Name is "+name+" is valid: "+isvalid);
        }
    }

}
