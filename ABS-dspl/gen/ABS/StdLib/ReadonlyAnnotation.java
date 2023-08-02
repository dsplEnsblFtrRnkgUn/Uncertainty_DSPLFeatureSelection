package ABS.StdLib;
// abs/lang/abslang.abs:649:0: 
public abstract class ReadonlyAnnotation extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isReadonly() { return this instanceof ReadonlyAnnotation_Readonly; }
    public final ReadonlyAnnotation_Readonly toReadonly() { return (ReadonlyAnnotation_Readonly) this; }
}
