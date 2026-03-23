import modelo.Produto;

void main() {

    DateTimeFormatter formatter = DateTimeFormatter
            .ofPattern("dd/MM/yyyy");

    //Saída
    System.out.println(formatter.format(LocalDate.now()));

    String data = IO.readln("Informe a data desejada:");
    LocalDate minhaData = LocalDate.parse(data, formatter);

}