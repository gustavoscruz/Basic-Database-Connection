import DAO.UsuarioDAO;
import entity.Usuario;
import br.com.cursopcv.jdbc_conn.Conexao;

public class Main {
    public static void main(String[] args) throws Exception {

        Usuario user = new Usuario();
        user.setNome("Gustavo");
        user.setLogin("gustavo");
        user.setSenha("12345");
        user.setEmail("gustavoscruz29@gmail.com");

        new UsuarioDAO().cadastrarUsuario(user);

    }
}