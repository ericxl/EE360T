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
        int add = 0;
        if(s != null){
            add = s.hashCode();
        }
        hash = hash * 10 + 2 * add;
        return hash;
    }
}