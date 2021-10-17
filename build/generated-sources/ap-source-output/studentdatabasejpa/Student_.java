package studentdatabasejpa;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-10-17T22:21:26")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, BigDecimal> gpa;
    public static volatile SingularAttribute<Student, Integer> id;

}