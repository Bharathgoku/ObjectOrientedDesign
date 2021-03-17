package ObjectOrientedDesign.LibraryManagementSystem;

public class Test {

    public static void main(String[] args){
        Thread thread = new Thread(new Scheduler());
        thread.start();



        thread.stop();
    }

}
