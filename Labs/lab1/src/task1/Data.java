package task1;

public class Data {
    private double sum;
    private double max;
    private int count;

    public Data(){
        sum = 0;
        max = Double.NEGATIVE_INFINITY;
        count = 0;
    }

    public void Add(double num){
        sum += num;
        count++;
        if(max < num) max =num;
    }

    public double Avg(){
        if(count == 0) return 0;
        return sum/count;
    }

    public double Max(){
        return max;
    }


}
