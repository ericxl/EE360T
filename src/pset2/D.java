package pset2;

public class D extends C {
    int g;

    public D(String s, int g) {
        super(s);
        this.g = g;
    }

    @Override
    public boolean equals(Object o) {
        // returns a boolean consistent with the Java contract for equals method;
        // returns true if and only if o is an object of class D and
        // has the same value for field s as this.s (w.r.t. String equals) and
        // the same value for field g as this.g
        // your code goes here

        if(o == this) {
            return true;
        }
        if(o == null){
            return false;
        }
        if(o.getClass() != this.getClass()){
            return false;
        }
        D d = (D) o;
        if(d.s == this.s && d.g == this.g) {
            return true;
        }
        if( d.s == null || this.s == null) {
            return false;
        }
        if(d.s.equals(this.s) && d.g == this.g){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
// returns an integer consistent with the Java contract for hashCode method;
// does not return a constant value
// your code goes here
        return 1;
    }
}