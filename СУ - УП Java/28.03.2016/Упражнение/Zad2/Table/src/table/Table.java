package table;

import java.util.Scanner;

public class Table {
    
    int beggining;
    int end;
    int step;
    
    public Table(int beggining, int end, int step){
        setBeggining(beggining);
        setEnd(end);
        setStep(step);
    }

    public void setBeggining(int beggining) {
        this.beggining = beggining;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getBeggining() {
        return beggining;
    }

    public int getEnd() {
        return end;
    }

    public int getStep() {
        return step;
    }
    
    public double function(double x){
        double abs = Math.abs(x - 2);
        return Math.pow(abs, 3)/(Math.pow(x,2) + 1);
    }
    
    public void makeTable(){
        Scanner sc = new Scanner(System.in);
        double result;
        double x;
        double steps;
        
        steps = (double)(getEnd() - getBeggining())/(getStep() - 1);
        for (int i = 0; i < getStep(); i++) {
            x = getBeggining() + i * steps;
            result = function(x);
            System.out.printf("%.4f\t%.4f\n",x, result);
            if ((i+1) % 20 == 0) {
                System.out.print("Press return to continue... ");
                sc.nextLine();
            }
        }
    }
}
