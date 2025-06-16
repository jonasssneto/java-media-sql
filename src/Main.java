import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = ConnectionManager.getConnection();
            System.out.println("Conexão estabelecida com sucesso!");

            Statement stmt = conn.createStatement();

            String query = "select idade from alunos;";
            ResultSet rs = stmt.executeQuery(query);

            ArrayList<Integer> idades = new ArrayList<>();

            while (rs.next()) {
                int idade = rs.getInt("idade");
                idades.add(idade);
            }

            System.out.println("Média de idades dos estudantes:");

            int totalIdades = idades.size();
            int soma = 0;

            for (int i = 0; i < totalIdades; i++) {
                soma += idades.get(i);
            }

            double media = (double) soma / totalIdades;

            System.out.printf("Média é: %.2f\n", media);
        } catch (SQLException e) {
            System.out.println("Erro na conexão com o banco de dados: " + e.getMessage());
        }
    }
}
