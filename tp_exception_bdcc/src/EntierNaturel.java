public class EntierNaturel {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public EntierNaturel(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException("La valeur ne peut pas être négative", val);
        }
        this.val = val;
    }
    public void decrementer() throws NombreNegatifException {
        if (val == 0) {
            throw new NombreNegatifException("La valeur est déjà nulle, impossible de décrémenter", val);
        }
        val--;
    }
}
