import modelo.Produto;

void main() {

    Produto produto = new Produto(1, "Arroz",
            4.5, LocalDate.of(2026,3,3),
            true);
    Produto produto1 = new Produto();
    Produto produto2 = new Produto(2);

    System.out.println(Produto.getQuantidade());


}