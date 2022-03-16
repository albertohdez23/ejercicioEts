package es.iespuerto.area;

public class Alberto {
    private String tipo;
    private Integer valor1;
    private Integer valor2;

    /**
     * Constructor por defecto
     */
    public Alberto() {
    }

    /**
     * Constructor con 1 parametro
     * @param valor1
     */
    public Alberto(Integer valor1) {
        this.valor1 = valor1;
    }

    /**
     * Constructor con 2 parametros
     * @param valor1
     * @param valor2
     */
    public Alberto(Integer valor1, Integer valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void CalcularArea(Integer valor1, Integer valor2){
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getValor1() {
        return valor1;
    }

    public void setValor1(Integer valor1) {
        this.valor1 = valor1;
    }

    public Integer getValor2() {
        return valor2;
    }

    public void setValor2(Integer valor2) {
        this.valor2 = valor2;
    }
}
