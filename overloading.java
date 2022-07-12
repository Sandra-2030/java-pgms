class overloadc{
    void sum(int a, long b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        overloadc obj = new overloadc();
        obj.sum(10,10);
        obj.sum(10,10,15);
    }
}