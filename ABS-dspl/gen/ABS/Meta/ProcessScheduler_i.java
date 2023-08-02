package ABS.Meta;
// abs/lang/abslang.abs:1288:0: 
public interface ProcessScheduler_i extends org.abs_models.backend.java.lib.types.ABSInterface, ABS.StdLib.Object_i {
    // abs/lang/abslang.abs:1289:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSProcess> async_schedule(ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSProcess> queue);
    // abs/lang/abslang.abs:1289:4: 
    public  org.abs_models.backend.java.lib.types.ABSProcess schedule(ABS.StdLib.List<org.abs_models.backend.java.lib.types.ABSProcess> queue);
    boolean __ABS_isSameCOG();
}
