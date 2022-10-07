public class Main {


    public static void main(String[] args) {

        EmployeeBook ebook = new EmployeeBook();
        ebook.addEmployee("Михаил Павлович Терентьев", 1, 27589);
        ebook.addEmployee("Наталья Петровна Морская-Пехота", 5, 36845);
        ebook.addEmployee("Игорь Николаевич Малинов", 4, 15000);
        ebook.addEmployee("Леонид Аркадьевич Якубович", 2, 100000);
        ebook.addEmployee("Аркадий Леонидович Яквадратыч", 5, 100000);
        ebook.addEmployee("Семён Семёнович Семенович", 1, 56000);
        ebook.addEmployee("Мария Леопольдовна Вяземская", 3, 99900);
        ebook.addEmployee("Антон Азаматович Дорохов", 1, 15000);
        ebook.addEmployee("Любовь Александровна Успенская", 2, 77700);
        ebook.addEmployee("Елена Макаровна Кука", 5, 36800);

        ebook.printAll();
        System.out.println();
        System.out.println("Ежемесячные расходы на заработную плату сотрудников: " + ebook.salarySum() + " рублей");
        System.out.println();
        ebook.minSalary();
        System.out.println();
        ebook.maxSalary();
        System.out.println();
        System.out.println("Средняя заработная плата: " + ebook.avgSalary() + " рублей");
        System.out.println();
        ebook.printAllNames();
        System.out.println();
        ebook.toIndexSalary(3);
        ebook.printAll();
        System.out.println();
        ebook.minSalaryByUnit(2);
        System.out.println();
        ebook.maxSalaryByUnit(5);
        System.out.println();
        System.out.println("Ежемесячные расходы на заработную плату сотрудников отдела 4: " + ebook.salarySumByUnit(4) + " рублей");
        System.out.println();
        System.out.println("Средняя заработная плата по отделу 1: " + ebook.avgSalaryByUnit(1) + " рублей");
        System.out.println();
        ebook.toIndexSalaryUnit(5, 2);
        ebook.printUnit(2);
        System.out.println();
        ebook.salaryMoreThan(100000);
        System.out.println();
        ebook.salaryLessThan(30000);
        System.out.println();
        ebook.removeEmployee("Игорь Николаевич Малинов");
        ebook.printAll();
        System.out.println();
        ebook.editSalary("Семён Семёнович Семенович", 60000);
        ebook.editUnit("Семён Семёнович Семенович",4);
        ebook.printAll();
        System.out.println();
        ebook.printUnits();

    }
}



