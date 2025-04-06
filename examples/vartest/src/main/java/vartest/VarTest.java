package vartest;

/**
 * JavaParserのvar変数サポートをテストするためのクラス
 */
public class VarTest {
    
    /**
     * メソッド呼び出しを行うメソッド
     */
    public void callMethod() {
        // 明示的な型宣言
        StringUtil stringUtil = new StringUtil();
        stringUtil.toUpperCase("hello");
        
        // var変数を使用した型推論
        var varStringUtil = new StringUtil();
        varStringUtil.toUpperCase("world");
    }
    
    /**
     * メインメソッド
     */
    public static void main(String[] args) {
        VarTest test = new VarTest();
        test.callMethod();
    }
}