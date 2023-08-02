package ABS.Meta;
// abs/lang/abslang.abs:1292:0: 
public interface Class_i extends org.abs_models.backend.java.lib.types.ABSInterface, ABS.StdLib.Object_i {
    // abs/lang/abslang.abs:1293:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSString> async_getName();
    // abs/lang/abslang.abs:1293:4: 
    public  org.abs_models.backend.java.lib.types.ABSString getName();
    // abs/lang/abslang.abs:1294:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.Meta.Method_i> async_getMethod(org.abs_models.backend.java.lib.types.ABSString mName);
    // abs/lang/abslang.abs:1294:4: 
    public  ABS.Meta.Method_i getMethod(org.abs_models.backend.java.lib.types.ABSString mName);
    // abs/lang/abslang.abs:1295:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_addMethod(org.abs_models.backend.java.lib.types.ABSString mName, ABS.Meta.Method_i m);
    // abs/lang/abslang.abs:1295:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit addMethod(org.abs_models.backend.java.lib.types.ABSString mName, ABS.Meta.Method_i m);
    // abs/lang/abslang.abs:1296:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_removeMethod(org.abs_models.backend.java.lib.types.ABSString mName);
    // abs/lang/abslang.abs:1296:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit removeMethod(org.abs_models.backend.java.lib.types.ABSString mName);
    boolean __ABS_isSameCOG();
}
