public class Ready01 {
  public static void main(String[] args) {
      System.out.println("Hello World!");
  }
}

public class Variable01 {

    public static void main(String[] args) {
        int num1;  // int型の変数num1を宣言
        String str1;  // String型の変数str1を宣言
        num1 = 10;  // num1を初期化
        str1 = "Hello World!";  //str1を初期化
        System.out.println(num1);
        System.out.println(str1);

        num1 = 20;  // num1に20を再代入
        System.out.println(num1);

        int num2 = 30;  // int型の変数num2を宣言と同時に初期化
        System.out.println(num2);
    }
}

public class Chapter04 {
    public static void main(String[] args) {
        final int LUCKY_NUMBER = 7;
        String str = "ウェブ　キャンプ之助";
        System.out.println(str);
        str = "少年よ大志を抱け";
        System.out.println(str);
        System.out.println(LUCKY_NUMBER);
    }
}