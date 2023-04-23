package service;


import com.example.employee.AspectApplication;
import com.example.employee.dto.EmployeeListResult;
import com.example.employee.service.ContracterEmployeeService;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import catagories.DiagnosticReport;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Collections;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;


@SpringBootTest
@SpringJUnitConfig
@ContextConfiguration(classes = AspectApplication.class)
public class ContractEmployeeServiceTest {


    @Mock
    ContracterEmployeeService contracterEmployeeService;

    @BeforeEach
    public void init(){

    }
    @Test()
   public void CES_01_ShouldReturnResults(){
        when(contracterEmployeeService.getListOfEmployees()).thenReturn(new EmployeeListResult(Collections.EMPTY_LIST,0));
        var result=contracterEmployeeService.getListOfEmployees();
        assertThat(result).isNotNull();
    }

    @Test()
    public void CES_02_ShouldReturnResults(){
        when(contracterEmployeeService.getListOfEmployees()).thenReturn(null);
        var result=contracterEmployeeService.getListOfEmployees();
        assertThat(result).isNull();
    }

    @Test()
    public void CES_03_ShouldReturnResults(){
        when(contracterEmployeeService.getListOfEmployees()).thenReturn(null);
        var result=contracterEmployeeService.getListOfEmployees();
        assertThat(result).isNull();
    }

    @Test()
    public void CES_04_ShouldReturnResults(){
        when(contracterEmployeeService.getListOfEmployees()).thenReturn(new EmployeeListResult(Collections.EMPTY_LIST,0));
        var result=contracterEmployeeService.getListOfEmployees();
        assertThat(result).isNotNull();
    }

    @Test()
    public void CES_015_ShouldReturnResults(){
        when(contracterEmployeeService.getListOfEmployees()).thenReturn(new EmployeeListResult(Collections.EMPTY_LIST,0));
        var result=contracterEmployeeService.getListOfEmployees();
        assertThat(result).isNotNull();
    }

    @Test()
    public void CES_025_ShouldReturnResults(){
        when(contracterEmployeeService.getListOfEmployees()).thenReturn(null);
        var result=contracterEmployeeService.getListOfEmployees();
        assertThat(result).isNull();
    }

    @Test()
    public void CES_09_ShouldReturnResults(){
        when(contracterEmployeeService.getListOfEmployees()).thenReturn(null);
        var result=contracterEmployeeService.getListOfEmployees();
        assertThat(result).isNull();
    }

    @Test()
    public void CES_08_ShouldReturnResults(){
        when(contracterEmployeeService.getListOfEmployees()).thenReturn(new EmployeeListResult(Collections.EMPTY_LIST,0));
        var result=contracterEmployeeService.getListOfEmployees();
        assertThat(result).isNotNull();
    }
}
