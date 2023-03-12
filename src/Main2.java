public class Main2{
    public static void main(String[] args) {

        LeafyTree dl = new LeafyTree(33,30,4);
        Conifer di = new Conifer(40,231,4);

        try {
            System.out.println(di.height);
            di.grow();
            System.out.println(di.height);
            di.cutDown();
            System.out.println(di.isItStanding);
            dl.grow();
            dl.cutDown();
        } catch (TreeException e) {
            System.out.println(e.getMessage());
        }
    }
}
