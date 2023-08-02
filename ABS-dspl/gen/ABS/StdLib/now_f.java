package ABS.StdLib;
// abs/lang/abslang.abs:556:0: 
public final class now_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private now_f() { }
    public static ABS.StdLib.Time apply() {
        return (new ABS.StdLib.Time_Time(org.abs_models.backend.java.lib.runtime.ABSBuiltInFunctions.currentms()));
    }
}
