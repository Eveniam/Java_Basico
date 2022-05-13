public class Keke_N00221562 {
    public String ingrediente;
    public double cantIng;
    public int numero;

    public Keke_N00221562() {}

    public Keke_N00221562(int numero) {
        this.numero = numero;
    }

    
    public Keke_N00221562(double cantIng, String ingrediente) {
        this.ingrediente = ingrediente;
        this.cantIng = cantIng;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public double getCantIng() {
        return cantIng;
    }

    public void setCantIng(double cantIng) {
        this.cantIng = cantIng;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return cantIng +" - "+ ingrediente;
    }
    
}
