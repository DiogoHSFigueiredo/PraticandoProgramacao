package exelivrodeitelcap17;

/**
 *
 * @author Diogo
 */
public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private String department;

    //construtor
    public Employee(String firstName, String lastName, double salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    //configura firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //obtem firstName
    public String getFirstName() {
        return firstName;
    }

    // configura lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //obtem lastName
    public String getLastName() {
        return lastName;
    }

    //configura o salario
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //obtem salario
    public double getSalary() {
        return salary;
    }

    //configura departamento
    public void setDepartment(String department) {
        this.department = department;
    }

    //obtem departamento
    public String getDepartment() {
        return department;
    }

    //retorna o nome e o sobrenome do empregado combinados
    public String getName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    //retorna uma String contendo informacoes do Employee
    @Override
    public String toString() {
        return String.format("%-8s %-8s %8.2f   %s", getFirstName(), getLastName(), getSalary(), getDepartment());
    } //fim do metodo toString
}//fim da classe Employee
