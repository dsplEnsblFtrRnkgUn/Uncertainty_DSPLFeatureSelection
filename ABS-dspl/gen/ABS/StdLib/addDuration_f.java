package ABS.StdLib;
// abs/lang/abslang.abs:573:0: 
public final class addDuration_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private addDuration_f() { }
    public static ABS.StdLib.Time apply(ABS.StdLib.Time t, ABS.StdLib.Duration d) {
        return (new ABS.StdLib.Time_Time(ABS.StdLib.timeValue_f.apply(t).add(ABS.StdLib.durationValue_f.apply(d))));
    }
}
