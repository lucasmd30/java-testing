package ex15;

import java.util.List;

public class Buscador {
    private EmpresaDAO empresaDao;
    private Log log;

    public Buscador(EmpresaDAO empresaDao, Log log) {
        this.empresaDao = empresaDao;
        this.log = log;
    }

    public Empresa achar(String campo, String valor, boolean exato) throws Exception {
        log.realizarBusca(campo + "," + valor + "," + exato);
        if (!campo.equals("nome") && !campo.equals("cidade"))
            throw new Exception("campo invalido");
        List<Empresa> empresas = empresaDao.getAll();
        for (int i = 0; i < empresas.size(); i++) {
            Empresa e = empresas.get(i);
            String valorEmp;
            if (campo.equals("nome"))
                valorEmp = e.getNome();
            else
                valorEmp = e.getCidade();
            if (exato && valorEmp.equals(valor))
                return e;
            else if (valorEmp.contains(valor))
                return e;
        }
        return null;
    }
}
