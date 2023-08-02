package ABS.StdLib;
// abs/lang/abslang.abs:351:15: 
public final class List_Nil<A extends org.abs_models.backend.java.lib.types.ABSValue> extends List<A> {
    public List_Nil() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "Nil";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof List_Nil)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        List_Nil other = (List_Nil) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
