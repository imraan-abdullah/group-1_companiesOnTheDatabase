/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.companiesonthedatabase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author imraan
 */
public class CompanyGUI extends JFrame implements ActionListener{
    
    private JFrame mainFrame;
    
    private JPanel northPanel;
    private JPanel mainPanel;
    private JPanel southPanel;
    
    private JLabel header;
    
    private JLabel empty;
    private JLabel pageCounter;
    
    private JLabel lblCompanyName;
    private JTextField txtCompanyName;
    
    private JLabel lblCompanyAddress;
    private JTextArea txtCompanyAddress;
    
    private JLabel lblCompanyDescription;
    private JTextArea txtCompanyDescription;
    
    private JLabel emptyButton;
    private JPanel btnPanel;
    private JButton btnPrev;
    private JButton btnNext;
    
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JButton btnExit;
    
    ArrayList <Company> companyList = new ArrayList <Company>();
    int counter = 0;
    
    private Font headerFont;
    private Font counterFont;
    private Font subheadingFont;
    private Font dataFont;
    private Font btnFont;
    
    Border border = new LineBorder(new Color(0x1b2b96));
    
    
    public CompanyGUI()
    {
        super("Workers Information Viewer");
        mainFrame = new JFrame("Companies on the database");
        mainFrame.setSize(750, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        northPanel = new JPanel();
        mainPanel = new JPanel(new BorderLayout(5,5));
        southPanel = new JPanel();
        
        header = new JLabel("COMPANIES ON THE DATABASE", SwingConstants.CENTER);
        
        empty = new JLabel();
        pageCounter = new JLabel();
        
        lblCompanyName = new JLabel("Company name: ");
        txtCompanyName = new JTextField();
        
        lblCompanyAddress = new JLabel("Address: ");
        txtCompanyAddress = new JTextArea();
        
        lblCompanyDescription = new JLabel("Description");
        txtCompanyDescription = new JTextArea();
        
        emptyButton = new JLabel();
        btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(1,2));
        btnPrev = new JButton("PREV");
        btnNext = new JButton("NEXT");
        btnPanel.add(btnPrev);
        btnPanel.add(btnNext);
        
        btnAdd = new JButton("ADD");
        btnDelete = new JButton("DELETE");
        btnUpdate = new JButton("UPDATE");
        btnExit = new JButton("EXIT");
        
        headerFont = new Font(Font.SANS_SERIF, Font.BOLD, 25);
        counterFont = new Font(Font.SANS_SERIF, Font.ITALIC, 15);
        subheadingFont = new Font(Font.SANS_SERIF, Font.BOLD, 15);
        dataFont = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
        btnFont = new Font(Font.SANS_SERIF, Font.BOLD, 15);
        
    }
    
