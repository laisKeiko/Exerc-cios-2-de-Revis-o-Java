package atividade um professor;
public class Main  {
    public static void main(String[] args) {
        Membro membro = new Membro("Laís Keiko", "BP3011356");
        Membro membro2 = new Membro("Rita Costa", "BP2012467");

        Comissao comissao = new Comissao(10);

        System.out.println("\nTestando método toString():");
        System.out.println(membro.toString());
        System.out.println(membro2.toString());

        comissao.adicionarMembro(membro);
        
        System.out.println("\nListando membros da comissão:");
        comissao.listarMembros();

        System.out.println("\nPesquisando membros: ");
        comissao.pesquisarMembro("Laís Keiko");
        comissao.pesquisarMembro("Rita Costa");
    }
}