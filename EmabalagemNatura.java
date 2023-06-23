import java.util.Scanner;

public class EmabalagemNatura {
    public static class Projeto{
        public Projeto(String CPF, String link) {
            this.CPF = CPF;
            this.link = link;
            this.nota_1 = 0;
            this.nota_2 = 0;
            this.nota_3 = 0;
            this.media = 0;
        }
        public void setNota_1(float nota_1) {
            this.nota_1 = nota_1;
        }
        public void setNota_2(float nota_2) {
            this.nota_2 = nota_2;
        }
        public void setNota_3(float nota_3) {
            this.nota_3 = nota_3;
        }
        public void setMedia(float media) {
            this.media = media;
        }
        public String CPF;
        public String link;
        public float nota_1;
        public float nota_2;
        public float nota_3;
        public float media;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha_empate;

        Projeto projetos[] = new Projeto[3];
        projetos[0] = new Projeto("234.234.234-23","www.gameNatura.com.br");
        projetos[1] = new Projeto("123.123.123-23","www.expNatura.com.br");
        projetos[2] = new Projeto("567.567.567-56","www.prodNatura.com.br");

        for (Projeto projeto:projetos) {
            System.out.println("Avaliador 1, digite uma nota de 0 à 10 para o projeto referente ao CPF: " + projeto.CPF + ".");
            System.out.println("NOTA: ");
            float primeira_nota = sc.nextFloat();
            projeto.setNota_1(primeira_nota);

            System.out.println("Avaliador 2, digite uma nota de 0 à 10 para o projeto referente ao CPF: " + projeto.CPF + ".");
            System.out.println("NOTA: ");
            float segunda_nota = sc.nextFloat();
            projeto.setNota_2(segunda_nota);

            System.out.println("Avaliador 3, digite uma nota de 0 à 10 para o projeto referente ao CPF: " + projeto.CPF + ".");
            System.out.println("NOTA: ");
            float terceira_nota = sc.nextFloat();
            projeto.setNota_3(terceira_nota);

            float media = (primeira_nota + segunda_nota + terceira_nota)/3;
            projeto.setMedia(media);
        }

        for (int i = 0; i < projetos.length; i++) {
            boolean ordenado = true;
            for (int j = 0; j < projetos.length - 1 - i; j++) {
                if(projetos[j].media < projetos[j+1].media){
                    Projeto aux = projetos[j];
                    projetos[j] = projetos[j+1];
                    projetos[j+1] = aux;
                    ordenado = false;
                }
            }
            if(ordenado)
                break;
        }

        if(projetos[0].media > projetos[1].media){
            System.out.println("\n PROJETO VENCEDOR \n CPF: " + projetos[0].CPF +"\n LINK: " + projetos[0].link);
        }

        if (projetos[0].media == projetos[1].media && projetos[0].media != projetos[2].media){
            System.out.println("Diretor de marketing, dois projetos estão empatados com a média: " + projetos[0].media + ". Qual será seu voto de minerva ?");
            System.out.println("1 - Projeto referente ao CPF: " + projetos[0].CPF + " e link: " + projetos[0].link + ".");
            System.out.println("2 - Projeto referente ao CPF: " + projetos[1].CPF + " e link: " + projetos[1].link + ".");
            System.out.println("Digite o número referente a sua escolha: ");
            escolha_empate = sc.nextInt();
            if(escolha_empate == 1){
                System.out.println("\n PROJETO VENCEDOR \n CPF: " + projetos[0].CPF +"\n LINK: " + projetos[0].link);
            }
            if(escolha_empate == 2){
                System.out.println("\n PROJETO VENCEDOR \n CPF: " + projetos[1].CPF +"\n LINK: " + projetos[1].link);
            }
        }

        if(projetos[0].media == projetos[1].media && projetos[0].media == projetos[2].media){
            System.out.println("Diretor de marketing, os três projetos estão empatados com a média: " + projetos[0].media + " Qual será seu voto de minerva ?");
            System.out.println("1 - Projeto referente ao CPF: " + projetos[0].CPF + " e link: " + projetos[0].link + ".");
            System.out.println("2 - Projeto referente ao CPF: " + projetos[1].CPF + " e link: " + projetos[1].link + ".");
            System.out.println("3 - Projeto referente ao CPF: " + projetos[2].CPF + " e link: " + projetos[2].link + ".");
            System.out.println("Digite o número referente a sua escolha: ");
            escolha_empate = sc.nextInt();
            if(escolha_empate == 1){
                System.out.println("\n PROJETO VENCEDOR \n CPF: " + projetos[0].CPF +"\n LINK: " + projetos[0].link);
            }
            if(escolha_empate == 2){
                System.out.println("\n PROJETO VENCEDOR \n CPF: " + projetos[1].CPF +"\n LINK: " + projetos[1].link);
            }
            if(escolha_empate == 3){
                System.out.println("\n PROJETO VENCEDOR \n CPF: " + projetos[2].CPF +"\n LINK: " + projetos[2].link);
            }
        }

        sc.close();
    }
}