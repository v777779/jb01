package ch20.ex03.codea.dbase;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@DBTable(name = "MEMBER")  // аннотация на уровне класса задано имя DB
public class Member {
    @SQLString(30)      // по умолчанию  значение присваивается параметру value()
    String firstName;   // в случае если в скобках значение для одного параметра
    @SQLString(50)      // в аннотации задается размер поля, name = ""
    String lastName;
    @SQLInteger        // здесь только name = ""
    Integer age;
    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handle;     // здесь задано что это поле является индексом
    static int memberCount;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return handle;
    }

}
