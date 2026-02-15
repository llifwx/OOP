package task3;

public class temperature {
    private double value;
    private char scale;

    public temperature(){
        this.value = 0;
        this.scale = 'C';
    }
    public temperature(double temper){
        this.value = temper;
        this.scale = 'C';
    }
    public temperature(char lett){
        this.value = 0;
        this.scale = lett;
    }
    public temperature(double temper, char lett){
        this.value = temper;
        this.scale = lett;
    }

    public double getCelsius(temperature t) {
        if(t.scale == 'C') return t.value;
        else {
            t.value = 5 * (t.value - 32) / 9;
            t.scale = 'C';
            return t.value;
        }
    }
    public double getFahrenheit(temperature t){
        if(t.scale == 'F') return t.value;
        else{
            t.value = 9 * (t.value / 5) + 32;
            t.scale = 'F';
            return t.value;
        }
    }

    public void setScale (char lett) {
        this.scale = lett;
    }
    public void setTemperature (double temper) {
        this.value = temper;
    }
    public void setBoth (double temper, char lett) {
        this.scale = lett;
        this.value = temper;
    }

    public char getScale() {
        return scale;
    }
}
