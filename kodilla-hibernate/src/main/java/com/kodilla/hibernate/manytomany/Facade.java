package com.kodilla.hibernate.manytomany;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class Facade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> retrieveCompanyWithFragmentFacade( String fragment ){
        return companyDao.retrieveCompanyWithFragment("%" + fragment + "%");
    }
    public List<Employee> retrieveEmployeeWithFragmentFacade(String fragment){
        return employeeDao.retrieveEmployeeWithFragment("%" + fragment + "%");
    }
}