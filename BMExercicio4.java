public class BMExercicio4 {
    String modeloLampada;
    String estado;

    public void acende() {
        estado = "ligada";
    }

    public void apaga() {
        estado = "desligada";
    }

    public void mostraEstado() {
        System.out.println(estado);
    }
}
