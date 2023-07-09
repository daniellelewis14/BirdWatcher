public class Bird{
  private String englishName;
  private String latinName;
  private int observations = 0;

    public Bird(String name, String latinName) {
        this.englishName = name;
        this.latinName = latinName;
    }

    public String getName(){
        return this.englishName;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void observe() {
        this.observations++;
    }

    @Override
    public String toString() {
        if(observations == 1) {
            return this.englishName + " (" + this.latinName + "): " + this.observations + " observation";
        } else {
            return this.englishName + " (" + this.latinName + "): " + this.observations + " observations";
        }
    }
}