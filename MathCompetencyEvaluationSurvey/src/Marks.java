import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Marks {
    // Section A: marks
    private float marks[];
    private int numdata;

    private float average;
    private float standardDev;

    public Marks(int numdat) {
        createData(numdat);
    }

    // Section B: operation
    public void createData(int numdat) {
        Scanner keyIn = new Scanner(System.in);
        marks = new float[numdat];   // an array
        for (int i=0; i<numdat; i++) {
            System.out.print("Enter marks for student #" + (i+1) + ": ");
            marks[i] =  keyIn.nextInt();

        }
        numdata = numdat;
    }

    public float calcAvg() {
        float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
        }
        float avg = sum / numdata;
        this.average = avg;
        return avg;
    }

    public float calcStdDev(){
        float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
        }

        double mean = sum / numdata;

        double variance = 0.0;

        for (int i=0; i<numdata; i++) {
            variance += Math.pow(sum - mean, 2);
        }
        variance /= numdata;

        double stdDev = Math.sqrt(variance);
        this.standardDev = (float) stdDev;
        return (float) stdDev;

    }

    public float getAverage (){
        return average;
    }

    public float getStandardDev(){
        return standardDev;
    }

    public void setMark(int mark, int index) throws Exception {
        if (mark < 0)
            throw new Exception("Mark is incorrect");

        this.marks[index]=mark;

    }
    public float getMark(int index) {
        return marks[index];
    }
}