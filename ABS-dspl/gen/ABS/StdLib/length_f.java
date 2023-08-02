package ABS.StdLib;
// abs/lang/abslang.abs:358:0: 
public final class length_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private length_f() { }
    public static <A extends org.abs_models.backend.java.lib.types.ABSValue>org.abs_models.backend.java.lib.types.ABSInteger apply(ABS.StdLib.List<A> list) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSInteger of(final ABS.StdLib.List<A> list, final ABS.StdLib.List<A> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.List_Nil.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSInteger execute() { return org.abs_models.backend.java.lib.types.ABSInteger.fromLong(0L); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.List_Cons.class,new org.abs_models.backend.java.lib.expr.PatternVariable("p"),new org.abs_models.backend.java.lib.expr.PatternVariable("l")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSInteger execute(final A p, final ABS.StdLib.List<A> l) { return org.abs_models.backend.java.lib.types.ABSInteger.fromLong(1L).add(ABS.StdLib.length_f.apply(l)); }
                }.execute((A) __ABS_binding1.getBinding(0),(ABS.StdLib.List<A>) __ABS_binding1.getBinding(1));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:359:3:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(list, list));
    }
}
