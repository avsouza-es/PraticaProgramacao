public class MainCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("João");
        cliente.setCpf("123456789");

        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
    }
}
