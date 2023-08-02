package ABS.StdLib;
// abs/lang/abslang.abs:177:0: 
public final class isLeft_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private isLeft_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue>org.abs_models.backend.java.lib.types.ABSBool apply(ABS.StdLib.Either<A,B> val) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSBool of(final ABS.StdLib.Either<A,B> val, final ABS.StdLib.Either<A,B> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Either_Left.class,new org.abs_models.backend.java.lib.expr.PatternVariable("x")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute(final A x) { return org.abs_models.backend.java.lib.types.ABSBool.TRUE; }
                }.execute((A) __ABS_binding0.getBinding(0));
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.AnyPattern().match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute() { return org.abs_models.backend.java.lib.types.ABSBool.FALSE; }
                }.execute();
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:178:4:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(val, val));
    }
}
