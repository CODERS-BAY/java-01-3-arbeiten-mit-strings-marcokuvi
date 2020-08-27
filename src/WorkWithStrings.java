public class WorkWithStrings {
    public static void main(String[] args) {
        String helloWrld = " Hello World ";
        String repeatString;
        System.out.println(helloWrld);
        System.out.println(helloWrld.toUpperCase());
        System.out.println(helloWrld.toLowerCase());
        helloWrld = helloWrld.replace("World", "Codersbay");
        System.out.println(helloWrld);
        helloWrld = helloWrld.replaceAll("^\\s+", "");
        System.out.println(helloWrld);
        repeatString = helloWrld + "\n";
        System.out.println(repeatString.repeat(15));




    }
}
