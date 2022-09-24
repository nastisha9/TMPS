package OCP;

public enum TypeEmployee {

    BACKEND {
        @Override
        Salary calculateNetSalary(double grossSalary) {

            return new BackEndSalary(grossSalary);
        }
    },

    FRONTEND {
        @Override
        Salary calculateNetSalary(double grossSalary) {

            return new FrontEndSalary(grossSalary);
        }
    };

    abstract Salary calculateNetSalary(double grossSalary);
}
