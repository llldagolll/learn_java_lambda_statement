import java.util.ArrayList;
import java.util.Arrays;

public class Consumer {
    public  static  void main(String[] args) {
        java.util.function.Consumer<Integer> method = (n) -> {System.out.println(n);};
        Global.numbers.forEach(method);
    }
}
