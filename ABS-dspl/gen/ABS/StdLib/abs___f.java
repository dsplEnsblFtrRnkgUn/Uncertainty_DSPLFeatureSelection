package ABS.StdLib;
// abs/lang/abslang.abs:97:0: 
public final class abs___f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private abs___f() { }
    public static org.abs_models.backend.java.lib.types.ABSRational apply(org.abs_models.backend.java.lib.types.ABSRational x) {
        return (org.abs_models.backend.java.lib.expr.BinOp.gt(x,org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L)).toBoolean() ? x : x.negate());
    }
}
