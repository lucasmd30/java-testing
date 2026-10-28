package ex10;

public class UsuarioValidator {
    private UsuarioDAO usuarioDao;
    private SenhaValidator senhaValidator;

    public UsuarioValidator(UsuarioDAO usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    public void setSenhaValidator(SenhaValidator senhaValidator) {
        this.senhaValidator = senhaValidator;
    }

    public boolean ehUsuarioValido(Usuario u) throws Exception {
        if (u.getNome().length() <= 3)
            throw new Exception("nome do usuario precisa de pelo menos 3 caracteres");

        if (!u.getSenha().equals(u.getSenhaConfirmada()))
            throw new Exception("senhas diferentes");

        if (usuarioDao.existe(u.getNome()))
            throw new Exception("usuario ja existe");

        if (senhaValidator.verificar(u.getSenha()))
            throw new Exception("senha invalida");

        String nome = u.getNome();
        boolean isValid = true;
        for (int i = 0; i < nome.length(); i++) {
            char atual = nome.charAt(i);
            if (!Character.isAlphabetic(atual) && !Character.isDigit(atual))
                isValid = false;
        }
        return isValid;
    }
}