    public void setGUI()
    {
        mainPanel.setBorder(new EmptyBorder(0, 25, 0, 25));
        
        northPanel.setLayout(new GridLayout(1,1));
        northPanel.setBorder(new EmptyBorder(25, 0, 0, 0));
        northPanel.add(header);
        
        mainPanel.setLayout(new GridLayout(6,2));
        
        
        mainPanel.add(empty);
        mainPanel.add(pageCounter);
        
        mainPanel.add(lblCompanyName);
        mainPanel.add(txtCompanyName);
     
        mainPanel.add(lblCompanyAddress);
        mainPanel.add(txtCompanyAddress);
        txtCompanyAddress.setLineWrap(true);
        
        mainPanel.add(lblCompanyDescription);
        mainPanel.add(txtCompanyDescription);
        txtCompanyDescription.setLineWrap(true);
        
        mainPanel.add(emptyButton);
        mainPanel.add(btnPanel);
        
        southPanel.setLayout(new GridLayout(1,4)); 
        southPanel.add(btnAdd);
        southPanel.add(btnDelete);
        southPanel.add(btnUpdate);
        southPanel.add(btnExit);
        
        mainFrame.add(northPanel, BorderLayout.NORTH);
        mainFrame.add(mainPanel);
        mainFrame.add(southPanel, BorderLayout.SOUTH);
        
        btnPrev.addActionListener(this);
        btnNext.addActionListener(this);
        btnAdd.addActionListener(this);
        btnDelete.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnExit.addActionListener(this);
        
        header.setFont(headerFont);
        pageCounter.setFont(counterFont);
        lblCompanyName.setFont(subheadingFont);
        lblCompanyAddress.setFont(subheadingFont);
        lblCompanyDescription.setFont(subheadingFont);
        txtCompanyName.setFont(dataFont);
        txtCompanyAddress.setFont(dataFont);
        txtCompanyDescription.setFont(dataFont);
        btnPrev.setFont(btnFont);
        btnNext.setFont(btnFont);
        btnAdd.setFont(btnFont);
        btnDelete.setFont(btnFont);
        btnUpdate.setFont(btnFont);
        btnExit.setFont(btnFont);
        
        mainPanel.setBackground(new Color(0xf5f2ff));
        northPanel.setBackground(new Color(0xf5f2ff));
        btnPrev.setBackground(new Color(0xBFEFFF));
        btnNext.setBackground(new Color(0xBFEFFF));
        btnAdd.setBackground(new Color(0xBFEFFF));
        btnDelete.setBackground(new Color(0xBFEFFF));
        btnUpdate.setBackground(new Color(0xBFEFFF));
        btnExit.setBackground(new Color(0xBFEFFF));
        
        txtCompanyName.setBorder(border);
        txtCompanyAddress.setBorder(border);
        txtCompanyDescription.setBorder(border);
        
        mainFrame.setLocationRelativeTo(null);
        mainFrame.show();
        
        companyItems();
        displayData();
    }
    public void companyItems()
    {
       Company one = new Company("Sunlum",
                                  "152 orchid road, London, 7100 ",
                                  "we are a non profit orginzation wo is looking for programmerss who can code");
        Company two = new Company("Morfling Adapt",
                                  "1235 cape town, belville 7000",
                                  "AT Morfling adapt we focus on bring the best quality to customers. we ccurrenttly have openings for networking");
        Company three = new Company("GameIT",
                                    "12 bloekom street, bluedowns, hillcreast 7105",
                                    "GameIT focuses on building applications for useres and orginizations all around the world");
        Company four = new Company("binance",
                                   "152 boekap, bandana park, cape town 8120",
                                   "A new start up company looking for empoyers with a vast knowledge on information technology");
        Company five = new Company("Tech Heads",
                                   "2568 billharyy road, bluedowns,  7510",
                                   "we focus on programming for the future");
        
        this.companyList.add(one);
        this.companyList.add(two);
        this.companyList.add(three);
        this.companyList.add(four);
        this.companyList.add(five);
    }
    public void displayData()
    {
        Company companyToShow = companyList.get(counter);
        
        int currentRecord = counter;
        pageCounter.setText("Company " + ++currentRecord + " of " + companyList.size());
        
        txtCompanyName.setText(companyToShow.getCompanyName());
        txtCompanyAddress.setText(companyToShow.getCompanyAddress());
        txtCompanyDescription.setText(companyToShow.getCompanyDescription());
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(btnAdd))
        {
             String newName= JOptionPane.showInputDialog("Please input company name: "); 
             if(newName.isEmpty() == false)
             {
                String newAddress = JOptionPane.showInputDialog("Please enter in the companys physical address: ");
                if(newAddress.isEmpty() == false)
                {
                    String newDescription = JOptionPane.showInputDialog("Please provide a company description: ");
                    if(newDescription.isEmpty() == false)
                    {
                        Company new_company = new Company(newName, newAddress, newDescription);
                        companyList.add(new_company);
                        JOptionPane.showMessageDialog(null, "Company successfully added!");
                        displayData();
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Company Decription is required!");
                    }  
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "The companies address is required");
                }
             }
             else 
             {
                 JOptionPane.showMessageDialog(null, "Company name cannot be empty");
             }
        }
        
        else if(e.getSource().equals(btnDelete))
        {
            String dltCompany = JOptionPane.showInputDialog("Enter the name of the company to be deleted: ");
            for(int i =0; i < companyList.size(); i++)
            {
                if(dltCompany.equalsIgnoreCase(companyList.get(i).getCompanyName()))
                {
                    companyList.remove(i);
                    JOptionPane.showMessageDialog(null, "Company deleted Successfully!");
                    displayData();
                    break;
                }
                else if(dltCompany != companyList.get(i).getCompanyName() && i==companyList.size()-1)
                {
                    JOptionPane.showMessageDialog(null, "There is no company by the name " + dltCompany + " on the system");
                }
                //SwingUtilities.updateComponentTreeUI(mainFrame);
                //mainFrame.revalidate();

            }
        }
        
        else if(e.getSource().equals(btnUpdate))
        {
            String updCompany = JOptionPane.showInputDialog("Please enter the name of the company which you would like to update");
            for(int i=0; i<companyList.size(); i++)
            {
                if(updCompany.equalsIgnoreCase(companyList.get(i).getCompanyName()))
                {
                    String updName = JOptionPane.showInputDialog("Enter in the updated company name: ");
                    if(updName.isEmpty() == false)
                    {            
                        String updAddress = JOptionPane.showInputDialog("Enter in the updated Address: ");
                        if(updAddress.isEmpty() == false)
                        {     
                            String updDescription = JOptionPane.showInputDialog("Updated company description: ");
                            if(updDescription.isEmpty() == false)
                            {
                                companyList.get(i).setCompanyName(updName);
                                companyList.get(i).setCompanyAddress(updAddress);
                                companyList.get(i).setCompanyDescription(updDescription);
                                JOptionPane.showMessageDialog(null, "Update successful!");
                                displayData();
                                break;
                            }else
                            {
                                JOptionPane.showMessageDialog(null, "Company Decription is required!");
                                break;
                            }
                   
                        }else
                        {
                            JOptionPane.showMessageDialog(null, "The companies address is required");
                            break;
                        }
                    
                    }else
                    {
                        JOptionPane.showMessageDialog(null, "Company name cannot be empty");
                        break;
                    }
      
                }
                else if(updCompany != companyList.get(i).getCompanyName() && i==companyList.size()-1)
                {
                   JOptionPane.showMessageDialog(null, "There is no company by the name of " + updCompany + " on the system"); 
                }
            }
        }
        else if(e.getSource().equals(btnExit))
        {
             System.exit(0);
        }
        else if(e.getSource().equals(btnPrev))
        {
            if(counter == 0)
           {
               counter = companyList.size() - 1;
           }else{
                --counter;
           }
            displayData();
        }
        else if(e.getSource().equals(btnNext))
        {
            if(counter == companyList.size() - 1)
            {
                counter = 0;
            }else{
                ++counter;
            }
            displayData(); 
        }
    }
    
}
