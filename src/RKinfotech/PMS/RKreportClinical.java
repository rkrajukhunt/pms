/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RKinfotech.PMS;

import RKinfotech.Class.rkConnection;
import RKinfotech.Class.rkDatabase;
import RKinfotech.Class.rkValidation;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author rk
 */
public class RKreportClinical extends javax.swing.JInternalFrame {

    /**
     * Creates new form RKreportAnuragDis
     */
    public RKreportClinical() {
        initComponents();
        db.rkAutoCompleted(new JComboBox[]{rkYearCon,rkYearDSP,rkYearMT,rkYearNon,rkYearSecu,rkMonthMT,rkMonthNon,rkMonthDSP,rkMonthCon,rkMonthSecu});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        MT = new javax.swing.JPanel();
        rkYearMT = new javax.swing.JComboBox<>();
        rkMonthMT = new javax.swing.JComboBox<>();
        rkDisplayReportMT = new javax.swing.JButton();
        Con = new javax.swing.JPanel();
        rkYearCon = new javax.swing.JComboBox<>();
        rkMonthCon = new javax.swing.JComboBox<>();
        rkDisplayReportCon = new javax.swing.JButton();
        Secu = new javax.swing.JPanel();
        rkYearSecu = new javax.swing.JComboBox<>();
        rkMonthSecu = new javax.swing.JComboBox<>();
        rkDisplayReportSecu = new javax.swing.JButton();
        DSP = new javax.swing.JPanel();
        rkYearDSP = new javax.swing.JComboBox<>();
        rkMonthDSP = new javax.swing.JComboBox<>();
        rkDisplayReportDSP = new javax.swing.JButton();
        NON = new javax.swing.JPanel();
        rkYearNon = new javax.swing.JComboBox<>();
        rkMonthNon = new javax.swing.JComboBox<>();
        rkDisplayReportNon = new javax.swing.JButton();

        setClosable(true);
        setTitle("Clinical Report");
        setToolTipText("");

        rkYearMT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099" }));
        rkYearMT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rkMonthYearMTItemStateChanged(evt);
            }
        });

        rkMonthMT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        rkMonthMT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rkMonthYearMTItemStateChanged(evt);
            }
        });

        rkDisplayReportMT.setText("Display Report");
        rkDisplayReportMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rkDisplayReportMTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MTLayout = new javax.swing.GroupLayout(MT);
        MT.setLayout(MTLayout);
        MTLayout.setHorizontalGroup(
            MTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MTLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(MTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rkDisplayReportMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MTLayout.createSequentialGroup()
                        .addComponent(rkMonthMT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(rkYearMT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        MTLayout.setVerticalGroup(
            MTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rkMonthMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rkYearMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rkDisplayReportMT)
                .addContainerGap())
        );

        jTabbedPane1.addTab("MT", MT);

        rkYearCon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099" }));
        rkYearCon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rkYearMonthConItemStateChanged(evt);
            }
        });

        rkMonthCon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        rkMonthCon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rkYearMonthConItemStateChanged(evt);
            }
        });

        rkDisplayReportCon.setText("Display Report");
        rkDisplayReportCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rkDisplayReportConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConLayout = new javax.swing.GroupLayout(Con);
        Con.setLayout(ConLayout);
        ConLayout.setHorizontalGroup(
            ConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rkDisplayReportCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ConLayout.createSequentialGroup()
                        .addComponent(rkMonthCon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(rkYearCon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        ConLayout.setVerticalGroup(
            ConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rkMonthCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rkYearCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rkDisplayReportCon)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Con", Con);

        rkYearSecu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099" }));
        rkYearSecu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rkYearMonthSecuItemStateChanged(evt);
            }
        });

        rkMonthSecu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        rkMonthSecu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rkYearMonthSecuItemStateChanged(evt);
            }
        });

        rkDisplayReportSecu.setText("Display Report");
        rkDisplayReportSecu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rkDisplayReportSecuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SecuLayout = new javax.swing.GroupLayout(Secu);
        Secu.setLayout(SecuLayout);
        SecuLayout.setHorizontalGroup(
            SecuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(SecuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rkDisplayReportSecu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SecuLayout.createSequentialGroup()
                        .addComponent(rkMonthSecu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(rkYearSecu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        SecuLayout.setVerticalGroup(
            SecuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SecuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SecuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rkMonthSecu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rkYearSecu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rkDisplayReportSecu)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Secu", Secu);

        rkYearDSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099" }));
        rkYearDSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rkYearMonthDSPItemStateChanged(evt);
            }
        });

        rkMonthDSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        rkMonthDSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rkYearMonthDSPItemStateChanged(evt);
            }
        });

        rkDisplayReportDSP.setText("Display Report");
        rkDisplayReportDSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rkDisplayReportDSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DSPLayout = new javax.swing.GroupLayout(DSP);
        DSP.setLayout(DSPLayout);
        DSPLayout.setHorizontalGroup(
            DSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DSPLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(DSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rkDisplayReportDSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DSPLayout.createSequentialGroup()
                        .addComponent(rkMonthDSP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(rkYearDSP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        DSPLayout.setVerticalGroup(
            DSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rkMonthDSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rkYearDSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rkDisplayReportDSP)
                .addContainerGap())
        );

        jTabbedPane1.addTab("DPS", DSP);

        rkYearNon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099" }));
        rkYearNon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rkYearMonthNonItemStateChanged(evt);
            }
        });

        rkMonthNon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        rkMonthNon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rkYearMonthNonItemStateChanged(evt);
            }
        });

        rkDisplayReportNon.setText("Display Report");
        rkDisplayReportNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rkDisplayReportNonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NONLayout = new javax.swing.GroupLayout(NON);
        NON.setLayout(NONLayout);
        NONLayout.setHorizontalGroup(
            NONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NONLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(NONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rkDisplayReportNon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(NONLayout.createSequentialGroup()
                        .addComponent(rkMonthNon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(rkYearNon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        NONLayout.setVerticalGroup(
            NONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NONLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rkMonthNon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rkYearNon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rkDisplayReportNon)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Non Rec", NON);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rkDisplayReportMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rkDisplayReportMTActionPerformed
        try {
            if (rkMonthMT.getSelectedIndex() > 0 && rkYearMT.getSelectedIndex()>0) {
                Map param = new HashMap();
                param.put("rkMonth", rkMonthMT.getSelectedItem());
                param.put("rkYear", rkYearMT.getSelectedItem());
                
             
                String report = new File("").getAbsolutePath() + "\\src\\RKinfotech\\Reports\\RKclinicalMT.jrxml";
                //String report = new File("").getAbsolutePath() + "/src/RKinfotech/Reports/RKclinicalMT.jrxml";
                JasperReport jasperReport = JasperCompileManager.compileReport(report);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param, rkConnection.rkConnection());
                JasperViewer.viewReport(jasperPrint, false);
            }
        } catch (JRException e) {
            javax.swing.JOptionPane.showMessageDialog(this,rkValidation.printErrorStatic("Jasper Report", e.getMessage()));
        }
    }//GEN-LAST:event_rkDisplayReportMTActionPerformed

    private void rkDisplayReportConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rkDisplayReportConActionPerformed
        try {
            if (rkMonthCon.getSelectedIndex() > 0 && rkYearCon.getSelectedIndex()>0) {
                Map param = new HashMap();
                param.put("rkMonth", rkMonthCon.getSelectedItem());
                param.put("rkYear", rkYearCon.getSelectedItem());
                String report = new File("").getAbsolutePath() + "\\src\\RKinfotech\\Reports\\RKclinicalContr.jrxml";
                JasperReport jasperReport = JasperCompileManager.compileReport(report);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param, rkConnection.rkConnection());
                JasperViewer.viewReport(jasperPrint, false);
            }
        } catch (JRException e) {
            javax.swing.JOptionPane.showMessageDialog(this,rkValidation.printErrorStatic("Jasper Report", e.getMessage()));
        }
    }//GEN-LAST:event_rkDisplayReportConActionPerformed

    private void rkDisplayReportSecuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rkDisplayReportSecuActionPerformed
        System.out.println("Secus");
        try {
            if (rkMonthSecu.getSelectedIndex() > 0 && rkYearSecu.getSelectedIndex()>0) {
                Map param = new HashMap();
                param.put("rkMonth", rkMonthSecu.getSelectedItem());
                param.put("rkYear", rkYearSecu.getSelectedItem());
                
                String report = new File("").getAbsolutePath() + "\\src\\RKinfotech\\Reports\\RKclinicalSecu.jrxml";
                //String report = new File("").getAbsolutePath() + "/src/RKinfotech/Reports/RKclinicalSecu.jrxml";
                JasperReport jasperReport = JasperCompileManager.compileReport(report);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param, rkConnection.rkConnection());
                JasperViewer.viewReport(jasperPrint, false);
            }
        } catch (JRException e) {
            javax.swing.JOptionPane.showMessageDialog(this,rkValidation.printErrorStatic("Jasper Report", e.getMessage()));
        }
    }//GEN-LAST:event_rkDisplayReportSecuActionPerformed

    private void rkDisplayReportDSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rkDisplayReportDSPActionPerformed
       System.out.println("DPS");
        try {
            if (rkMonthDSP.getSelectedIndex() > 0 && rkYearDSP.getSelectedIndex()>0) {
                Map param = new HashMap();
                param.put("rkMonth", rkMonthDSP.getSelectedItem());
                param.put("rkYear", rkYearDSP.getSelectedItem());
                System.out.println(param.get("rkMonth"));
                System.out.println(param.get("rkYear"));
                
                
                //String report = new File("").getAbsolutePath() + "/src/RKinfotech/Reports/RKclinicalDSP.jrxml";
                String report = new File("").getAbsolutePath() + "\\src\\RKinfotech\\Reports\\RKclinicalDSP.jrxml";
                JasperReport jasperReport = JasperCompileManager.compileReport(report);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param, rkConnection.rkConnection());
                JasperViewer.viewReport(jasperPrint, false);
            }
        } catch (JRException e) {
            javax.swing.JOptionPane.showMessageDialog(this,rkValidation.printErrorStatic("Jasper Report", e.getMessage()));
        }
    }//GEN-LAST:event_rkDisplayReportDSPActionPerformed

    private void rkDisplayReportNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rkDisplayReportNonActionPerformed
        try {
            if (rkMonthNon.getSelectedIndex() > 0 && rkYearCon.getSelectedIndex()>0) {
                Map param = new HashMap();
                param.put("rkMonth", rkMonthNon.getSelectedItem());
                param.put("rkYear", rkYearNon.getSelectedItem());
                String report = new File("").getAbsolutePath() + "\\src\\RKinfotech\\Reports\\RKclinicalNon.jrxml";
                //String report = new File("").getAbsolutePath() + "/src/RKinfotech/Reports/RKclinicalNon.jrxml";
                JasperReport jasperReport = JasperCompileManager.compileReport(report);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param, rkConnection.rkConnection());
                JasperViewer.viewReport(jasperPrint, false);
            }
        } catch (JRException e) {
            javax.swing.JOptionPane.showMessageDialog(this,rkValidation.printErrorStatic("Jasper Report", e.getMessage()));
        }
    }//GEN-LAST:event_rkDisplayReportNonActionPerformed

    private void rkMonthYearMTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rkMonthYearMTItemStateChanged
        try {
            if(rkMonthMT.getSelectedIndex()>0 && rkYearMT.getSelectedIndex()>0)
            {
                year = (String) rkYearMT.getSelectedItem();
                month = (String) rkMonthMT.getSelectedItem();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_rkMonthYearMTItemStateChanged

    private void rkYearMonthConItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rkYearMonthConItemStateChanged
       try {
           if(rkMonthCon.getSelectedIndex()>0 && rkYearCon.getSelectedIndex()>0)
            { 
                year = (String) rkYearCon.getSelectedItem();
                month = (String) rkMonthCon.getSelectedItem();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_rkYearMonthConItemStateChanged

    private void rkYearMonthSecuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rkYearMonthSecuItemStateChanged
        try {
            if(rkMonthSecu.getSelectedIndex()>0 && rkYearSecu.getSelectedIndex()>0)
            {
                year = (String) rkYearSecu.getSelectedItem();
                month = (String) rkMonthSecu.getSelectedItem();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_rkYearMonthSecuItemStateChanged

    private void rkYearMonthDSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rkYearMonthDSPItemStateChanged
        try {
            if(rkMonthDSP.getSelectedIndex()>0 && rkYearDSP.getSelectedIndex()>0)
            {
                year = (String) rkYearDSP.getSelectedItem();
                month = (String) rkMonthDSP.getSelectedItem();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_rkYearMonthDSPItemStateChanged

    private void rkYearMonthNonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rkYearMonthNonItemStateChanged
        try {
            if(rkMonthNon.getSelectedIndex()>0 && rkYearNon.getSelectedIndex()>0)
            {
                year = (String) rkYearNon.getSelectedItem();
                month = (String) rkMonthNon.getSelectedItem();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_rkYearMonthNonItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Con;
    private javax.swing.JPanel DSP;
    private javax.swing.JPanel MT;
    private javax.swing.JPanel NON;
    private javax.swing.JPanel Secu;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton rkDisplayReportCon;
    private javax.swing.JButton rkDisplayReportDSP;
    private javax.swing.JButton rkDisplayReportMT;
    private javax.swing.JButton rkDisplayReportNon;
    private javax.swing.JButton rkDisplayReportSecu;
    private javax.swing.JComboBox<String> rkMonthCon;
    private javax.swing.JComboBox<String> rkMonthDSP;
    private javax.swing.JComboBox<String> rkMonthMT;
    private javax.swing.JComboBox<String> rkMonthNon;
    private javax.swing.JComboBox<String> rkMonthSecu;
    private javax.swing.JComboBox<String> rkYearCon;
    private javax.swing.JComboBox<String> rkYearDSP;
    private javax.swing.JComboBox<String> rkYearMT;
    private javax.swing.JComboBox<String> rkYearNon;
    private javax.swing.JComboBox<String> rkYearSecu;
    // End of variables declaration//GEN-END:variables
    rkDatabase db = new rkDatabase();
    private String year,month;
}