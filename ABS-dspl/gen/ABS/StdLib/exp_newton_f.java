package ABS.StdLib;
// abs/lang/abslang.abs:125:0: 
public final class exp_newton_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private exp_newton_f() { }
    public static org.abs_models.backend.java.lib.types.ABSRational apply(org.abs_models.backend.java.lib.types.ABSRational x, org.abs_models.backend.java.lib.types.ABSRational epsilon) {
        return (org.abs_models.backend.java.lib.expr.BinOp.lt(x,org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L)).toBoolean() ? org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L).divide(ABS.StdLib.exp_newton_helper_f.apply(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L).subtract(x).add(x.multiply(x).divide(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(2L))), x.negate(), org.abs_models.backend.java.lib.types.ABSInteger.fromLong(3L), x.multiply(x), org.abs_models.backend.java.lib.types.ABSInteger.fromLong(2L), epsilon)) : ABS.StdLib.exp_newton_helper_f.apply(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L).add(x).add(x.multiply(x).divide(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(2L))), x, org.abs_models.backend.java.lib.types.ABSInteger.fromLong(3L), x.multiply(x), org.abs_models.backend.java.lib.types.ABSInteger.fromLong(2L), epsilon));
    }
}
