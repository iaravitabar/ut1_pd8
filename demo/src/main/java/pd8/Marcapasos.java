package pd8;

public class Marcapasos {
    private short presionSanguinea;
    private short frecuenciaCardiaca;
    private int nivelAzucar;
    private long maximaFuerza;
    private float minimoTiempoEntreLatidos;
    private double bateriaRestante;
    private String codigoFabricante;

    public Marcapasos(short presionSanguinea, short frecuenciaCardiaca, int nivelAzucar, long maximaFuerza,
    float minimoTiempoEntreLatidos, double bateriaRestante, String codigoFabricante) {
        this.presionSanguinea = presionSanguinea;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.nivelAzucar = nivelAzucar;
        this.maximaFuerza = maximaFuerza;
        this.minimoTiempoEntreLatidos = minimoTiempoEntreLatidos;
        this.bateriaRestante = bateriaRestante;
        this.codigoFabricante = codigoFabricante;
    }
}
