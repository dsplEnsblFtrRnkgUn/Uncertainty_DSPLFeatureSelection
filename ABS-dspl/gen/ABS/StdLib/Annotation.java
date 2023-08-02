package ABS.StdLib;
// abs/lang/abslang.abs:617:0: 
public abstract class Annotation extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isTypeAnnotation() { return this instanceof Annotation_TypeAnnotation; }
    public final Annotation_TypeAnnotation toTypeAnnotation() { return (Annotation_TypeAnnotation) this; }
}
