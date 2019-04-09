package package2;

public class Test {
    //这是单行注释的颜色样式设置
    /*
    hhhhh
     */
    public static void main(String[] args) {
        System.out.println("helloworld");
        System.out.println();
        String a[]=new String[]{"aa","bb","cc"};
        for (String s : a) {
            System.out.println("s = " + s);
        }
        System.out.println("---");
        for (int i = 0; i < a.length; i++) {
            String s = a[i];
            System.out.println("s = " + s);
        }
    }
    public void Test(){

    }
    
}
