package functions;

// if we do not annotate the kotlin with @file:JvmName("MinMax")
//import static functions.FunctionExpressionKt.max;

import static functions.MathUtil.max;

public class FunctionExpressionTest {
    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(MathUtil.min(1, 2));
    }
}
