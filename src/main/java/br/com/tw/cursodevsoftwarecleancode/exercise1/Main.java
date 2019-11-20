package br.com.tw.cursodevsoftwarecleancode.exercise1;

public class Main {

    public static void main(String[] args) {
        Project project = new Project();
        //Seta Dias restantes para o fim do projeto
        project.setDiresfipro(80);
        project.setEntregue(false);

        String result = checkProject(project);

        //Print result
        System.out.println("Resultado do projeto: " + result);
    }

    private static String checkProject(Project project) {
        //Dias restantes para o fim do projeto
        int diresfipro = project.getDiresfipro();

        if (diresfipro == -1) {
            return "Não falta nenhum dia para o fim do projeto";
        }

        if (diresfipro < 90 && !project.isEntregue()) {
            return "O projeto está apertado.";
        } else {
            return null;
        }
    }

}
