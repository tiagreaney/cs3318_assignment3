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
        if (!(obj instanceof Colour)) {
            return false;
        }
        final Colour colourObj = (Colour) obj;
        return this.getColourModel().equals(colourObj.getColourModel()) && this.getNumberOne() == colourObj.getNumberOne() && this.getNumberTwo() == colourObj.getNumberTwo() && this.getNumberThree() == colourObj.getNumberThree();
    }

    public Colour addColours(Colour colourObj){
        if (this.getColourModel().equals(colourObj.getColourModel())){
            int newRed = this.getNumberOne() + colourObj.getNumberOne();
            int newGreen = this.getNumberTwo() + colourObj.getNumberTwo();
            int newBlue = this.getNumberThree() + colourObj.getNumberThree();
            if ((newRed <= 255) && (newGreen <= 255) && (newBlue <= 255)){
                return new Colour(this.getColourModel(), newRed, newGreen, newBlue);
            }
            throw new IllegalArgumentException("Component values out of range");
        }
        throw new IllegalArgumentException("Colour models are not the same");
    }
}
