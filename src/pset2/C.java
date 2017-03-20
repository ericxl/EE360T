package pset2;

public class C {
    String s;

    public C(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(o == null){
            return false;
        }
        if(o.getClass() != this.getClass()){
            return false;
        }
        if( ((C)o).s == this.s ) {
            return true;
        }
        if( ((C)o).s == null || this.s == null) {
            return false;
        }
        if(((C) o).s.equals(this.s)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 10 + (s == null ? 0 : s.hashCode());
        return hash;
    }
}