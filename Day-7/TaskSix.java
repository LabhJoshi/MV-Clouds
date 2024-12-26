interface In1{
    final int x=10;
    void interfaceOne();
}

interface In2{
    final int y=20;
    void interfaceTwo();
}

public class TaskSix implements In1, In2{

    public void interfaceOne(){
        System.out.println("This is overridden method of Interface One.");
        System.out.println("x: "+x);
    }

    public void interfaceTwo(){
        System.out.println("This is overridden method of Interface Two.");
        System.out.println("y: "+y);
    }
    public static void main(String[] args) {
        TaskSix obj=new TaskSix();

        obj.interfaceOne();
        obj.interfaceTwo();
    }
}
