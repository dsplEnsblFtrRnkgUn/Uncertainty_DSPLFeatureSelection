package ABS.StdLib;
// abs/lang/abslang.abs:94:0: 
public final class max_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private max_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>A apply(A a, A b) {
        return (org.abs_models.backend.java.lib.expr.BinOp.gt(a,b).toBoolean() ? a : b);
    }
}
