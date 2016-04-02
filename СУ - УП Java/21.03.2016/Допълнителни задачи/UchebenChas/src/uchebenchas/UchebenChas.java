package uchebenchas;

public class UchebenChas {
    private String naimenovanie;
    private int minutiProdalzitelnost;
    
    public UchebenChas(){
        this.naimenovanie = "No name!";
        this.minutiProdalzitelnost = 45;
    }
    
    public UchebenChas(String naimenovanie, int minutiProdalzitelnost){
        setNaimenovanie(naimenovanie);
        setMinutiProdalzitelnost(minutiProdalzitelnost);
    }
    
    public UchebenChas(UchebenChas uchebenChas){
        setNaimenovanie(uchebenChas.getNaimenovanie());
        setMinutiProdalzitelnost(uchebenChas.getMinutiProdalzitelnost());
    }

    public void setNaimenovanie(String naimenovanie) {
        if (naimenovanie != null) {
            this.naimenovanie = naimenovanie;
        } else {
            this.naimenovanie = "No name!";
        }
    }

    public String getNaimenovanie() {
        return naimenovanie;
    }

    public void setMinutiProdalzitelnost(int minutiProdalzitelnost) {
        if (minutiProdalzitelnost > 0) {
            this.minutiProdalzitelnost = minutiProdalzitelnost;
        } else {
            this.minutiProdalzitelnost = 45;
        }
    }

    public int getMinutiProdalzitelnost() {
        return minutiProdalzitelnost;
    }
    
}
