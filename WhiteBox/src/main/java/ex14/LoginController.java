package ex14;

import java.util.List;

public class LoginController {
    private UsuarioDAO usuarioDAO;

    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public boolean efetuarLogin(String nome, String senha) throws Exception {
        if (nome.equals("") || senha.equals(""))
            throw new Exception("preencher nome e senha");
        List<Usuario> usuarios = usuarioDAO.getUsuarios();
        Usuario u = null;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNome().equals(nome)) {
                u = usuarios.get(i);
                break;
            }
        }
        if (u == null)
            throw new Exception("usuario nao existe");
        else if (u.getSenha().equals(senha))
            return true;
        else
            return false;
    }
}
