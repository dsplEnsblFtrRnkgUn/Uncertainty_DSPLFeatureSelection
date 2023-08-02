package ABS.StdLib;
// abs/lang/abslang.abs:603:0: 
public abstract class Spec extends org.abs_models.backend.java.lib.types.ABSDataType {
    public final boolean isObjInv() { return this instanceof Spec_ObjInv; }
    public final Spec_ObjInv toObjInv() { return (Spec_ObjInv) this; }
    public final boolean isEnsures() { return this instanceof Spec_Ensures; }
    public final Spec_Ensures toEnsures() { return (Spec_Ensures) this; }
    public final boolean isRequires() { return this instanceof Spec_Requires; }
    public final Spec_Requires toRequires() { return (Spec_Requires) this; }
    public final boolean isWhileInv() { return this instanceof Spec_WhileInv; }
    public final Spec_WhileInv toWhileInv() { return (Spec_WhileInv) this; }
    public final boolean isResolves() { return this instanceof Spec_Resolves; }
    public final Spec_Resolves toResolves() { return (Spec_Resolves) this; }
    public final boolean isLocal() { return this instanceof Spec_Local; }
    public final Spec_Local toLocal() { return (Spec_Local) this; }
    public final boolean isRole() { return this instanceof Spec_Role; }
    public final Spec_Role toRole() { return (Spec_Role) this; }
    public final boolean isSucceeds() { return this instanceof Spec_Succeeds; }
    public final Spec_Succeeds toSucceeds() { return (Spec_Succeeds) this; }
    public final boolean isOverlaps() { return this instanceof Spec_Overlaps; }
    public final Spec_Overlaps toOverlaps() { return (Spec_Overlaps) this; }
}
