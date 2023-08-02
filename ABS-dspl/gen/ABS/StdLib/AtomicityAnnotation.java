package ABS.StdLib;
// abs/lang/abslang.abs:643:0: 
public abstract class AtomicityAnnotation extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isAtomic() { return this instanceof AtomicityAnnotation_Atomic; }
    public final AtomicityAnnotation_Atomic toAtomic() { return (AtomicityAnnotation_Atomic) this; }
}
