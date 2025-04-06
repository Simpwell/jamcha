package vartest;

/**
 * JavaParserのvar変数サポートをテストするためのクラス（より複雑な例）
 */
public class VarTest2 {
    
    /**
     * StringUtilのインスタンスを返すメソッド
     */
    public StringUtil getStringUtil() {
        return new StringUtil();
    }
    
    /**
     * メソッド呼び出しを行うメソッド
     */
    public void callMethod() {
        // メソッドの戻り値をvar変数に代入
        var util = getStringUtil();
        util.toUpperCase("hello");
        
        // メソッドチェーンでvar変数を使用
        var result = util.toUpperCase("world").toLowerCase();
        System.out.println(result);
    }
    
    /**
     * メインメソッド
     */
    public static void main(String[] args) {
        VarTest2 test = new VarTest2();
        test.callMethod();
    }
}