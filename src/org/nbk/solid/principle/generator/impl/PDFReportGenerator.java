package org.nbk.solid.principle.generator.impl;

import org.nbk.solid.principle.converter.ReportConverter;
import org.nbk.solid.principle.generator.ReportGenerator;
import org.nbk.solid.principle.model.Customer;

public class PDFReportGenerator implements ReportGenerator, ReportConverter {

    @Override
    public void printReport(Customer customer) {
	System.out.println("PDF REPORT");

    }

    @Override
    public void convertFile(Customer customer) {

    }

}
