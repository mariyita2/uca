package com.example.alberto.guiaextra.Datos;

import com.example.alberto.guiaextra.Modelos.Student;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by marioperezt on 10/11/17.
 */

public class StudentsData {

    public static List<Student> getData(){
        List<Student> result = new ArrayList<>();
        result.add(new Student("Juan","Desarrollo Moviles I",50));
        result.add(new Student("María","Desarrollo Moviles I",65));
        result.add(new Student("Pablo","Desarrollo Moviles I",77));
        result.add(new Student("Luis","Desarrollo Moviles I",88));
        result.add(new Student("Rene","Desarrollo Moviles I",90));
        result.add(new Student("Jason","Desarrollo Moviles I",60));
        result.add(new Student("Freddy","Desarrollo Moviles I",100));
        result.add(new Student("Oscar","Desarrollo Moviles I",72));
        result.add(new Student("Carlos","Desarrollo Moviles I",99));
        result.add(new Student("Omar","Desarrollo Moviles I",30));
        return result;
    }
}
