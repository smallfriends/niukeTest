package zhiming.github.niuke.test1207;

public class Short {
    public static void main(String args[]) {
        StringBuffer s = new StringBuffer("Hello");
        //判断条件&&，从左到右执行，如果为false，立马退出判断
        if ((s.append("there").equals("False")) && (s.length() > 5) && s.append("left").equals("right"));
        System.out.println("长度：" + s.length());
        System.out.println("value is " + s);
    }
}
