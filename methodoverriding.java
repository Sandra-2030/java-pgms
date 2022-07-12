class vehicle{
    void run(){
        System.out.println("vehicle is running.");
    }
}
class Main extends vehicle{
    void run(){
        System.out.println("bike is running safely.");
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.run();
    }
}