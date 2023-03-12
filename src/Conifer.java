public class Conifer extends Tree{
    public Conifer(int numberOfBranches, int numberOfRoots, double heightOfTrunk) {
        super(numberOfBranches,numberOfRoots,heightOfTrunk);
        super.height = heightOfTrunk + numberOfBranches*0.4;
        super.isItStanding = true;
        super.hasItGotLeafs = false;
    }

    @Override
    public void grow() throws TreeException{
        if(super.isItStanding && numberOfRoots >= 1 && numberOfBranches >= 1 && heightOfTrunk > 0 ) {
            super.heightOfTrunk += 3;
            super.numberOfBranches += 8;
            super.numberOfRoots += 2;
            super.height += 3 + 8 * 0.5;
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
