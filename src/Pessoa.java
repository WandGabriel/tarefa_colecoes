import java.util.Objects;

public class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(sexo, pessoa.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
