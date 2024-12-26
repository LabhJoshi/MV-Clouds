// Multilevel Inheritance

class God{
    String life;

    void creation(){
        life = "All living beings";
        System.out.println("God created "+life);
    }
}

class Human extends God{

    void creation(){
        life = "All living humans";
        System.out.println("God created "+life);
    }
}

class Male extends Human{

    void creation(){
        life = "Males in human category";
        System.out.println(life);
    }
}

class Main{
    public static void main(String[] args) {
        God god=new God();
        Human human=new Human();
        Male male=new Male();

        god.creation();
        human.creation();
        male.creation();
    }
}
