package ABS.StdLib.Exceptions;
// abs/lang/abslang.abs:702:0: 
public final class Exception_NullPointerException extends ABS.StdLib.Exception {
    public Exception_NullPointerException() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "NullPointerException";} 
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Exception_NullPointerException)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        Exception_NullPointerException other = (Exception_NullPointerException) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
