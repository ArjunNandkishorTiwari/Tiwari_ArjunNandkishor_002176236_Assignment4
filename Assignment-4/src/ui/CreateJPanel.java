/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.House;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author arjun
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    PersonDirectory personList;
    public CreateJPanel( PersonDirectory personList) {
        initComponents();
        this.personList = personList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        txtAddress = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cityComboBox = new javax.swing.JComboBox<>();
        communityComboBox = new javax.swing.JComboBox<>();
        btnSavePerson = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtHouseNumber = new javax.swing.JTextField();
        txtPinCode = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPersonId = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 120, 0));
        jLabel1.setText("Create Person");

        jLabel2.setForeground(new java.awt.Color(0, 143, 0));
        jLabel2.setText("First Name");

        jLabel3.setForeground(new java.awt.Color(0, 143, 0));
        jLabel3.setText("Last Name");

        jLabel4.setForeground(new java.awt.Color(0, 143, 0));
        jLabel4.setText("Age");

        jLabel5.setForeground(new java.awt.Color(0, 143, 0));
        jLabel5.setText("Gender");

        jLabel6.setForeground(new java.awt.Color(0, 143, 0));
        jLabel6.setText("Address");

        jLabel7.setForeground(new java.awt.Color(0, 143, 0));
        jLabel7.setText("Contact");

        jLabel8.setForeground(new java.awt.Color(0, 143, 0));
        jLabel8.setText("Email");

        jLabel9.setForeground(new java.awt.Color(0, 143, 0));
        jLabel9.setText("Community");

        jLabel10.setForeground(new java.awt.Color(0, 143, 0));
        jLabel10.setText("City");

        jLabel11.setForeground(new java.awt.Color(0, 143, 0));
        jLabel11.setText("Pin Code");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Prefer not to answer", "" }));

        cityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Cambridge", "Quincy" }));
        cityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboBoxActionPerformed(evt);
            }
        });

        communityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityComboBoxActionPerformed(evt);
            }
        });

        btnSavePerson.setBackground(new java.awt.Color(0, 153, 0));
        btnSavePerson.setText("Save");
        btnSavePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePersonActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(0, 143, 0));
        jLabel12.setText("House No");

        txtHouseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseNumberActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 143, 0));
        jLabel13.setText("Person Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(btnSavePerson)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(13, 13, 13))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(381, 381, 381)))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(cityComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(communityComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPinCode)
                    .addComponent(txtHouseNumber)
                    .addComponent(txtPersonId))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtFirstName, txtLastName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtHouseNumber});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtPinCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(btnSavePerson)
                .addContainerGap(565, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAge, txtFirstName, txtLastName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAddress, txtHouseNumber});

    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private boolean checkIfEmail(String str){
         if(!str.contains("@")){
             JOptionPane.showMessageDialog(this, "Please Enter @ in the email");
             return false;
         }
          if(!str.contains(".")){
             JOptionPane.showMessageDialog(this, "Please Enter . in the email");
             return false;
         }
         
                
         return true;
            
            
        }
    
    private void checkIfNumber(String str, String str1){
        for(int i = 0; i < str.length(); i++){
            int x = Integer.parseInt(String.valueOf(str.charAt(i))) ;
                //JOptionPane.showMessageDialog(this, "Please Enter Numeric Value for "+str1);
               
                
            
            
        }
        
    }
    
    private void btnSavePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePersonActionPerformed
        // TODO add your handling code here:
        
        if(txtPersonId.getText().isEmpty() || txtPinCode.getText().isEmpty() || txtHouseNumber.getText().isEmpty() || txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtEmail.getText().isEmpty() || txtContact.getText().isEmpty() || txtAge.getText().isEmpty() || txtAddress.getText().isEmpty() || cityComboBox.getSelectedItem() == null || communityComboBox.getSelectedItem() == null || genderComboBox.getSelectedItem() == null   ){
        
            JOptionPane.showMessageDialog(this,"Please add all the fields");
        
        } else {
            
            Person person = personList.generateEmptyNewPerson();
            House house = new House();
            String firstName = txtFirstName.getText();
            String lastName = txtLastName.getText();
            String email = txtEmail.getText();
            boolean emailStatus = checkIfEmail(email);
            System.out.println(emailStatus);
            if(emailStatus == false){
                return;
            }
            
            String gender = genderComboBox.getSelectedItem().toString();
            String address = txtAddress.getText();
            String city = cityComboBox.getSelectedItem().toString();
            String community = communityComboBox.getSelectedItem().toString();
            String pinCode = txtPinCode.getText();
             if (txtPinCode.getText().length() != 5 ){
            JOptionPane.showMessageDialog(this, "Please Enter Correct length Value for Pincode");
            return;
        }
//            int houseNumber = Integer.parseInt(txtHouseNumber.getText());
//            String contact = txtContact.getText();
//            int age = Integer.parseInt(txtAge.getText());
//            int id = Integer.parseInt(txtPersonId.getText());
//            txtHouseNumber.getText();
            


            try{
//              pinCode = txtPinCode.getText();
               checkIfNumber(pinCode,"Contact Number");
              house.setPinCode(pinCode);
             } catch(NumberFormatException e){
              JOptionPane.showMessageDialog(this, "Please enter numeric value for Pincode");
               return;
             }

            try{
             int id = Integer.parseInt(txtPersonId.getText());
              person.setPersonId(id);
             } catch(NumberFormatException e){
              JOptionPane.showMessageDialog(this, "Please enter numeric value for Id");
               return;
             }

             try{
             int houseNumber = Integer.parseInt(txtHouseNumber.getText());
             house.setHouseNumber(houseNumber);
             } catch(NumberFormatException e){
              JOptionPane.showMessageDialog(this, "Please enter numeric value for House Number");
               return;
             }
             
             try{
             int age = Integer.parseInt(txtAge.getText());
             if (age <= 0 ){
            JOptionPane.showMessageDialog(this, "Please Enter Correct Age");
            return;
        }
              person.setAge(age);
             } catch(NumberFormatException e){
              JOptionPane.showMessageDialog(this, "Please enter numeric value for age");
               return;
             }
             
             try{
             String contact = txtContact.getText();
             if (txtContact.getText().length() != 10 ){
            JOptionPane.showMessageDialog(this, "Please Enter Correct length Value for Contact Number");
            return;
        }
             checkIfNumber(contact,"Contact Number");
              person.setContactNumber(contact);
             } catch(NumberFormatException e){
              JOptionPane.showMessageDialog(this, "Please enter numeric value for Contact");
               return;
             }

    
            person.setFirstName(firstName);
            person.setLastName(lastName);
//            person.setAge(age);
            person.setGender(gender);
            person.setEmail(email);
//            person.setContactNumber(contact);
//            person.setPersonId(id);
            
            
            house.setAddress(address);
            house.setCity(city);
            house.setCommunity(community);
           
//            house.setPinCode(pinCode);
//            house.setHouseNumber(houseNumber);
            person.setHomeAddress(house);
            
            personList.personList.add(person);
            
//            System.out.print(personList.personList);
//            System.out.printf(person.getAge().toString);
//            System.out.printf(person.getContactNumber());
            
            JOptionPane.showMessageDialog(this, "Person Details saved successfully");
            
            txtFirstName.setText("");
            txtLastName.setText("");
            txtAge.setText("");
            txtAddress.setText("");
            txtContact.setText("");
            txtEmail.setText("");
            txtHouseNumber.setText("");
            genderComboBox.setSelectedItem(null);
            cityComboBox.setSelectedItem(null);
            communityComboBox.setSelectedItem(null);
            txtPinCode.setText("");
            txtPersonId.setText("");
            
        }
    }//GEN-LAST:event_btnSavePersonActionPerformed

    private void txtHouseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseNumberActionPerformed

    private void cityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboBoxActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel modelCommunity = new DefaultComboBoxModel();
        
        if(cityComboBox.getSelectedItem() != null){
            if(cityComboBox.getSelectedItem().toString() == "Boston"){
            modelCommunity.addElement("Allston");
            modelCommunity.addElement("Back Bay");
            modelCommunity.addElement("Bay Village");
            modelCommunity.addElement("Beacon Hill");
            modelCommunity.addElement("Roxbury");
            modelCommunity.addElement("Brookline");
            
        
        } else if(cityComboBox.getSelectedItem().toString() == "Cambridge"){
            modelCommunity.addElement("East Cambridge");
            modelCommunity.addElement("Wellington");
            modelCommunity.addElement("Riverside");
            modelCommunity.addElement("Strawberry Hill");
        
        
        } else if (cityComboBox.getSelectedItem().toString() == "Quincy"){
            modelCommunity.addElement("Wollaston");
            modelCommunity.addElement("Marina Bay");
            modelCommunity.addElement("Adams Shore");
            modelCommunity.addElement("Quincy Point");
            modelCommunity.addElement("Squantum");
             
        
        }
            
            communityComboBox.setModel(modelCommunity);
        
            
        }
        
        
    }//GEN-LAST:event_cityComboBoxActionPerformed

    private void communityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityComboBoxActionPerformed
        // TODO add your handling code here:
        
        if(communityComboBox.getSelectedItem() != null){
            
            switch (communityComboBox.getSelectedItem().toString()){
                
                case "Squantum" : txtPinCode.setText("02171"); break;
                case "Quincy Point" : txtPinCode.setText("02122"); break;
                case "Adams Shore" : txtPinCode.setText("02169"); break;
                case "Marina Bay" : txtPinCode.setText("02172"); break;
                case "Wollaston" : txtPinCode.setText("02170"); break;
                case "Strawberry Hill" : txtPinCode.setText("02632"); break;
                case "Riverside" : txtPinCode.setText("02458"); break;
                case "Wellington" : txtPinCode.setText("02155"); break;
                case "East Cambridge" : txtPinCode.setText("02141"); break;
                case "Brookline" : txtPinCode.setText("02445"); break;
                case "Roxbury" : txtPinCode.setText("02120"); break;
                case "Beacon Hill" : txtPinCode.setText("02108"); break;
                case "Back Bay" : txtPinCode.setText("02116"); break;
                case "Allston" : txtPinCode.setText("02134"); break;
                default : txtPinCode.setText("02120"); break;
                
                
                                    
                     
            
            }
        
        }
    }//GEN-LAST:event_communityComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePerson;
    private javax.swing.JComboBox<String> cityComboBox;
    private javax.swing.JComboBox<String> communityComboBox;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHouseNumber;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPersonId;
    private javax.swing.JTextField txtPinCode;
    // End of variables declaration//GEN-END:variables
}
