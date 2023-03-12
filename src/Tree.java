public abstract class Tree{
    double height, heightOfTrunk;
    int numberOfBranches, numberOfRoots;
    boolean hasItGotLeafs;
    boolean isItStanding = false;

    public Tree(int numberOfBranches, int numberOfRoots, double heightOfTrunk){
        this.numberOfBranches = numberOfBranches;
        this.numberOfRoots = numberOfRoots;
        this.heightOfTrunk = heightOfTrunk;
        this.height = heightOfTrunk + numberOfBranches*0.4;
    }
    public abstract  void grow() throws TreeException;
    public abstract void cutDown() throws TreeException;
}
