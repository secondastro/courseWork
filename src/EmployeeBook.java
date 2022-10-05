public class EmployeeBook {
    private Employee[] empls = new Employee[10];

    public void printAll() {
        for (Employee s : empls) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

        public void printAllNames () {
            for (Employee value : empls) {
                System.out.println(value.getName());
            }
        }

        public int salarySum () {
            int sum = 0;
            for (Employee value : empls) {
                sum += value.getSalary();
            }
            return sum;
        }

        public void minSalary () {
            int min = Integer.MAX_VALUE;
            for (Employee value : empls) {
                if (value.getSalary() < min) {
                    min = value.getSalary();
                }
            }
            for (Employee value : empls) {
                if (min == value.getSalary()) {
                    System.out.println("Сотрудник " + value.getName() + " получает минимальную заработную плату: " + value.getSalary() + " рублей");
                }
            }
        }

        public void maxSalary () {
            int max = Integer.MIN_VALUE;
            for (Employee value : empls) {
                if (value.getSalary() > max) {
                    max = value.getSalary();
                }
            }
            for (Employee value : empls) {
                if (max == value.getSalary()) {
                    System.out.println("Сотрудник " + value.getName() + " получает максимальную заработную плату: " + value.getSalary() + " рублей");
                }
            }
        }

        public String avgSalary () {
            double avgSalary = salarySum() * 1.0 / empls.length;
            String averageSalary = String.format("%.2f", avgSalary);
            return averageSalary;
        }

        public void toIndexSalary ( int percentIncrease){
            for (Employee value : empls) {
                value.setSalary(value.getSalary() + value.getSalary() * percentIncrease / 100);
            }
        }

        public void minSalaryByUnit ( int unit){
            int min = Integer.MAX_VALUE;
            for (Employee value : empls) {
                if (value.getUnit() == unit && min > value.getSalary()) {
                    min = value.getSalary();
                }
            }
            for (Employee value : empls) {
                if (value.getUnit() == unit && min == value.getSalary()) {
                    System.out.println("Сотрудник " + value.getName() + " получает минимальную зарплату в отделе " + value.getUnit() + ": " + value.getSalary() + " рублей");
                }
            }
        }

        public void maxSalaryByUnit ( int unit){
            int max = Integer.MIN_VALUE;
            for (Employee value : empls) {
                if (value.getUnit() == unit && max < value.getSalary()) {
                    max = value.getSalary();
                }
            }
            for (Employee value : empls) {
                if (value.getUnit() == unit && max == value.getSalary()) {
                    System.out.println("Сотрудник " + value.getName() + " получает максимальную зарплату в отделе " + value.getUnit() + ": " + value.getSalary() + " рублей");
                }
            }
        }

        public int salarySumByUnit ( int unit){
            int sum = 0;
            for (Employee value : empls) {
                if (value.getUnit() == unit) {
                    sum += value.getSalary();
                }
            }
            return sum;
        }

        public String avgSalaryByUnit ( int unit){
            double avgSalary = 0.0;
            int menInUnit = 0;
            for (Employee value : empls) {
                if (value.getUnit() == unit) {
                    avgSalary += value.getSalary();
                    menInUnit++;
                }
            }
            avgSalary = avgSalary / menInUnit;
            String averageSalary = String.format("%.2f", avgSalary);
            return averageSalary;
        }

        public void toIndexSalaryUnit ( int percentIncrease, int unit){
            for (Employee value : empls) {
                if (value.getUnit() == unit) {
                    value.setSalary(value.getSalary() + value.getSalary() * percentIncrease / 100);
                }
            }
        }

        public void printUnit ( int unit){
            for (Employee value : empls) {
                if (value.getUnit() == unit) {
                    System.out.println("Сотрудник: " + value.getName() + ", размер заработной платы: " + value.getSalary());
                }
            }
        }

        public void salaryLessThan ( int threshold){
            for (Employee value : empls) {
                if (value.getSalary() < threshold) {
                    System.out.println(value);
                }
            }
        }

        public void salaryMoreThan ( int threshold){
            for (Employee value : empls) {
                if (value.getSalary() > threshold) {
                    System.out.println(value);
                }
            }
        }

        public void addEmployee (String name,int unit, int salary){
            for (int i = 0; i < empls.length; i++) {
                if (empls[i] == null) {
                    empls[i] = new Employee(name, unit, salary);
                    break;
                }
            }
        }

        public void removeEmployee (String name){
            for (int i = 0; i < empls.length; i++) {
                if (name.equals(empls[i].getName())) {
                    empls[i] = null;
                    break;
                }
            }
        }

        public void editSalary (String name,int salary){
            for (Employee empl : empls) {
                if (empl == null) {
                    continue;
                }
                if (name.equals(empl.getName())) {
                    empl.setSalary(salary);
                    break;
                }
            }
        }

        public void editUnit (String name,int unit){
            for (Employee empl : empls) {
                if (empl == null) {
                    continue;
                }
                if (name.equals(empl.getName())) {
                    empl.setUnit(unit);
                    break;
                }
            }
        }

        public void printUnits () {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Отдел " + i + ": ");
                for (int j = 0; j < empls.length; j++) {
                    if (empls[j] == null) {
                        continue;
                    }
                    if (i == empls[j].getUnit()) {
                        System.out.println(empls[j].getName());

                    }
                }
                System.out.println();
            }
        }
    }
