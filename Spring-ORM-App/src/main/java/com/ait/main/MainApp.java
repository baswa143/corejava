    package com.ait.main;

    import com.ait.config.AppConfig;
    import com.ait.entity.Employee;
    import com.ait.service.EmpService;
    import org.springframework.context.ApplicationContext;
    import org.springframework.context.annotation.AnnotationConfigApplicationContext;

    public class MainApp {
        public static void main(String[] args) {
            Employee e = new Employee();
            e.setEmpId(105);
            e.setEmpName("Rushi");
            e.setEmpSalary(12000.0);

            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            EmpService es =context.getBean(EmpService.class);
            es.saveEmployee(e);

        }
    }
