/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.15.0.963 modeling language!*/

package org.jhotdraw.samples.svg.gui;
import java.beans.*;
import java.util.prefs.*;
import javax.swing.border.*;
import org.jhotdraw.gui.*;
import org.jhotdraw.samples.svg.*;
import org.jhotdraw.undo.*;
import org.jhotdraw.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import org.jhotdraw.app.action.*;
import org.jhotdraw.draw.*;
import org.jhotdraw.draw.action.*;
import org.jhotdraw.samples.svg.action.*;
import org.jhotdraw.samples.svg.figures.*;
import org.jhotdraw.samples.svg.SVGAttributeKeys.*;

public class SummaryToolBar
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SummaryToolBar()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  private ResourceBundleUtil labels;
// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField summaryField;
private javax.swing.JLabel summaryLabel;
public String getSummary() {
        return summaryField.getText();
    }
/** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        summaryLabel = new javax.swing.JLabel();
        summaryField = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setFloatable(false);
        setOpaque(false);

        summaryLabel.setFont(new java.awt.Font("Dialog", 0, 11));
        summaryLabel.setText(labels.getString("summary")); // NOI18N
        add(summaryLabel);

        summaryField.setFont(new java.awt.Font("DialogInput", 0, 11));
        add(summaryField);
    }// </editor-fold>//GEN-END:initComponents
}