package by.bsuir.starter;

import by.bsuir.builder.impl.PaidStudentBuilderImpl;
import by.bsuir.entity.EducationForm;
import by.bsuir.entity.Student;
import by.bsuir.factory.impl.StudentFactoryMethodImpl;

public class Main {

    public static void main(String[] args) {
        StudentFactoryMethodImpl factoryMethod = StudentFactoryMethodImpl.getInstance();
        Student student = factoryMethod.createStudent(EducationForm.BUDGET);
        System.out.println(student.getClass());
        //
        student = factoryMethod.createStudent(EducationForm.PAID);
        System.out.println(student.getClass());
        //
        student = new PaidStudentBuilderImpl("1")
                .withName("Глеб")
                .withSurname("Скачко")
                .withPatronymic("Дмитриевич")
                .withEmail("skachko42@gmail.com")
                .withAverageRate(7)
                .build();
        System.out.println(student);
        //
    }
}
