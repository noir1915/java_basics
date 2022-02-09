public class Country {

    public String name;
    public int populationSize;
    public int square;
    public String nameOfTheCapital;
    public boolean landlocked;


    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getNameOfTheCapital() {
        return nameOfTheCapital;
    }

    public void setNameOfTheCapital(String nameOfTheCapital) {
        this.nameOfTheCapital = nameOfTheCapital;
    }

    public boolean isLandlocked() {
        return landlocked;
    }

    public void setLandlocked(boolean landlocked) {
        this.landlocked = landlocked;
    }

}
