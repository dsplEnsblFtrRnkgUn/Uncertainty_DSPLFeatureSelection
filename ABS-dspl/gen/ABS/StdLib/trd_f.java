package ABS.StdLib;
// abs/lang/abslang.abs:188:0: 
public final class trd_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private trd_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue,B extends org.abs_models.backend.java.lib.types.ABSValue,C extends org.abs_models.backend.java.lib.types.ABSValue>C apply(ABS.StdLib.Triple<A,B,C> t) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public C of(final ABS.StdLib.Triple<A,B,C> t, final ABS.StdLib.Triple<A,B,C> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Triple_Triple.class,new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.AnyPattern(),new org.abs_models.backend.java.lib.expr.PatternVariable("val")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public C execute(final C val) { return val; }
                }.execute((C) __ABS_binding0.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:188:40:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(t, t));
    }
}
