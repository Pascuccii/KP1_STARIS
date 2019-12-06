package by.bsuir.factory;

import by.bsuir.entity.EducationForm;
import by.bsuir.entity.Student;

public interface StudentFactoryMethod {
    Student createStudent(EducationForm educationForm);
}
