package harry.corejava.basics;

public class Cwh_14_StringMethods {
    public static void main(String[] args) {
        String name="Harry";//as strings as immutable, so we cannot modify the original
        int value=name.length();
        System.out.println(value);
        //name=name.toLowerCase(); will give error as we are modifying the original string
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String unTrimmedString = "  harry  ";
        System.out.println(unTrimmedString);
        System.out.println(unTrimmedString.trim());
        System.out.println(name.substring(1));
        System.out.println(name.substring(0,4));
        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rry","ier"));
        System.out.println(name.replace("r","ier"));
        System.out.println(name.endsWith("harr"));
        System.out.println(name.startsWith("Harr"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("ry"));
        String text="To Hi To world";
        text=text.replace(" ","_");
        System.out.println(text);

        //to identify the double and triple spaces
        String myString="this is  harry   codewithharry";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        System.out.println(myString.indexOf("    "));
    }
}
