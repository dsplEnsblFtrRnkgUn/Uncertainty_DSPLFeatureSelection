package ABS.StdLib;
// abs/lang/abslang.abs:107:0: 
public final class sqrt_newton_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private sqrt_newton_f() { }
    public static org.abs_models.backend.java.lib.types.ABSRational apply(org.abs_models.backend.java.lib.types.ABSRational x, org.abs_models.backend.java.lib.types.ABSRational estimate, org.abs_models.backend.java.lib.types.ABSRational epsilon) {
        return (new org.abs_models.backend.java.lib.expr.Let() { public org.abs_models.backend.java.lib.types.ABSRational in(final org.abs_models.backend.java.lib.types.ABSRational epsilon, final org.abs_models.backend.java.lib.types.ABSRational estimate, final org.abs_models.backend.java.lib.types.ABSRational x, final org.abs_models.backend.java.lib.types.ABSRational next) { return org.abs_models.backend.java.lib.expr.BinOp.lt(ABS.StdLib.abs___f.apply(estimate.subtract(next)),epsilon).toBoolean() ? estimate : ABS.StdLib.sqrt_newton_f.apply(x, next, epsilon); }}.in(epsilon, estimate, x, estimate.add(x.divide(estimate)).divide(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(2L))));
    }
}
