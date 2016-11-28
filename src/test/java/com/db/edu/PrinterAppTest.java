package com.db.edu;

//TODO Refactor to OOP testable design.
public class PrinterAppTest {
    public void shouldPrintWhenNormalFlowStringParameter() {
        EtlApp sut = new EtlApp();
        sut.main();
    }
}
