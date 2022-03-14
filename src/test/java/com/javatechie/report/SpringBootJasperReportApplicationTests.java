package com.javatechie.report;

import com.javatechie.report.service.DynamicReportService;
import net.sf.jasperreports.engine.JRException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJasperReportApplicationTests {

    @Test
    void contextLoads() throws JRException {

        DynamicReportService dynamicReport = new DynamicReportService();
        dynamicReport.generateReport();

    }


}
