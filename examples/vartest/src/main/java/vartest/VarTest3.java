package vartest;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaParserのvar変数サポートをテストするためのクラス（より複雑な例）
 */
public class VarTest3 {
    
    /**
     * ジェネリックメソッド
     */
    public <T> List<T> createList(T item) {
        List<T> list = new ArrayList<>();
        list.add(item);
        return list;
    }
    
    /**
     * メソッド呼び出しを行うメソッド
     */
    public void callMethod() {
        // ジェネリックメソッドの戻り値をvar変数に代入
        var stringList = createList("hello");
        stringList.add("world");
        
        // 型推論が複雑なケース
        var result = stringList.stream().map(String::toUpperCase).toList();
        System.out.println(result);
    }
    
    /**
     * メインメソッド
     */
    public static void main(String[] args) {
        VarTest3 test = new VarTest3();
        test.callMethod();
    }
}