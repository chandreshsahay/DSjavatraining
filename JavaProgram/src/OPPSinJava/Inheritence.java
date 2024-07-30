package OPPSinJava;

public class Inheritence {
    public static void main(String[] args) {
        Parents parents = new Parents();
        parents.printParent();
        //using inheritance call grandParent method
    }
}
class Parents extends GrandParents{
    void printParent(){
        System.out.println("Im parent");
    }
}
class GrandParents{
    void printGrandParent(){
        System.out.println("Im grand parent");
    }
}


