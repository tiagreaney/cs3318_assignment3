public class Colour {

    private int numberOne, numberTwo, numberThree;
    private String colourModel;

    public Colour(int numberOne, int numberTwo, int numberThree){
        if (numberOne > 255 || numberOne < 0 || numberTwo >255 || numberTwo < 0 || numberThree > 255 || numberThree <0) {
            throw new IllegalArgumentException ("rgb not in correct range");
        }
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
        this.colourModel = "RGB";
    }

    public Colour(String colourModel, int numberOne, int numberTwo, int numberThree){
        if (numberOne > 255 || numberOne < 0 || numberTwo >255 || numberTwo < 0 || numberThree > 255 || numberThree <0) {
            throw new IllegalArgumentException ("not in correct range");
        }
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
        this.colourModel = colourModel;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }
    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getNumberThree() {
        return numberThree;
    }

    public void setNumberThree(int numberThree) {
        this.numberThree = numberThree;
    }

    public String getColourModel() {
        return colourModel;
    }

    public void setColourModel(String colourModel) {
        this.colourModel = colourModel;
    }

    @Override
    public boolean equals(Object obj) {
        final Colour colourObj = (Colour) obj;
        return this.getColourModel().equals(colourObj.getColourModel()) && this.getNumberOne() == colourObj.getNumberOne() && this.getNumberTwo() == colourObj.getNumberTwo() && this.getNumberThree() == colourObj.getNumberThree();
    }

    public Colour addColours(Colour colourObj1, Colour colourObj2){
        if (colourObj1.getColourModel().equals(colourObj2.getColourModel())){
            int newRed = colourObj1.getNumberOne() + colourObj2.getNumberOne();
            int newGreen = colourObj1.getNumberTwo() + colourObj2.getNumberTwo();
            int newBlue = colourObj1.getNumberThree() + colourObj2.getNumberThree();
            if ((newRed <= 255) && (newGreen <= 255) && (newBlue <= 255)){
                return new Colour(colourObj1.getColourModel(), newRed, newGreen, newBlue);
            }
        }
        return null;
    }
}
