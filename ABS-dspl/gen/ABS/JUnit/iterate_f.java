package ABS.JUnit;
// abs/lang/abslang.abs:1360:0: 
public final class iterate_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private iterate_f() { }
    public static org.abs_models.backend.java.lib.types.ABSString apply(ABS.StdLib.List<ABS.JUnit.Testcase> tcs) {
        return (new org.abs_models.backend.java.lib.expr.Case() {
            public org.abs_models.backend.java.lib.types.ABSString of(final ABS.StdLib.List<ABS.JUnit.Testcase> tcs, final ABS.StdLib.List<ABS.JUnit.Testcase> __ABS_value) {
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding0 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.List_Nil.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSString execute() { return org.abs_models.backend.java.lib.types.ABSString.fromString(""); }
                }.execute();
                final org.abs_models.backend.java.lib.expr.PatternBinding __ABS_binding1 = new org.abs_models.backend.java.lib.expr.PatternConstructor(ABS.StdLib.List_Cons.class,new org.abs_models.backend.java.lib.expr.PatternVariable("tc"),new org.abs_models.backend.java.lib.expr.PatternVariable("rest")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public org.abs_models.backend.java.lib.types.ABSString execute(final ABS.JUnit.Testcase tc, final ABS.StdLib.List<ABS.JUnit.Testcase> rest) { return ABS.JUnit.render_f.apply(tc).add(ABS.JUnit.iterate_f.apply(rest)); }
                }.execute((ABS.JUnit.Testcase) __ABS_binding1.getBinding(0),(ABS.StdLib.List<ABS.JUnit.Testcase>) __ABS_binding1.getBinding(1));
                throw new org.abs_models.backend.java.lib.expr.UnmatchedCaseException("abs/lang/abslang.abs:1361:2:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(tcs, tcs));
    }
}
