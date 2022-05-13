public class Cliente_N00221562 {
    public String codigo;
    public Pan_N00221562 cantP;
    public Keke_N00221562 cantK;

    public Cliente_N00221562() {
    }

    public Cliente_N00221562(String codigo, Pan_N00221562 cantP, Keke_N00221562 cantK) {
        this.codigo = codigo;
        this.cantP = cantP;
        this.cantK = cantK;
    }

    public Pan_N00221562 getCantP() {
        return cantP;
    }

    public void setCantP(Pan_N00221562 cantP) {
        this.cantP = cantP;
    }

    public Keke_N00221562 getCantK() {
        return cantK;
    }

    public void setCantK(Keke_N00221562 cantK) {
        this.cantK = cantK;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return codigo;
    }
    
}
