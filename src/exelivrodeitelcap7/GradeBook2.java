/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

/**
 *
 * @author Diogo
 */
public class GradeBook2 {

    private String courseName; //nome do curso que este livro de notas representa
    private int[][] grades; //array bidimensional de notas

    //construtor de dois argumentos inicializa nome e array
    public GradeBook2(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    //metodo set para configurar nome do curso
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //metodo que recupera o nome do curso
    public String getCourseName() {
        return courseName;
    }

    //metodo que realiza varias operacoes nos dados
    public void processGrades() {

        //gera saida de array de notas
        outputGrades();

        //chama metodos getMinimum e getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is", getMinimum(), "Highest grade in the grade book is", getMaximum());

        //gera a saida de grafico de distribuicao de notas de todas as notas em todos os testes
        outputBarchart();
    }

    //localiza nota minima
    public int getMinimum() {
        int lowGrade = grades[0][0]; // supoe que o 1 linha 1 coluna tem o menor valor

        //faz loop no array bidimensional e compara cada nota com a suposicao acima e altera para a menor nota encontrada
        for (int[] studentGrades : grades) { // loop nas linhas
            for (int grade : studentGrades) { // loop pelas colunas
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    //localiza nota maxima com o mesmo principio utilizado para localizar nota minima
    public int getMaximum() {
        int highGrade = grades[0][0];
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade > highGrade) {
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    //determina a media do conjunto particular de notas
    public double getAverage(int[] setOfGrades) {
        int total = 0;

        //soma notas de um aluno
        for (int grade : setOfGrades) {
            total += grade;
        }
        return (double) total / setOfGrades.length;
    }

    //gera saida do grafico de barras para exibir distribuicao total de notas
    public void outputBarchart() {
        System.out.println("Overall grade distribution");

        //armazena frequencia de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                ++frequency[grade / 10];
            }
        }
        //para cada frequencia de notas imprime o grafico   
        for (int count = 0; count < frequency.length; count++) {
            //gera saida do rotulo de barra
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }
            //imprime a barra de asterisco
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.printf("              "); // alinha titulos de coluna

        //cria rotulo de coluna para cada um dos teste
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d ", test + 1);
        }
        System.out.println("Average"); // titulo da coluna de media do aluno
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);
            for (int test : grades[student]) { // gera saida de nota dos alunos
                System.out.printf("%8d", test);
            }

            //chama metodo getAverage para calcular media do aluno
            //chama linha de notas como o argumento para getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }

    }
}
