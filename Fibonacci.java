
class Fibonacci {
    private int a,b,c;

    public Fibonacci() {
        a=0;
        b=1;
    }

    public int getTerm() {
        return a;
    }

    public void generateNext() {
        c=a+b;
        a=b;
        b=c;
    }

    public String toString(){
        return ""+a;
    }
}
