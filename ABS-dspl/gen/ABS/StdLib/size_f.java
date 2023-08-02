package ABS.StdLib;
// abs/lang/abslang.abs:224:0: 
public final class size_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private size_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>org.abs_models.backend.java.lib.types.ABSInteger apply(ABS.StdLib.Set<A> xs) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSInteger of(final ABS.StdLib.Set<A> xs, final ABS.StdLib.Set<A> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_EmptySet.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSInteger execute() { return org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_Insert.class,new org.abs_models.backend.java.lib.expr.PatternVariable("s"),new org.abs_models.backend.java.lib.expr.PatternVariable("ss")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSInteger execute(final A s, final ABS.StdLib.Set<A> ss) { return org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L).add(ABS.StdLib.size_f.apply(ss)); }
                }.execute((A) __ABS_binding1.getBinding(0),(ABS.StdLib.Set<A>) __ABS_binding1.getBinding(1));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:225:3:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(xs, xs));
    }
}
