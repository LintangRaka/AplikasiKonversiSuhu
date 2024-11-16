
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class KonversiSuhuFrame extends javax.swing.JFrame {

    /**
     * Creates new form KonversiSuhuFrame
     */
    String arahKonversi;

    public KonversiSuhuFrame() {
        initComponents();
        // Menambahkan DocumentListener untuk menangani perubahan di txtSuhu
        txtSuhu.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                konversiSuhu(); // Lakukan konversi otomatis saat teks ditambahkan
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                konversiSuhu(); // Lakukan konversi otomatis saat teks dihapus
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                konversiSuhu(); // Lakukan konversi otomatis saat teks berubah
            }
        });
        // Tambahkan ItemListener pada setiap radio button di constructor atau metode initComponents
        rbCelsius.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                if (rbCelsius.isSelected()) {
                    // Update label atau komponen lain berdasarkan pilihan Celsius
                    // Misalnya, update tampilan label untuk menunjukkan bahwa suhu output yang dipilih adalah Celsius
                    arahKonversi = "Celsius";
                }
            }
        });

        rbFahrenheit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                if (rbFahrenheit.isSelected()) {
                    // Update label atau komponen lain berdasarkan pilihan Fahrenheit
                    arahKonversi = "Fahrenheit";
                }
            }
        });

        rbReamur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                if (rbReamur.isSelected()) {
                    // Update label atau komponen lain berdasarkan pilihan Reamur
                    arahKonversi = "Reamur";
                }
            }
        });

        rbKelvin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                if (rbKelvin.isSelected()) {
                    // Update label atau komponen lain berdasarkan pilihan Kelvin
                    arahKonversi = "Kelvin";
                }
            }
        });

        txtSuhuHasil.setEditable(false);
        txtSuhu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                // Ambil karakter yang diketik
                char inputChar = evt.getKeyChar();

                // Cek apakah input karakter bukan angka atau bukan titik desimal
                if (!Character.isDigit(inputChar) && inputChar != '.' && inputChar != '\b') {
                    evt.consume(); // Batalkan input jika bukan angka atau bukan titik desimal
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSuhu = new javax.swing.JTextField();
        cbbSuhuInput = new javax.swing.JComboBox<>();
        rbCelsius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtSuhuHasil = new javax.swing.JTextField();
        btnKonversi = new javax.swing.JButton();
        rbReamur = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Masukkan suhu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Jenis konversi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(txtSuhu, gridBagConstraints);

        cbbSuhuInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Reamur", "Kelvin" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(cbbSuhuInput, gridBagConstraints);

        buttonGroup1.add(rbCelsius);
        rbCelsius.setText("Celsius");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(rbCelsius, gridBagConstraints);

        buttonGroup1.add(rbFahrenheit);
        rbFahrenheit.setText("Fahrenheit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(rbFahrenheit, gridBagConstraints);

        jLabel3.setText("Hasil");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(txtSuhuHasil, gridBagConstraints);

        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(btnKonversi, gridBagConstraints);

        buttonGroup1.add(rbReamur);
        rbReamur.setSelected(true);
        rbReamur.setText("Reamur");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(rbReamur, gridBagConstraints);

        buttonGroup1.add(rbKelvin);
        rbKelvin.setText("Kelvin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(rbKelvin, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        konversiSuhu();
    }//GEN-LAST:event_btnKonversiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhuFrame().setVisible(true);
            }
        });
    }

    private void konversiSuhu() {
        try {
            // Ambil input suhu dan konversikan ke tipe double
            double suhuInput = Double.parseDouble(txtSuhu.getText());
            double hasilKonversi = 0.0;

            // Ambil jenis suhu input yang dipilih dari ComboBox
            String suhuInputType = cbbSuhuInput.getSelectedItem().toString();

            // Gunakan arah konversi yang sudah ditentukan
            if (arahKonversi.equals("Celsius")) {
                if (suhuInputType.equals("Celsius")) {
                    hasilKonversi = suhuInput;
                } else if (suhuInputType.equals("Fahrenheit")) {
                    hasilKonversi = (suhuInput * 9 / 5) + 32;
                } else if (suhuInputType.equals("Reamur")) {
                    hasilKonversi = suhuInput * 4 / 5;
                } else if (suhuInputType.equals("Kelvin")) {
                    hasilKonversi = suhuInput + 273.15;
                }
            } else if (arahKonversi.equals("Fahrenheit")) {
                if (suhuInputType.equals("Celsius")) {
                    hasilKonversi = (suhuInput * 9 / 5) + 32;
                } else if (suhuInputType.equals("Fahrenheit")) {
                    hasilKonversi = suhuInput;
                } else if (suhuInputType.equals("Reamur")) {
                    hasilKonversi = (suhuInput * 9 / 4) + 32;
                } else if (suhuInputType.equals("Kelvin")) {
                    hasilKonversi = (suhuInput - 273.15) * 9 / 5 + 32;
                }
            } else if (arahKonversi.equals("Reamur")) {
                if (suhuInputType.equals("Celsius")) {
                    hasilKonversi = suhuInput * 4 / 5;
                } else if (suhuInputType.equals("Fahrenheit")) {
                    hasilKonversi = (suhuInput - 32) * 4 / 9;
                } else if (suhuInputType.equals("Reamur")) {
                    hasilKonversi = suhuInput;
                } else if (suhuInputType.equals("Kelvin")) {
                    hasilKonversi = (suhuInput - 273.15) * 4 / 5;
                }
            } else if (arahKonversi.equals("Kelvin")) {
                if (suhuInputType.equals("Celsius")) {
                    hasilKonversi = suhuInput + 273.15;
                } else if (suhuInputType.equals("Fahrenheit")) {
                    hasilKonversi = (suhuInput - 32) * 5 / 9 + 273.15;
                } else if (suhuInputType.equals("Reamur")) {
                    hasilKonversi = (suhuInput * 5 / 4) + 273.15;
                } else if (suhuInputType.equals("Kelvin")) {
                    hasilKonversi = suhuInput;
                }
            }

            // Tampilkan hasil konversi
            txtSuhuHasil.setText(String.valueOf(hasilKonversi));
        } catch (NumberFormatException e) {
            txtSuhuHasil.setText("Input tidak valid!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKonversi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbSuhuInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbCelsius;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    private javax.swing.JTextField txtSuhu;
    private javax.swing.JTextField txtSuhuHasil;
    // End of variables declaration//GEN-END:variables
}
