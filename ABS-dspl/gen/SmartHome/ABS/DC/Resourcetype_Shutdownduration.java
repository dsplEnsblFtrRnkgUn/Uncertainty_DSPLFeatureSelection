package ABS.DC;
// abs/lang/abslang.abs:770:2: 
public final class Resourcetype_Shutdownduration extends Resourcetype {
    public Resourcetype_Shutdownduration() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "Shutdownduration";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Resourcetype_Shutdownduration)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Resourcetype_Shutdownduration other = (Resourcetype_Shutdownduration) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
