package StructuralDP.Composite;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDirectorate extends Department{

    List<Department> childDepartments;

    // childDepartment'lari parametre olarak alan constructor
    public RegionalDirectorate ( List<Department> childDepartments){
        this.childDepartments=childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream()
                .map(Department::getName)
                .collect(Collectors.joining(", "));
        // joining --> akistaki ifadeleri birlestirip String dondurur
    }

    @Override
    List<String> getEmployees() {
        return childDepartments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .collect(Collectors.toList());

        // flatmap stream'i baska bir stream'e cevirmek icin kullanilir
        // Bir giren degere karsilik birden fazla deger olabilir
    }
}
