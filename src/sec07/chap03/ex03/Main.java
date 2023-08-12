package sec07.chap03.ex03;

public class Main {
    public static void main(String[] args) {
        var sum1 = add2Num(12, 34.56);
//        var sum2 = add2Num("1" + true); // ⚠️ 불가

    }
    // 상속받는 클래스와 구현하는 인터페이스를 함께 조건으로 나열 가능
    //  💡 T는 Number를 상속한 클래스이어야 한다는 조건
    public static <T extends Number> double add2Num(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    //  ❓ 그냥 Number를 인자 자료형으로 하면 되지 않을까?
}
