public class Pan_N00221562 {
    public String ingrediente;
    public double cant;
    public int numero;

    public Pan_N00221562() {
    }

    public Pan_N00221562(int numero) {
        this.numero = numero;
    }

    public Pan_N00221562(double cant, String ingrediente) {
        this.ingrediente = ingrediente;
        this.cant = cant;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public double getCant() {
        return cant;
    }

    public void setCant(double cant) {
        this.cant = cant;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    @Override
    public String toString() {
        return cant +" gr - "+ ingrediente + "\n";
    }

}
