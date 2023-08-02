package ABS.StdLib;
// abs/lang/abslang.abs:170:31: 
public final class fromJust_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private fromJust_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>A apply(ABS.StdLib.Maybe<A> data) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public A of(final ABS.StdLib.Maybe<A> data, final ABS.StdLib.Maybe<A> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Just.class,new org.abs_models.backend.java.lib.expr.PatternVariable("res")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public A execute(final A res) { return res; }
                }.execute((A) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:170:31:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
