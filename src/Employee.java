import java.util.Objects;

public class Employee {

    private String name;
    private int unit;
    private int salary;

    private int id;

    private static int counter = 0;


    public Employee(String name, int unit, int salary) {
        this.name = name;
        this.unit = unit;
        this.salary = salary;
        this.id = counter++;

    }

    public String getName() {
        return this.name;
    }

    public int getUnit() {
        return this.unit;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return
                "Сотрудник: " + name +
                        ", отдел: " + unit +
                        ", размер заработной платы: " + salary +
                        ", id=" + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return unit == employee.unit && salary == employee.salary && id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, unit, salary, id);
    }
}

