package ABS.StdLib;
// abs/lang/abslang.abs:416:0: 
public final class copy_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private copy_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>ABS.StdLib.List<A> apply(A p, org.abs_models.backend.java.lib.types.ABSInteger n) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public ABS.StdLib.List<A> of(final A p, final org.abs_models.backend.java.lib.types.ABSInteger n, final org.abs_models.backend.java.lib.types.ABSInteger __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternValue(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L)).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.List<A> execute() { return new ABS.StdLib.List_Nil<>(); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternVariable("m").match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.List<A> execute(final org.abs_models.backend.java.lib.types.ABSInteger m) { return new ABS.StdLib.List_Cons<>(p, ABS.StdLib.copy_f.apply(p, m.subtract(org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L)))); }
                }.execute((org.abs_models.backend.java.lib.types.ABSInteger) __ABS_binding1.getBinding(0));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:417:3:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(p, n, n));
    }
}
