public class LeafyTree extends Tree{



   public LeafyTree(int numberOfBranches, int numberOfRoots, double heightOfTrunk) {
        super(numberOfBranches,numberOfRoots,heightOfTrunk);
        super.height = heightOfTrunk + numberOfBranches*0.4;
        super.isItStanding = true;
    }

    @Override
    public void grow() throws TreeException{
        if(super.isItStanding &&numberOfRoots >= 1 && numberOfBranches >= 1 && heightOfTrunk > 0 ) {
            super.heightOfTrunk += 5;
            super.numberOfBranches += 10;
            super.numberOfRoots += 3;
            super.height += 5+10*0.4;
        } else {
            throw new TreeException();
        }
    }

    @Override
    public void cutDown() throws TreeException{
        if(super.isItStanding) {
            super.isItStanding = false;
        } else {
            throw new TreeException();
        }
    }

}
