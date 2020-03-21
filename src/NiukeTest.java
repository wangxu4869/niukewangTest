public class NiukeTest {

    

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("adasd");
        String str = "wwwww";
        char c1 = str.charAt(0); //
        char c = sb.charAt(0);  //String和StringBuffer都可以调用charAt()以char类型返回指定索引处的元素
        System.out.println(c+"s");  //char 和string可以通过+拼接
        //System.out.println(sb+'x'); //StringBuffer和char不能+连接
        System.out.println(sb.append('s'));//但是StringBuffer可以调append方法添加char等元素
        System.out.println(sb+"y");  //StringBuffer 和 String可以+连接
        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);
        String[] strings = {"Tom", "Jerry", "Andy"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }
}
