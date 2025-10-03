import java.util.ArrayList;

public class Tv {
    public ArrayList<Canal> canais;
    private String _modelo;
    private int _volume = 50;
    private int canalAtual = 0;

    public Tv(ArrayList<Canal> canais, String modelo) {
        this.canais = canais;
        this._modelo = modelo;
    }

    public int get_volume() {
        return _volume;
    }

    public void set_volume(int _volume) {
        this._volume = _volume;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public String get_modelo() {
        return this._modelo;
    }

    public String mostrarCanalAtual() {
        Canal canal = canais.get(getCanalAtual());
        return getCanalAtual() + " | " + canal.get_nome();
    }


}
