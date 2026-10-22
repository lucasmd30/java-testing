package ex09;

public class RoboController {
    private ANDBaseService andBase;
    private BracosMecanicosService bracos;
    private MecArmsService arms;

    public RoboController(ANDBaseService andBase, BracosMecanicosService bracos, MecArmsService arms) {
        this.andBase = andBase;
        this.bracos = bracos;
        this.arms = arms;
    }

    public Resposta calcularPreco(int numeroDeRobos) throws Exception {
        if (numeroDeRobos < 5)
            throw new Exception("Ao menos cinco unidades");

        var precoBase = andBase.verificarDisponibilidade(numeroDeRobos);
        if (precoBase == -1)
            throw new Exception("Nao ha bases moveis disponiveis");

        var resposta = new Resposta();
        resposta.setNumeroDeRobos(numeroDeRobos);
        resposta.setFabricanteDaBase("AND Bases Roboticas");

        var bracosPreco = bracos.requisitar(2 * numeroDeRobos);
        if (bracosPreco > 0) {
            resposta.setFabricanteDosBracos("Bracos Mecanicos Ltda");
            var valorPorRobo = precoBase + 2 * bracosPreco;
            resposta.setPrecoPorRobo(valorPorRobo);
            return resposta;
        }

        //tentar outro fornecedor de bracos
        var armsPreco = arms.consultar(2 * numeroDeRobos);
        if (armsPreco == 0)
            throw new Exception("Nao ha bracos mecanicos disponiveis");
        else {
            resposta.setFabricanteDosBracos("Mec Arms cia");
            var valorPorRobo = precoBase + 2 * armsPreco;
            resposta.setPrecoPorRobo(valorPorRobo);
            return resposta;
        }
    }
}
