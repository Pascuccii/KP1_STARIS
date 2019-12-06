package by.bsuir.entity;

public class PaidStudent extends Student {
    public PaidStudent() {
    }

    public PaidStudent(String id) {
        super(id);
    }

    public PaidStudent(String id, String name, String surname, String patronymic, String email, int averageRate) {
        super(id, name, surname, patronymic, email, averageRate);
    }


}
