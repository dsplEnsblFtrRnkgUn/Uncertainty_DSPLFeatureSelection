package ABS.StdLib;
// abs/lang/abslang.abs:654:30: 
public final class HTTPCallableAnnotation_HTTPCallable extends HTTPCallableAnnotation {
    public HTTPCallableAnnotation_HTTPCallable() {
    }
    protected org.abs_models.backend.java.lib.types.ABSValue[] getArgs() { return new org.abs_models.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "HTTPCallable";}
    public org.abs_models.backend.java.lib.types.ABSBool eq(org.abs_models.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof HTTPCallableAnnotation_HTTPCallable)) return org.abs_models.backend.java.lib.types.ABSBool.FALSE;
        HTTPCallableAnnotation_HTTPCallable other = (HTTPCallableAnnotation_HTTPCallable) o;
        return org.abs_models.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(org.abs_models.backend.java.lib.expr.PatternConstructor c, org.abs_models.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
