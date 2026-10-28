package ex11;

public class ContadorNaRede {
    RedeMovel rede;

    public ContadorNaRede(RedeMovel rede) {
        this.rede = rede;
    }

    public String enviarNumeros(String telefone, int v[]) {
        int npar = 0, nNegativo = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0)
                npar++;
            if (v[i] < 0)
                nNegativo++;
        }
        String msg = "Enviado. pares: " + npar + "; negativos: " + nNegativo;
        if (rede == null || !rede.estaConectado())
            throw new RuntimeException("Sem internet");
        if (rede.enviarSMS(telefone, msg))
            return msg;
        else
            return "Erro no envio. Verifique.";
    }
}
