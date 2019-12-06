package by.bsuir.factory.impl;

import by.bsuir.entity.BudgetStudent;
import by.bsuir.entity.EducationForm;
import by.bsuir.entity.PaidStudent;
import by.bsuir.entity.Student;
import by.bsuir.factory.StudentFactoryMethod;

//SINGLETON
public class StudentFactoryMethodImpl implements StudentFactoryMethod {

    private static final StudentFactoryMethodImpl instance = new StudentFactoryMethodImpl();

    public static StudentFactoryMethodImpl getInstance() {
        return instance;
    }

    private StudentFactoryMethodImpl() {

    }

    /////////////////////////////////////

    @Override
    public Student createStudent(EducationForm educationForm) {
        switch (educationForm) {
            case PAID:
                return new PaidStudent();
            case BUDGET:
                return new BudgetStudent();
            default:
                return null;
        }
    }
}
