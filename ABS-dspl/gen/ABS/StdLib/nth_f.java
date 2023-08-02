package ABS.StdLib;
// abs/lang/abslang.abs:372:0: 
public final class nth_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private nth_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>A apply(ABS.StdLib.List<A> list, org.abs_models.backend.java.lib.types.ABSInteger n) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public A of(final ABS.StdLib.List<A> list, final org.abs_models.backend.java.lib.types.ABSInteger n, final org.abs_models.backend.java.lib.types.ABSInteger __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternValue(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L)).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public A execute() { return ABS.StdLib.head_f.apply(list); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.AnyPattern().match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public A execute() { return ABS.StdLib.nth_f.apply(ABS.StdLib.tail_f.apply(list), n.subtract(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L))); }
                }.execute();
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:373:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(list, n, n));
    }
}
