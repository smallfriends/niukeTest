package zhiming.github.niuke.test1207;

public class Short {
    public static void main(String args[]) {
        StringBuffer s = new StringBuffer("Hello");
        if ((s.append("there").equals("False")) && (s.length() > 5));
        System.out.println("长度：" + s.length());
        System.out.println("value is " + s);
    }
}
