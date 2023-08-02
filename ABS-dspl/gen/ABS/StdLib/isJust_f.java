package ABS.StdLib;
// abs/lang/abslang.abs:172:0: 
public final class isJust_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private isJust_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>org.abs_models.backend.java.lib.types.ABSBool apply(ABS.StdLib.Maybe<A> a) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSBool of(final ABS.StdLib.Maybe<A> a, final ABS.StdLib.Maybe<A> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Just.class,new org.abs_models.backend.java.lib.expr.PatternVariable("j")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute(final A j) { return org.abs_models.backend.java.lib.types.ABSBool.TRUE; }
                }.execute((A) __ABS_binding0.getBinding(0));
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Nothing.class).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSBool execute() { return org.abs_models.backend.java.lib.types.ABSBool.FALSE; }
                }.execute();
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:173:4:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(a, a));
    }
}
