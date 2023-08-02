package ABS.Meta;
// abs/lang/abslang.abs:1269:0: 
public interface ObjectMirror_i extends org.abs_models.backend.java.lib.types.ABSInterface, ABS.StdLib.Object_i {
    // abs/lang/abslang.abs:1270:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSString> async_getClassName__();
    // abs/lang/abslang.abs:1270:4: 
    public  org.abs_models.backend.java.lib.types.ABSString getClassName__();
    // abs/lang/abslang.abs:1271:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.Meta.Class_i> async_getClass__();
    // abs/lang/abslang.abs:1271:4: 
    public  ABS.Meta.Class_i getClass__();
    // abs/lang/abslang.abs:1272:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_setClass(ABS.Meta.Class_i c);
    // abs/lang/abslang.abs:1272:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit setClass(ABS.Meta.Class_i c);
    // abs/lang/abslang.abs:1274:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.StdLib.Object_i> async_getFieldValue();
    // abs/lang/abslang.abs:1274:4: 
    public  ABS.StdLib.Object_i getFieldValue();
    // abs/lang/abslang.abs:1275:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_setFieldValue(ABS.StdLib.Object_i val);
    // abs/lang/abslang.abs:1275:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit setFieldValue(ABS.StdLib.Object_i val);
    // abs/lang/abslang.abs:1276:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<ABS.Meta.Cog_i> async_getCog();
    // abs/lang/abslang.abs:1276:4: 
    public  ABS.Meta.Cog_i getCog();
    // abs/lang/abslang.abs:1277:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSUnit> async_setCog(ABS.Meta.Cog_i c);
    // abs/lang/abslang.abs:1277:4: 
    public  org.abs_models.backend.java.lib.types.ABSUnit setCog(ABS.Meta.Cog_i c);
    // abs/lang/abslang.abs:1279:4: 
    public  org.abs_models.backend.java.lib.runtime.ABSFut<org.abs_models.backend.java.lib.types.ABSBool> async_respondsTo(org.abs_models.backend.java.lib.types.ABSString name);
    // abs/lang/abslang.abs:1279:4: 
    public  org.abs_models.backend.java.lib.types.ABSBool respondsTo(org.abs_models.backend.java.lib.types.ABSString name);
    boolean __ABS_isSameCOG();
}
