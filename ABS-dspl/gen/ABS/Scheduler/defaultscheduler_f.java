package ABS.Scheduler;
// abs/lang/abslang.abs:734:0: 
public final class defaultscheduler_f implements org.abs_models.backend.java.lib.types.ABSFunction {
    private defaultscheduler_f() { }
    public static org.abs_models.backend.java.lib.types.ABSProcess apply(ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSProcess> queue) {
        return (ABS.StdLib.head_f.apply(queue));
    }
}
