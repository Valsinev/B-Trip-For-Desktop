package org.example;

import org.example.constants.ErrorMessage;
import org.example.constants.TextConstants;
import org.example.engine.BusinessTripForm;
import org.example.engine.TripTypeSelector;
import org.example.utillity.BTripGetDaysFromCheckboxesOrFields;
import org.example.utillity.FieldValidator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Form implements ActionListener, BusinessTripForm {
    public JLabel numberDocumentsLabel;
    public JTextField numberDocumentsField;
    JFrame frame;
    JLabel fullNameLabel;
    public JTextField fullNameField;
    JLabel personalNLabel;
    public JTextField personalNField;
    JLabel positionLabel;
    public JTextField positionField;
    ButtonGroup isTravelWYV;
    JPanel vehiclePanel;

    private JLabel modelLabel;
    public JTextField modelField;

    private JLabel makeLabel;
    public JTextField makeField;

    JLabel vehPanelTextLabel;
    JLabel vehCategoryLabel;
    public JTextField vehCategoryField;
    JLabel vehRegNLabel;
    public JTextField vehRegNField;
    JLabel costBy100Label;
    public JTextField costBy100Field;
    JLabel fuelTypeLabel;
    public JTextField fuelTypeField;
    JLabel fuelPriceLabel;
    public JTextField fuelPriceField;
    JLabel kilometersLabel;
    public JTextField kilometersField;

    JLabel startDestinationLabel;
    public JTextField startDestinationField;
    JLabel endDestinationLabel;
    public JTextField endDestinationField;
    JLabel numberOfDaysLabel;
    public JTextField numberOfDaysField;
    JLabel monthLabel;
    public JTextField monthField;
    JLabel yearLabel;
    public JTextField yearField;
    JLabel branchInLabel;
    public JTextField branchInField;
    JLabel reasonLabel;
    public JTextField reasonField;
    JLabel employerLabel;
    public JTextField employerField;
    JLabel tripsThisMonthLabel;
    public JTextField tripsThisMonthField;
    JPanel isNightStayPanel;
    JLabel isNightStayLabel;
    public JRadioButton isNightStayYes;
    public JRadioButton isNightStayNo;

    public JRadioButton isTravelWithYourVehicle;
    public JRadioButton isNotTravelWithYourVehicle;

    /* NO LONGER NEEDED
    @Deprecated
    private final JPanel otherTransportPanel;

    @Deprecated
    private final ButtonGroup isTravelWOT;
    @Deprecated
    JLabel isTravelWithOtherTransportLabel;
    @Deprecated
    private JRadioButton isTravelWithOtherTransport;
    @Deprecated
    private final JRadioButton isNotTravelWithOtherTransport;
    @Deprecated
    JLabel otherTransportExpensesLabel;
    @Deprecated
    private JTextField otherTransportExpenses;
     */
    ButtonGroup isNightStayGroup;

    public JCheckBox isTravelOnFirstDay;
    public JCheckBox isTravelOnLastDay;
    JLabel nightStayPriceLabel;
    public JTextField nightStayPriceField;
    JLabel numberOFNightStayLabel;
    public JTextField numberOFNightStayField;
    JLabel fromWhichDayLabel;
    public JTextField fromWhichDayField;
    JLabel toWhichDayLabel;
    public JTextField toWhichDayField;

    JPanel whichDaysPanel;
    JLabel whichDaysLabel;
    JTextField whichDaysField;

    /*
    @Deprecated
    JLabel addExpensesLabel;
    @Deprecated
    public JTextField addExpensesField;
     */

    JCheckBox day1;
    public JCheckBox day2;
    public JCheckBox day3;
    public JCheckBox day4;
    public JCheckBox day5;
    public JCheckBox day6;
    public JCheckBox day7;
    public JCheckBox day8;
    public JCheckBox day9;
    public JCheckBox day10;
    public JCheckBox day11;
    public JCheckBox day12;
    public JCheckBox day13;
    public JCheckBox day14;
    public JCheckBox day15;
    public JCheckBox day16;
    public JCheckBox day17;
    public JCheckBox day18;
    public JCheckBox day19;
    public JCheckBox day20;
    public JCheckBox day21;
    public JCheckBox day22;
    public JCheckBox day23;
    public JCheckBox day24;
    public JCheckBox day25;
    public JCheckBox day26;
    public JCheckBox day27;
    public JCheckBox day28;
    public JCheckBox day29;
    public JCheckBox day30;
    public JCheckBox day31;
    public JButton button;


    public Form() {
        button = new JButton(TextConstants.BUTTON_MESSAGE);
        frame = new JFrame("Business Trip");
        fullNameLabel = new JLabel(TextConstants.FULL_NAMES);
        fullNameField = new JTextField();
        personalNLabel = new JLabel(TextConstants.PERSONAL_NUMBER);
        personalNField = new JTextField();
        positionLabel = new JLabel(TextConstants.POSITION);
        positionField = new JTextField();
        numberDocumentsLabel = new JLabel(TextConstants.NUMBER_OF_DOCUMENTS);
        numberDocumentsField = new JTextField();
        isTravelWYV = new ButtonGroup();
        vehPanelTextLabel = new JLabel("Пътуване с ЛМПС?");
        makeLabel = new JLabel(Labels.MAKE);
        makeField = new JTextField();
        modelLabel = new JLabel(Labels.MODEL);
        modelField = new JTextField();
        vehCategoryLabel = new JLabel(TextConstants.VEHICLE_CATEGORY);
        vehCategoryField = new JTextField();
        vehRegNLabel = new JLabel(TextConstants.VEHICLE_REG_NUMBER);
        vehRegNField = new JTextField();
        costBy100Label = new JLabel(TextConstants.FUEL_COST_BY100);
        costBy100Field = new JTextField();
        fuelTypeLabel = new JLabel(TextConstants.FUEL_TYPE);
        fuelTypeField = new JTextField();
        fuelPriceLabel = new JLabel(TextConstants.FUEL_PRICE);
        fuelPriceField = new JTextField();
        kilometersLabel = new JLabel(TextConstants.KILOMETERS);
        kilometersField = new JTextField();
        startDestinationLabel = new JLabel(TextConstants.START_DESTINATION);
        startDestinationField = new JTextField();
        endDestinationLabel = new JLabel(TextConstants.END_DESTINATION);
        endDestinationField = new JTextField();
        numberOfDaysLabel = new JLabel(TextConstants.DAYS_IN_BUSINESS_TRIP);
        numberOfDaysField = new JTextField();
        monthLabel = new JLabel(TextConstants.MONTH_OF_BUSINESS_TRIP);
        monthField = new JTextField();
        yearLabel = new JLabel(TextConstants.YEAR);
        yearField = new JTextField();
        branchInLabel = new JLabel(TextConstants.BRANCH_IN_BUSINESS_TRIP);
        branchInField = new JTextField();
        reasonLabel = new JLabel(TextConstants.REASON);
        reasonField = new JTextField();
        employerLabel = new JLabel(TextConstants.NAME_OF_HEAD_PERSON);
        employerField = new JTextField();
        tripsThisMonthLabel = new JLabel(TextConstants.BUSINESS_TRIPS_THIS_MONTH);
        tripsThisMonthField = new JTextField();
        isNightStayPanel = new JPanel();
        isNightStayLabel = new JLabel(TextConstants.IS_NIGHTSTAY_INCLUDED);
        isNightStayYes = new JRadioButton(TextConstants.YES);
        isNightStayNo = new JRadioButton(TextConstants.NO);

        isTravelWYV = new ButtonGroup();
        isTravelWithYourVehicle = new JRadioButton(TextConstants.YES);
        isNotTravelWithYourVehicle = new JRadioButton(TextConstants.NO);

        /* NO LONGER NEEDED
        otherTransportPanel = new JPanel();
        isTravelWOT = new ButtonGroup();
        isTravelWithOtherTransportLabel = new JLabel("С Друг Транспорт?");
        isTravelWithOtherTransport = new JRadioButton(TextConstants.YES);
        isNotTravelWithOtherTransport = new JRadioButton(TextConstants.NO);
        otherTransportExpensesLabel = new JLabel("<html>Разгоди за друг<br/>транспорт:</html>");
        otherTransportExpenses = new JTextField();

         */

        isTravelOnFirstDay = new JCheckBox(TextConstants.IS_THERE_TRAVEL_ON_FIRST_DAY);
        isTravelOnLastDay = new JCheckBox(TextConstants.IS_THERE_TRAVEL_ON_LAST_DAY);
        isNightStayGroup = new ButtonGroup();

        nightStayPriceLabel = new JLabel(TextConstants.NIGHTSTAY_PRICE);
        nightStayPriceField = new JTextField();

        numberOFNightStayLabel = new JLabel(TextConstants.NUMBER_OF_NIGHTSTAY);
        numberOFNightStayField = new JTextField();
        fromWhichDayLabel = new JLabel(Labels.FROM_WHICH_DATE);
        fromWhichDayField = new JTextField();
        toWhichDayLabel = new JLabel(Labels.TO_WHICH_DATE);
        toWhichDayField = new JTextField();

        whichDaysPanel = new JPanel();
        whichDaysLabel = new JLabel(TextConstants.WHICH_DAYS);
        whichDaysField = new JTextField();

        /* NO LONGER NEEDED
        addExpensesLabel = new JLabel(TextConstants.ADDEXPENCES);
        addExpensesField = new JTextField();
         */



        day1 = new JCheckBox("1");
        day2 = new JCheckBox("2");
        day3 = new JCheckBox("3");
        day4 = new JCheckBox("4");
        day5 = new JCheckBox("5");
        day6 = new JCheckBox("6");
        day7 = new JCheckBox("7");
        day8 = new JCheckBox("8");
        day9 = new JCheckBox("9");
        day10 = new JCheckBox("10");
        day11 = new JCheckBox("11");
        day12 = new JCheckBox("12");
        day13 = new JCheckBox("13");
        day14 = new JCheckBox("14");
        day15 = new JCheckBox("15");
        day16 = new JCheckBox("16");
        day17 = new JCheckBox("17");
        day18 = new JCheckBox("18");
        day19 = new JCheckBox("19");
        day20 = new JCheckBox("20");
        day21 = new JCheckBox("21");
        day22 = new JCheckBox("22");
        day23 = new JCheckBox("23");
        day24 = new JCheckBox("24");
        day25 = new JCheckBox("25");
        day26 = new JCheckBox("26");
        day27 = new JCheckBox("27");
        day28 = new JCheckBox("28");
        day29 = new JCheckBox("29");
        day30 = new JCheckBox("30");
        day31 = new JCheckBox("31");


        fullNameLabel.setBounds(10, 0, 200, 20);
        fullNameLabel.setForeground(Color.WHITE);
        fullNameField.setBounds(10, 20, 200, 20);
        fullNameField.addActionListener(this);

        personalNLabel.setBounds(10, 40, 200, 20);
        personalNLabel.setForeground(Color.WHITE);
        personalNField.setBounds(10, 60, 200, 20);
        personalNField.addActionListener(this);

        positionLabel.setBounds(10, 80, 90, 20);
        positionLabel.setForeground(Color.WHITE);
        positionField.setBounds(10, 100, 200, 20);
        positionField.addActionListener(this);

        numberDocumentsLabel.setBounds(10, 120, 200, 20);
        numberDocumentsLabel.setForeground(Color.WHITE);
        numberDocumentsField.setBounds(10, 140, 200, 20);
        numberDocumentsField.addActionListener(this);

        startDestinationLabel.setBounds(220, 0, 200, 20);
        startDestinationLabel.setForeground(Color.WHITE);
        startDestinationField.setBounds(220, 20, 215, 20);
        startDestinationField.addActionListener(this);

        endDestinationLabel.setBounds(220, 40, 200, 20);
        endDestinationLabel.setForeground(Color.WHITE);
        endDestinationField.setBounds(220, 60, 215, 20);
        endDestinationField.addActionListener(this);

        numberOfDaysLabel.setBounds(220, 80, 200, 20);
        numberOfDaysLabel.setForeground(Color.WHITE);
        numberOfDaysField.setBounds(220, 100, 215, 20);
        numberOfDaysField.addActionListener(this);

        monthLabel.setBounds(220, 120, 200, 20);
        monthLabel.setForeground(Color.WHITE);
        monthField.setBounds(220, 140, 215, 20);
        monthField.addActionListener(this);

        yearLabel.setBounds(220, 160, 200, 20);
        yearLabel.setForeground(Color.WHITE);
        yearField.setBounds(220, 180, 215, 20);
        yearField.addActionListener(this);

        branchInLabel.setBounds(220, 200, 215, 20);
        branchInLabel.setForeground(Color.WHITE);
        branchInField.setBounds(220, 220, 215, 20);
        branchInField.addActionListener(this);

        reasonLabel.setBounds(220, 240, 200, 20);
        reasonLabel.setForeground(Color.WHITE);
        reasonField.setBounds(220, 260, 215, 20);
        reasonField.addActionListener(this);

        employerLabel.setBounds(220, 282, 200, 25);
        employerLabel.setForeground(Color.WHITE);
        employerField.setBounds(220, 310, 215, 20);
        employerField.addActionListener(this);

        tripsThisMonthLabel.setBounds(220, 332, 105, 30);
        tripsThisMonthLabel.setForeground(Color.WHITE);
        tripsThisMonthField.setBounds(220, 370, 105, 20);
        tripsThisMonthField.addActionListener(this);


        /*
        addExpensesLabel.setBounds(335, 332, 105, 30);
        addExpensesLabel.setForeground(Color.WHITE);
        addExpensesField.setBounds(335,370,100,20);
         */

        isNightStayLabel.setBounds(220, 395, 230, 20);
        isNightStayLabel.setForeground(Color.WHITE);
        isNightStayYes.setBounds(220, 410, 50, 20);
        isNightStayYes.setBackground(new Color(50, 50, 50));
        isNightStayYes.setForeground(Color.WHITE);
        isNightStayYes.addActionListener(this);
        isNightStayNo.setBounds(290, 410, 50, 20);
        isNightStayNo.setSelected(true);
        isNightStayNo.setForeground(Color.WHITE);
        isNightStayNo.setBackground(new Color(50, 50, 50));
        isNightStayNo.addActionListener(this);
        isNightStayGroup.add(isNightStayYes);
        isNightStayGroup.add(isNightStayNo);

        vehPanelTextLabel.setBounds(20, 170, 250, 20);
        vehPanelTextLabel.setForeground(Color.WHITE);

        isTravelWithYourVehicle.setBounds(25, 190, 50, 20);
        isTravelWithYourVehicle.setBackground(new Color(50, 50, 50));
        isTravelWithYourVehicle.setForeground(Color.WHITE);
        isTravelWithYourVehicle.addActionListener(this);

        isNotTravelWithYourVehicle.setBounds(90, 190, 50, 20);
        isNotTravelWithYourVehicle.setBackground(new Color(50, 50, 50));
        isNotTravelWithYourVehicle.setForeground(Color.WHITE);
        isNotTravelWithYourVehicle.addActionListener(this);
        isNotTravelWithYourVehicle.setSelected(true);

        isTravelWYV.add(isTravelWithYourVehicle);
        isTravelWYV.add(isNotTravelWithYourVehicle);

        //other transport section

        /* NO LONGER NEEDED
        otherTransportPanel.setBounds(0, 240, 250, 100);
        otherTransportPanel.setBackground(new Color(50, 50, 50));
        otherTransportPanel.setVisible(false);
        otherTransportPanel.setLayout(null);

        isTravelWithOtherTransportLabel.setBounds(20, 210, 200, 20);
        isTravelWithOtherTransportLabel.setForeground(Color.WHITE);
        isTravelWithOtherTransport.setBounds(25, 230, 50, 20);
        isTravelWithOtherTransport.setBackground(new Color(50, 50, 50));
        isTravelWithOtherTransport.setForeground(Color.WHITE);
        isTravelWithOtherTransport.addActionListener(this);

        isNotTravelWithOtherTransport.setBounds(90, 230, 50, 20);
        isNotTravelWithOtherTransport.setBackground(new Color(50, 50, 50));
        isNotTravelWithOtherTransport.setForeground(Color.WHITE);
        isNotTravelWithOtherTransport.addActionListener(this);
        isNotTravelWithOtherTransport.setSelected(true);

        otherTransportExpensesLabel.setBounds(10, 20, 200, 40);
        otherTransportExpensesLabel.setForeground(Color.WHITE);
        otherTransportExpenses.setBounds(10, 60, 200, 20);
        otherTransportExpenses.addActionListener(this);

        isTravelWOT.add(isTravelWithOtherTransport);
        isTravelWOT.add(isNotTravelWithOtherTransport);

         */
        //end other transport section

        isTravelOnFirstDay.setBounds(0, -5, 200, 20);
        isTravelOnFirstDay.setForeground(Color.WHITE);
        isTravelOnFirstDay.setFocusable(false);
        isTravelOnFirstDay.setBackground(new Color(50, 50, 50));
        isTravelOnFirstDay.setForeground(Color.WHITE);
        isTravelOnFirstDay.addActionListener(this);
        isTravelOnLastDay.setBounds(0, 15, 200, 20);
        isTravelOnLastDay.setFocusable(false);
        isTravelOnLastDay.setForeground(Color.WHITE);
        isTravelOnLastDay.setBackground(new Color(50, 50, 50));
        isTravelOnLastDay.addActionListener(this);

        nightStayPriceLabel.setBounds(0, 35, 200, 20);
        nightStayPriceLabel.setForeground(Color.WHITE);
        nightStayPriceField.setBounds(0, 55, 200, 20);
        nightStayPriceField.addActionListener(this);


        numberOFNightStayLabel.setBounds(0, 75, 200, 20);
        numberOFNightStayLabel.setForeground(Color.WHITE);
        numberOFNightStayField.setBounds(0, 95, 200, 20);
        numberOFNightStayField.addActionListener(this);

        fromWhichDayLabel.setBounds(0, 115, 200, 20);
        fromWhichDayLabel.setForeground(Color.WHITE);
        fromWhichDayField.setBounds(0, 135, 200, 20);
        fromWhichDayField.addActionListener(this);

        toWhichDayLabel.setBounds(0, 155, 200, 20);
        toWhichDayLabel.setForeground(Color.WHITE);
        toWhichDayField.setBounds(0, 175, 200, 20);
        toWhichDayField.addActionListener(this);
//
        whichDaysLabel.setBounds(5, 5, 200, 40);
        whichDaysLabel.setForeground(Color.WHITE);
        ///////////////////////////////Which Days Panel

        //CheckBoxes for days
        day1.setBounds(0, 40, 40, 20);
        day1.addActionListener(this);
        day2.setBounds(40, 40, 40, 20);
        day2.addActionListener(this);
        day3.setBounds(80, 40, 40, 20);
        day3.addActionListener(this);
        day4.setBounds(120, 40, 40, 20);
        day4.addActionListener(this);
        day5.setBounds(160, 40, 40, 20);
        day5.addActionListener(this);
        day6.setBounds(0, 60, 40, 20);
        day6.addActionListener(this);
        day7.setBounds(40, 60, 40, 20);
        day7.addActionListener(this);
        day8.setBounds(80, 60, 40, 20);
        day8.addActionListener(this);
        day9.setBounds(120, 60, 40, 20);
        day9.addActionListener(this);
        day10.setBounds(160, 60, 45, 20);
        day10.addActionListener(this);
        day11.setBounds(0, 80, 45, 20);
        day11.addActionListener(this);
        day12.setBounds(40, 80, 45, 20);
        day12.addActionListener(this);
        day13.setBounds(80, 80, 45, 20);
        day13.addActionListener(this);
        day14.setBounds(120, 80, 45, 20);
        day14.addActionListener(this);
        day15.setBounds(160, 80, 45, 20);
        day15.addActionListener(this);
        day16.setBounds(0, 100, 45, 20);
        day16.addActionListener(this);
        day17.setBounds(40, 100, 45, 20);
        day17.addActionListener(this);
        day18.setBounds(80, 100, 45, 20);
        day18.addActionListener(this);
        day19.setBounds(120, 100, 45, 20);
        day19.addActionListener(this);
        day20.setBounds(160, 100, 45, 20);
        day20.addActionListener(this);
        day21.setBounds(0, 120, 45, 20);
        day21.addActionListener(this);
        day22.setBounds(40, 120, 45, 20);
        day22.addActionListener(this);
        day23.setBounds(80, 120, 45, 20);
        day23.addActionListener(this);
        day24.setBounds(120, 120, 45, 20);
        day24.addActionListener(this);
        day25.setBounds(160, 120, 45, 20);
        day25.addActionListener(this);
        day26.setBounds(0, 140, 45, 20);
        day26.addActionListener(this);
        day27.setBounds(40, 140, 45, 20);
        day27.addActionListener(this);
        day28.setBounds(80, 140, 45, 20);
        day28.addActionListener(this);
        day29.setBounds(120, 140, 45, 20);
        day29.addActionListener(this);
        day30.setBounds(160, 140, 45, 20);
        day30.addActionListener(this);
        day31.setBounds(0, 160, 45, 20);
        day31.addActionListener(this);
        //

        whichDaysPanel.setBounds(220, 440, 200, 200);
        whichDaysPanel.setBackground(new Color(50, 50, 50));
        whichDaysPanel.setLayout(null);
        whichDaysPanel.setVisible(true);
        whichDaysPanel.add(whichDaysLabel);
        whichDaysPanel.add(day1);
        whichDaysPanel.add(day2);
        whichDaysPanel.add(day3);
        whichDaysPanel.add(day4);
        whichDaysPanel.add(day5);
        whichDaysPanel.add(day6);
        whichDaysPanel.add(day7);
        whichDaysPanel.add(day8);
        whichDaysPanel.add(day9);
        whichDaysPanel.add(day10);
        whichDaysPanel.add(day11);
        whichDaysPanel.add(day12);
        whichDaysPanel.add(day13);
        whichDaysPanel.add(day14);
        whichDaysPanel.add(day15);
        whichDaysPanel.add(day16);
        whichDaysPanel.add(day17);
        whichDaysPanel.add(day18);
        whichDaysPanel.add(day19);
        whichDaysPanel.add(day20);
        whichDaysPanel.add(day21);
        whichDaysPanel.add(day22);
        whichDaysPanel.add(day23);
        whichDaysPanel.add(day24);
        whichDaysPanel.add(day25);
        whichDaysPanel.add(day26);
        whichDaysPanel.add(day27);
        whichDaysPanel.add(day28);
        whichDaysPanel.add(day29);
        whichDaysPanel.add(day30);
        whichDaysPanel.add(day31);
        ///////////////////////////////Night stay Panel

        isNightStayPanel.setBackground(new Color(50, 50, 50));
        isNightStayPanel.setBounds(220, 440, 200, 200);
        isNightStayPanel.setVisible(false);
        isNightStayPanel.setLayout(null);
        isNightStayPanel.add(isTravelOnFirstDay);
        isNightStayPanel.add(isTravelOnLastDay);
        isNightStayPanel.add(nightStayPriceLabel);
        isNightStayPanel.add(nightStayPriceField);
        isNightStayPanel.add(numberOFNightStayLabel);
        isNightStayPanel.add(numberOFNightStayField);
        isNightStayPanel.add(fromWhichDayLabel);
        isNightStayPanel.add(fromWhichDayField);
        isNightStayPanel.add(toWhichDayLabel);
        isNightStayPanel.add(toWhichDayField);

        ///////////////////////////////Vehicle Panel

        vehiclePanel = new JPanel();
        vehiclePanel.setBackground(new Color(50, 50, 50));
        vehiclePanel.setBounds(0, 220, 250, 440);
        vehiclePanel.setVisible(false);
        vehiclePanel.setLayout(null);

        frame.add(vehPanelTextLabel);

        makeLabel.setBounds(10, 40, 200, 20);
        makeLabel.setForeground(Color.WHITE);
        makeField.setBounds(10, 60, 200, 20);
        makeField.addActionListener(this);

        modelLabel.setBounds(10, 80, 200, 20);
        modelLabel.setForeground(Color.WHITE);
        modelField.setBounds(10, 100, 200, 20);
        modelField.addActionListener(this);

        vehCategoryLabel.setBounds(10, 120, 150, 20);
        vehCategoryLabel.setForeground(Color.WHITE);
        vehCategoryField.setBounds(10, 140, 200, 20);
        vehCategoryField.addActionListener(this);

        vehRegNLabel.setBounds(10, 160, 250, 20);
        vehRegNLabel.setForeground(Color.WHITE);
        vehRegNField.setBounds(10, 180, 200, 20);
        vehRegNField.addActionListener(this);

        costBy100Label.setBounds(10, 200, 250, 20);
        costBy100Label.setForeground(Color.WHITE);
        costBy100Field.setBounds(10, 220, 200, 20);
        costBy100Field.addActionListener(this);

        fuelTypeLabel.setBounds(10, 240, 150, 20);
        fuelTypeLabel.setForeground(Color.WHITE);
        fuelTypeField.setBounds(10, 260, 200, 20);
        fuelTypeField.addActionListener(this);

        fuelPriceLabel.setBounds(10, 280, 150, 20);
        fuelPriceLabel.setForeground(Color.WHITE);
        fuelPriceField.setBounds(10, 300, 200, 20);
        fuelPriceField.addActionListener(this);

        kilometersLabel.setBounds(10, 320, 180, 20);
        kilometersLabel.setForeground(Color.WHITE);
        kilometersField.setBounds(10, 340, 200, 20);
        kilometersField.addActionListener(this);

        vehiclePanel.add(modelLabel);
        vehiclePanel.add(modelField);
        vehiclePanel.add(makeLabel);
        vehiclePanel.add(makeField);
        vehiclePanel.add(vehCategoryLabel);
        vehiclePanel.add(vehCategoryField);
        vehiclePanel.add(vehRegNLabel);
        vehiclePanel.add(vehRegNField);
        vehiclePanel.add(costBy100Label);
        vehiclePanel.add(costBy100Field);
        vehiclePanel.add(fuelTypeLabel);
        vehiclePanel.add(fuelTypeField);
        vehiclePanel.add(fuelPriceLabel);
        vehiclePanel.add(fuelPriceField);
        vehiclePanel.add(kilometersLabel);
        vehiclePanel.add(kilometersField);

        ///Other Transport Panel

        /* NO LONGER NEEDED
        frame.add(isTravelWithOtherTransportLabel);
        frame.add(isTravelWithOtherTransport);
        frame.add(isNotTravelWithOtherTransport);
        otherTransportPanel.add(otherTransportExpensesLabel);
        otherTransportPanel.add(otherTransportExpenses);

         */

        ///////////////////////////////BUTTON

        button.setBounds(10, 620, 200, 40);
        button.setBackground(Color.ORANGE);
        button.setBorder(BorderFactory.createRaisedBevelBorder());
        button.setFocusPainted(false);
        button.addActionListener(this);

        /////////////////////////////FRAME

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 703);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setVisible(true);
        frame.setResizable(false);

        frame.add(whichDaysPanel);
        frame.add(isNightStayNo);
        frame.add(isNightStayYes);
        frame.add(isNightStayLabel);
        frame.add(isNightStayPanel);
        frame.add(tripsThisMonthField);
        frame.add(tripsThisMonthLabel);
        frame.add(employerField);
        frame.add(employerLabel);
        frame.add(reasonField);
        frame.add(reasonLabel);
        frame.add(branchInField);
        frame.add(branchInLabel);
        frame.add(yearField);
        frame.add(yearLabel);
        frame.add(monthField);
        frame.add(monthLabel);
        frame.add(numberOfDaysField);
        frame.add(numberOfDaysLabel);
        frame.add(endDestinationField);
        frame.add(endDestinationLabel);
        frame.add(startDestinationField);
        frame.add(startDestinationLabel);

        frame.add(isTravelWithYourVehicle);
        frame.add(isNotTravelWithYourVehicle);

        /* NO LONGER NEEDED
        frame.add(otherTransportPanel);
         */

        frame.add(button);
        frame.add(fullNameLabel);
        frame.add(fullNameField);
        frame.add(personalNLabel);
        frame.add(personalNField);
        frame.add(positionField);
        frame.add(positionLabel);
        frame.add(numberDocumentsLabel);
        frame.add(numberDocumentsField);
        frame.add(vehiclePanel);

        /* no longer needed
        frame.add(addExpensesLabel);
        frame.add(addExpensesField);
         */

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (isNightStayYes.isSelected()) {
            isNightStayPanel.setVisible(true);
            whichDaysPanel.setVisible(false);
            resetDaysCheckboxes();
        }
        if (isNightStayNo.isSelected()) {
            isNightStayPanel.setVisible(false);
            whichDaysPanel.setVisible(true);
            numberOFNightStayField.setText("0");
        }
        if (isTravelWithYourVehicle.isSelected()) {
            vehiclePanel.setVisible(true);
            /* NO LONGER NEEDED
            isNotTravelWithOtherTransport.setSelected(true);
             */
            isTravelOnFirstDay.setVisible(true);
            isTravelOnLastDay.setVisible(true);
        }
        if (isNotTravelWithYourVehicle.isSelected()) {
            vehiclePanel.setVisible(false);
            resetVehiclePanel();
            /* no longer needed
            otherTransportPanel.setVisible(true);
             */
            isTravelOnFirstDay.setVisible(false);
            isTravelOnLastDay.setVisible(false);
        }
        /*
        if (isTravelWithOtherTransport.isSelected()) {
            otherTransportPanel.setVisible(true);
            isTravelOnFirstDay.setVisible(true);
            isTravelOnLastDay.setVisible(true);
        }
        if (isNotTravelWithOtherTransport.isSelected()) {
            otherTransportPanel.setVisible(false);
            otherTransportExpenses.setText("0");
            resetOtherTransportPanel();
        }
         */

        if (e.getSource() == button) {

            if (isTravelWithYourVehicle.isSelected()) {
                try {
                    validateVehicleFields();
                } catch (Exception ex) {
                    // Display the exception message in a popup window
                    JOptionPane.showMessageDialog(this.frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    throw new RuntimeException(ex);
                }
            }

            /* NO LONGER NEEDED
            if (isTravelWithOtherTransport.isSelected()) {
                validateOtherTransportFields();
            }
             */
            if (isNightStayYes.isSelected()) {
                try {
                    validateNightStayFields();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this.frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    throw new RuntimeException(ex);
                }
            }
            try {
                validateCommonFields();
            } catch (Exception ex) {
                // Display the exception message in a popup window
                JOptionPane.showMessageDialog(this.frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                throw new RuntimeException(ex);
            }
            List<BufferedImage> sheets = new ArrayList<>();
            TripTypeSelector.select(this, sheets, new Config());
            for (BufferedImage sheet: sheets) {
                new DisplayImage(sheet).setVisible(true);
            }

        }
    }

    private void validateVehicleFields() throws Exception {
        if (!FieldValidator.validateDigitField(costBy100Field.getText())) {
            costBy100Field.setForeground(Color.RED);
            costBy100Field.setText(UserErrorMessage.INVALID_COST_BY_100);
            throw new Exception(UserErrorMessage.INVALID_COST_BY_100);
        }
        if (!FieldValidator.validateDigitField(fuelPriceField.getText())) {
            fuelPriceField.setForeground(Color.RED);
            fuelPriceField.setText(UserErrorMessage.INVALID_FUEL_PRICE);
            throw new Exception(UserErrorMessage.INVALID_FUEL_PRICE);
        }
        if (!FieldValidator.validateDigitField(kilometersField.getText())) {
            kilometersField.setForeground(Color.RED);
            kilometersField.setText(UserErrorMessage.INVALID_KILOMETERS);
            throw new Exception(UserErrorMessage.INVALID_KILOMETERS);
        }
    }

    /* NO LONGER NEEDED
    private void validateOtherTransportFields() {
        if (!FieldValidator.validateDigitField(otherTransportExpenses.getText())) {
            otherTransportExpenses.setForeground(Color.RED);
            otherTransportExpenses.setText(ErrorMessage.NUMBER_ERROR_MESSAGE);
        }
    }
     */

    private void validateNightStayFields() throws Exception {
        if (!FieldValidator.validateDigitField(nightStayPriceField.getText())) {
            nightStayPriceField.setForeground(Color.RED);
            nightStayPriceField.setText(UserErrorMessage.INVALID_NIGHTSTAY_PRICE);
            throw new Exception(UserErrorMessage.INVALID_NIGHTSTAY_PRICE);
        }
        if (!FieldValidator.validateDayField(numberOFNightStayField.getText())) {
            numberOFNightStayField.setForeground(Color.RED);
            numberOFNightStayField.setText(ErrorMessage.INVALID_DAYS_ERROR_MESSAGE);
            throw new Exception(UserErrorMessage.INVALID_NUMBER_OF_NIGHTS);
        }
        if (!FieldValidator.validateDayField(fromWhichDayField.getText())) {
            fromWhichDayField.setForeground(Color.RED);
            fromWhichDayField.setText(ErrorMessage.INVALID_DAYS_ERROR_MESSAGE);
            throw new Exception(UserErrorMessage.INVALID_FROM_WHICH_DAY);
        }
        if (!FieldValidator.validateDayField(toWhichDayField.getText())) {
            toWhichDayField.setForeground(Color.RED);
            toWhichDayField.setText(ErrorMessage.INVALID_DAYS_ERROR_MESSAGE);
            throw new Exception(UserErrorMessage.INVALID_TO_WHICH_DAY);
        }
    }

    private void validateCommonFields() throws Exception {
        if (!FieldValidator.validateDigitField(numberDocumentsField.getText())) {
            numberDocumentsField.setForeground(Color.RED);
            numberDocumentsField.setText(UserErrorMessage.INVALID_NUMBER_DOCUMENTS);
            throw new Exception(UserErrorMessage.INVALID_NUMBER_DOCUMENTS);
        }
        if (!FieldValidator.validateDayField(numberOfDaysField.getText())) {
            numberOfDaysField.setForeground(Color.RED);
            numberOfDaysField.setText(ErrorMessage.INVALID_DAYS_ERROR_MESSAGE);
            throw new Exception(ErrorMessage.INVALID_DAYS_ERROR_MESSAGE);
        }
        if (!FieldValidator.validateMonthField(monthField.getText())) {
            monthField.setForeground(Color.RED);
            monthField.setText(ErrorMessage.INVALID_MONTH_ERROR_MESSAGE);
            throw new Exception(ErrorMessage.INVALID_MONTH_ERROR_MESSAGE);
        }
        if (!FieldValidator.validateYearField(yearField.getText())) {
            yearField.setForeground(Color.RED);
            yearField.setText(ErrorMessage.INVALID_YEAR_ERROR_MESSAGE);
            throw new Exception(ErrorMessage.INVALID_YEAR_ERROR_MESSAGE);
        }
        if (!FieldValidator.validateDigitField(tripsThisMonthField.getText())) {
            tripsThisMonthField.setForeground(Color.RED);
            tripsThisMonthField.setText(UserErrorMessage.INVALID_TRIPS_THIS_MONTH);
            throw new Exception(UserErrorMessage.INVALID_TRIPS_THIS_MONTH);
        }
        /* NO LONGER NEEDED
        if (!FieldValidator.validateDigitField(addExpensesField.getText())) {
            addExpensesField.setForeground(Color.RED);
            addExpensesField.setText(UserErrorMessage.INVALID_DOUBLE);
            throw new Exception(UserErrorMessage.INVALID_DOUBLE);
        }
         */
        if (!FieldValidator.validateNumberOfDaysEqualsInputDays(getNumberOfDays().toString(), getDays())) {
            numberOfDaysField.setForeground(Color.RED);
            //numberOfDaysField.setText(ErrorMessage.SELECTED_DAYS_ARENT_EQUAL);
            throw new Exception(ErrorMessage.SELECTED_DAYS_ARENT_EQUAL);
        }
    }

    private void resetVehiclePanel() {
        this.modelField.setText("");
        this.makeField.setText("");
        this.vehCategoryField.setText("");
        this.vehRegNField.setText("");
        this.costBy100Field.setText("");
        this.fuelTypeField.setText("");
        this.fuelPriceField.setText("");
        this.kilometersField.setText("");
    }


    /* NO LONGER NEEDED
    private void resetOtherTransportPanel() {
        this.otherTransportExpenses.setText("");
    }
     */


    private void resetDaysCheckboxes() {
        day1.setSelected(false);
        day2.setSelected(false);
        day3.setSelected(false);
        day4.setSelected(false);
        day5.setSelected(false);
        day6.setSelected(false);
        day7.setSelected(false);
        day8.setSelected(false);
        day9.setSelected(false);
        day10.setSelected(false);
        day11.setSelected(false);
        day12.setSelected(false);
        day13.setSelected(false);
        day14.setSelected(false);
        day15.setSelected(false);
        day16.setSelected(false);
        day17.setSelected(false);
        day18.setSelected(false);
        day19.setSelected(false);
        day20.setSelected(false);
        day21.setSelected(false);
        day22.setSelected(false);
        day23.setSelected(false);
        day24.setSelected(false);
        day25.setSelected(false);
        day26.setSelected(false);
        day27.setSelected(false);
        day28.setSelected(false);
        day29.setSelected(false);
        day30.setSelected(false);
        day31.setSelected(false);
    }

    public int getFromWhichDayField() {
        return Integer.parseInt(this.fromWhichDayField.getText());
    }
    public int getToWhichDayField() {
        return Integer.parseInt(this.toWhichDayField.getText());
    }
    @Override
    public List<Integer> getDays() {
        return BTripGetDaysFromCheckboxesOrFields.getDays(this);
    }

    @Override
    public boolean getDay1() {
        return day1.isSelected();
    }

    @Override
    public boolean getDay2() {
        return day2.isSelected();
    }

    @Override
    public boolean getDay3() {
        return day3.isSelected();
    }

    @Override
    public boolean getDay4() {
        return day4.isSelected();
    }

    @Override
    public boolean getDay5() {
        return day5.isSelected();
    }

    @Override
    public boolean getDay6() {
        return day6.isSelected();
    }

    @Override
    public boolean getDay7() {
        return day7.isSelected();
    }

    @Override
    public boolean getDay8() {
        return day8.isSelected();
    }

    @Override
    public boolean getDay9() {
        return day9.isSelected();
    }

    @Override
    public boolean getDay10() {
        return day10.isSelected();
    }

    @Override
    public boolean getDay11() {
        return day11.isSelected();
    }

    @Override
    public boolean getDay12() {
        return day12.isSelected();
    }

    @Override
    public boolean getDay13() {
        return day13.isSelected();
    }

    @Override
    public boolean getDay14() {
        return day14.isSelected();
    }

    @Override
    public boolean getDay15() {
        return day15.isSelected();
    }

    @Override
    public boolean getDay16() {
        return day16.isSelected();
    }

    @Override
    public boolean getDay17() {
        return day17.isSelected();
    }

    @Override
    public boolean getDay18() {
        return day18.isSelected();
    }

    @Override
    public boolean getDay19() {
        return day19.isSelected();
    }

    @Override
    public boolean getDay20() {
        return day20.isSelected();
    }

    @Override
    public boolean getDay21() {
        return day21.isSelected();
    }

    @Override
    public boolean getDay22() {
        return day22.isSelected();
    }

    @Override
    public boolean getDay23() {
        return day23.isSelected();
    }

    @Override
    public boolean getDay24() {
        return day24.isSelected();
    }

    @Override
    public boolean getDay25() {
        return day25.isSelected();
    }

    @Override
    public boolean getDay26() {
        return day26.isSelected();
    }

    @Override
    public boolean getDay27() {
        return day27.isSelected();
    }

    @Override
    public boolean getDay28() {
        return day28.isSelected();
    }

    @Override
    public boolean getDay29() {
        return day29.isSelected();
    }

    @Override
    public boolean getDay30() {
        return day30.isSelected();
    }

    @Override
    public boolean getDay31() {
        return day31.isSelected();
    }


    @Override
    public String getFullName() {
        return this.fullNameField.getText();
    }

    @Override
    public String getPersonalNumber() {
        return this.personalNField.getText();
    }

    @Override
    public String getPosition() {
        return this.positionField.getText();
    }

    @Override
    public int getNumberDocuments() {
        return Integer.parseInt(this.numberDocumentsField.getText());
    }

    @Override
    public String getBranchIn() {
        return this.branchInField.getText();
    }

    @Override
    public String getEndDestination() {
        return this.endDestinationField.getText();
    }

    @Override
    public String getStartDestination() {
        return this.startDestinationField.getText();
    }

    @Override
    public BigDecimal getNumberOfDays() {
        return new BigDecimal(this.numberOfDaysField.getText());
    }

    @Override
    public String getMonthNumber() {
        return this.monthField.getText();
    }

    @Override
    public String getWhatYear() {
        return this.yearField.getText();
    }

    @Override
    public String getReason() {
        return this.reasonField.getText();
    }

    @Override
    public String getHeadEmployeeName() {
        return this.employerField.getText();
    }

    @Override
    public String getTripNumberThisMonth() {
        return this.tripsThisMonthField.getText();
    }

    @Deprecated
    public BigDecimal getAdditionalExpenses() {
        //return new BigDecimal(this.addExpensesField.getText());
        return null;
    }

    @Override
    public boolean getIsNightStayedInHotel() {
        return this.isNightStayYes.isSelected();
    }

    @Override
    public BigDecimal getNightStayPrice() {
        return new BigDecimal(this.nightStayPriceField.getText());
    }

    @Override
    public BigDecimal getNumberOfNightsStayed() {
        return new BigDecimal(this.numberOFNightStayField.getText());
    }

    @Override
    public boolean getIsTravelOnFirstDay() {
        return this.isTravelOnFirstDay.isSelected();
    }

    @Override
    public boolean getIsTravelOnLastDay() {
        return this.isTravelOnLastDay.isSelected();
    }

    @Override
    public boolean getIsTravelWithYourVehicle() {
        return this.isTravelWithYourVehicle.isSelected();
    }

    @Override
    public String getModel() {
        return this.modelField.getText();
    }

    @Override
    public String getMake() {
        return this.makeField.getText();
    }


    @Override
    public String getCategory() {
        return this.vehCategoryField.getText();
    }

    @Override
    public String getRegistrationNumber() {
        return this.vehRegNField.getText();
    }

    @Override
    public BigDecimal getCostBy100() {
        return new BigDecimal(this.costBy100Field.getText());
    }

    @Override
    public String getFuelType() {
        return this.fuelTypeField.getText();
    }

    @Override
    public BigDecimal getFuelPrice() {
        return new BigDecimal(this.fuelPriceField.getText());
    }

    @Override
    public BigDecimal getKilometers() {
        return new BigDecimal(this.kilometersField.getText());
    }

    @Override
    public boolean getIsTravelWithOtherTransport() {
        return false;
    }

    /*
    @Override
    public boolean getIsTravelWithOtherTransport() {
        return this.isTravelWithOtherTransport.isSelected();
    }
     */

    @Deprecated
    @Override
    public BigDecimal getOtherTransportExpenses() {
        /*
        return new BigDecimal(this.otherTransportExpenses.getText());

         */
        return null;
    }


}

