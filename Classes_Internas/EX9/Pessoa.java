public class Pessoa {
    class Endereco {
        private String cidade;
        private String estado;

        public Endereco(String cidade, String estado) {
            this.cidade = cidade;
            this.estado = estado;
        }

        public void imprimirEndereco() {
            System.out.println("Cidade: " + cidade);
            System.out.println("Estado: " + estado);
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa.Endereco endereco = pessoa.new Endereco("Alegre", "Espirito Santo");
        endereco.imprimirEndereco();
    }
}