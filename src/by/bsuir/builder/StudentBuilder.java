package by.bsuir.builder;

import by.bsuir.entity.Student;

public interface StudentBuilder {

    StudentBuilder withName(String documentType);

    StudentBuilder withSurname(String documentName);

    StudentBuilder withPatronymic(String documentAuthor);

    StudentBuilder withEmail(String documentAddress);

    StudentBuilder withAverageRate(int shelfLife);

    Student build();
}
