public class TestaData {
    public static void main(String[] args) {
        Data a = new Data();
        Data b = new Data(10, 10, 2020);

        System.out.println(a.retDia() + " " + a.retMes() + " " + a.retAno());
        System.out.println(b.mostra1());

        a.entraDia();
        a.entraMes();
        a.entraAno();

        b.entraDia(28);
        b.entraMes(04);
        b.entraAno(2001);

        System.out.println(a.mostra2());
        System.out.println(b.mostra2());

        System.out.println(b.bissexto());

        System.out.println(b.diasTrasncorridos());

        a.apresentaDataAtual();
    }
}
